import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] myArr;
    static int[] correctArr;
    static int result;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        char[] arr = new char[s]; 
        correctArr = new int[4]; 
        myArr = new int[4]; 

        result = 0; 
        int cnt = 0; 

        st = new StringTokenizer(br.readLine());
        arr = st.nextToken().toCharArray(); 

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            correctArr[i] = Integer.parseInt(st.nextToken());
            if (correctArr[i] == 0) {
                result++;
            }
        }

        for (int i = 0; i < p; i++) {
            add(arr[i]);
        }
        if(result == 4) cnt++;

        for (int i = p; i < s; i++) {
            int j = i-p;
            add(arr[i]);
            remove(arr[j]);
            if(result == 4) cnt++;
        }

        System.out.println(cnt);
    }

    private static void remove(char c) {
        switch (c){
            case 'A':
                if (correctArr[0] == myArr[0]) {
                    result--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (correctArr[1] == myArr[1]) {
                    result--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (correctArr[2] == myArr[2]) {
                    result--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (correctArr[3] == myArr[3]) {
                    result--;
                }
                myArr[3]--;
                break;
        }
    }

    private static void add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if (correctArr[0] == myArr[0]) {
                    result++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (correctArr[1] == myArr[1]) {
                    result++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (correctArr[2] == myArr[2]) {
                    result++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (correctArr[3] == myArr[3]) {
                    result++;
                }
                break;
        }
    }
}
