import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int result = 0;
        int max = 0;
        int[] arr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = cnt-1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                result++;
            }
        }

        System.out.println(result);
    }
}
