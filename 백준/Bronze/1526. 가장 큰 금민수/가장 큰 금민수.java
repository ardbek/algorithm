import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 4; i <= n; i++) {
            if (checkNum(i) && i > result) {
                result = i;
            }
        }

        System.out.println(result);
    }

    public static boolean checkNum(int n) {

        while (n > 0) {
            int digit = n%10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

}
