import java.util.*;

class Solution {
    List<Integer> answer = new ArrayList<>();

    public int[] solution(int n) {
        for (int i = 1; i <= n; i++) {
            if (function(n, i) == i) {
                answer.add(i);
            }
        }

        return answer.stream()
                .mapToInt(x -> x)
                .toArray();
    }

    private int function(int a, int b) {
        if (a < b) {
            int tmp = a;
            b = a;
            a = tmp;
        }

        if (b == 0) {
            return a;
        }

        return function(b, a % b);
    }
}