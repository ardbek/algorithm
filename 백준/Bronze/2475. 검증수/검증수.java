import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = 0;
        int result = 0;

        for (int i = 0; i < 5; i++) {
            n = Integer.parseInt(st.nextToken());
            result += n*n;
        }

        System.out.println(result%10);
    }
}
