import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
                List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int temp = 0;
            while (true) {
                progresses[i] += speeds[i];
                temp++;
                if (progresses[i] >= 100) {
                    list.add(temp);
                    break;
                }
            }
        }

        int cnt = 1; // 배포 개수
        int maxDate = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (maxDate >= list.get(i)) {
                cnt++;
            } else {
                result.add(cnt);
                cnt = 1;
                maxDate = list.get(i);
            }
        }

        result.add(cnt);

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;

    }
}