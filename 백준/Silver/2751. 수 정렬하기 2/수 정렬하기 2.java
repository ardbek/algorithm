import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(sc.nextLine()));
        }

        Collections.sort(list);

        for (Integer i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb.toString());

    }
}