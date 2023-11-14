import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            cnt = 0;

            for (char c : arr) {
                if (c == '(') {
                    cnt++;
                }else{
                    cnt--;
                }
                if(cnt < 0) break;
            }

            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
