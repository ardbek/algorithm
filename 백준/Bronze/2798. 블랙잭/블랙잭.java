import java.io.*;
import java.util.*;

public class Main {

    static void findCombinations(int[] arr, int start, int n, int m, int depth, int sum, List<Integer> list) {
        if (depth == 3) {
            if (sum <= m) {
                list.add(sum);
            }
            return;
        }

        for (int i = start; i < n; i++) {
            findCombinations(arr, i + 1, n, m, depth + 1, sum + arr[i], list);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        findCombinations(arr, 0, n, m, 0, 0, list);

        if (!list.isEmpty()) {
            int maxSum = Collections.max(list);
            System.out.println(maxSum);
        }
    }
}
