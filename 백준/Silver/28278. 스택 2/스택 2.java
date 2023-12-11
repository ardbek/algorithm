import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            switch (x) {
                case 1:
                    int inputNum = Integer.parseInt(st.nextToken());
                    stack.push(inputNum);
                    break;
                case 2:
                    if (stack.empty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if (stack.empty()) {
                        sb.append("1").append("\n");
                    } else{
                        sb.append("0").append("\n");
                    }
                    break;
                case 5:
                    if (stack.empty()) {
                        sb.append("-1").append("\n");
                    } else{
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }

        }
        System.out.println(sb.toString());

    }
}