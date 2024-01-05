import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> smallDivisors = new ArrayList<>();
        List<Integer> largeDivisors = new ArrayList<>();

        int sqrtN = (int)Math.sqrt(n);

        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                smallDivisors.add(i);
                if (i != n / i) {
                    largeDivisors.add(0, n / i);
                }
            }
        }

        smallDivisors.addAll(largeDivisors);

        if (k > smallDivisors.size()) {
            System.out.println(0);
        } else {
            System.out.println(smallDivisors.get(k - 1));
        }
    }
}