import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] paper = new int[100][100]; // 전체 영역
        int result = 0;

        int roopCnt = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < roopCnt; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    paper[x+j][y+k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                result+=paper[i][j];
            }
        }

        System.out.println(result);

    }
}