import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int temp = 0;
        int sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                for (int j = n-1; j >= 0; j--) {
                    if (arr[j] != 0) {
                        sum -= arr[j];
                        arr[j] = 0;
                        break;
                    }
                }
            }
            arr[i] = temp;
            sum += temp;
        }
        System.out.println(sum);
    }
}
