import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().trim();
        }

        Set<String> uniqueSet = new HashSet<>(Arrays.asList(arr));

        String[] uniqueArr = uniqueSet.toArray(new String[0]);

        Arrays.sort(uniqueArr, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        for (String s : uniqueArr) {
            System.out.println(s);
        }
    }
}
