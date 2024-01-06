import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 1, start = 1, end = 1, cnt = 1;

        while (start != n) {
            if (n == sum) {
                cnt++;
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;
            }
            else{
                end++;
                sum += end;
            }
        }

        System.out.println(cnt);

    }
}
