import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int num = 666;

        while (true) {

            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
            if (cnt == n) {
                break;
            }
            num++;
        }

        System.out.println(num);

    }

}
