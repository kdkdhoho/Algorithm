import java.util.*;

class Solution {
    int answer = 0;

    public int solution(int[] sides) {
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];

        for (int c = 1; c <= b; c++) {
            if (a + c > b) {
                answer++;
            }
        }

        for (int c = b+1; c < a+b; c++) {
            answer++;
        }
        return answer;
    }
}