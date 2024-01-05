import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr_num = new int[9];
        int sum=0, result1 = 0, result2 =0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(sc.nextLine());
            arr_num[i] = n;
            sum += n;
        }

        sum -= 100;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (arr_num[i] + arr_num[j] == sum) {
                    result1 = arr_num[i];
                    result2 = arr_num[j];
                }
            }
        }

        Arrays.sort(arr_num);

        for (int i : arr_num) {
            if (i == result1 || i == result2) {
                continue;
            }
            System.out.println(i);
        }

    }

}
