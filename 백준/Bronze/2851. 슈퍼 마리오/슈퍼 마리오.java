import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0,max=0,min=0;
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 10; i++) {
            sum += arr[i];

            if (sum < 100) {
                min = sum;
                max = min;
            } else {
                max = sum;
                break;
            }
        }

        if (min <= 100) {
            if (100 - min < max - 100) {
                System.out.println(min);
            } else {
                System.out.println(max);
            }
        } else {
            System.out.println(min);
        }

    }

}
