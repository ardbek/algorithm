import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<Integer>();

        Scanner sc = new Scanner(System.in);

        int K = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(sc.nextLine());

            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }

        int sum = 0;
        for (int o : stack) {
            sum += o;
        }
        System.out.println(sum);
    }
}
