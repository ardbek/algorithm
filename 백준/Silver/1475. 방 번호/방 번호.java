import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int[] arr2 = new int[10];
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i] - '0']++;
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i == 6 || i == 9) {
                sum = arr2[6] + arr2[9];
                sum = (sum + 1) / 2; // 수정된 부분
                if (sum > max) {
                    max = sum;
                }
            } else if (arr2[i] > max) {
                max = arr2[i];
            }
        }

        System.out.println(max);
    }
}
