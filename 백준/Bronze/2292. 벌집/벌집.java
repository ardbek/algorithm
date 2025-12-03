import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxNum = 1;
        int moveCnt = 1;

        while (true) {

            if (n == 1) {
                break;
            }

            maxNum += moveCnt * 6;
            moveCnt++;
            if (maxNum >= n) {
                break;
            }
        }

        System.out.println(moveCnt);

    }
}