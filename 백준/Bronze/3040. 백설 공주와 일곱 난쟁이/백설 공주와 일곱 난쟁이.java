import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum=0, n1=0,n2=0;
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(sc.nextLine());
            arr[i] = n;
            sum += n;
        }

        sum -= 100;

        for (int i=0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sum == arr[i] + arr[j]) {
                    n1 = arr[i];
                    n2 = arr[j];
                    break;
                }
            }
        }

        for (int i : arr) {
            if (i != n1 && i != n2) {
                System.out.println(i);
            }
        }

    }
}
