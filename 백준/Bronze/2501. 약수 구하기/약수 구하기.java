
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {
            if (n % (i) == 0) {
                list.add(i);
            }
        }

        if (k > list.size()) {
            System.out.println(0);
        } else {
            System.out.println(list.get(k-1));;
        }


    }
}
