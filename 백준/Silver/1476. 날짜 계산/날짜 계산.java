import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = 0, E = 0, S = 0, M = 0;
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while (true) {

            E++;
            S++;
            M++;
            year++;

            if (E == 16) E = 1;
            if (S == 29) S = 1;
            if (M == 20) M = 1;

            if (e == E && s == S && m == M) break;
        }

        System.out.println(year);

    }

}
