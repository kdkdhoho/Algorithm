import java.util.Arrays;

class Solution {
    int minGap = Integer.MAX_VALUE;
    int answer = 0;

    public int solution(int[] array, int n) {
        Arrays.sort(array);

        for (int num : array) {
            int gap = Math.abs(num - n);

            if (gap < minGap) {
                minGap = gap;
                answer = num;
            }
        }
        return answer;
    }
}