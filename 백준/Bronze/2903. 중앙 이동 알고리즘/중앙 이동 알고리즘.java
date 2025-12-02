import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // n-1개 씩 늘어남
        Scanner sc = new Scanner(System.in);

        int roopCnt = sc.nextInt();
        int startNum = 2;
        for (int i =0; i< roopCnt; i++) {
            startNum = startNum + (startNum - 1);
        }

        System.out.println(startNum * startNum);

    }
}