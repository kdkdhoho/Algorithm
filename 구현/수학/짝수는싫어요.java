import java.util.List;
import java.util.ArrayList;

class Solution {
    List<Integer> answer = new ArrayList<>();

    public int[] solution(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer.add(i);
            }
        }
        return answer.stream()
                .mapToInt(x -> x)
                .toArray();
    }
}