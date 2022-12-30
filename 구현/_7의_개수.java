class Solution {
    private static final int TARGET_NUMBER = 7;
    private static final int UNIT = 10;
    private int answer = 0;

    public int solution(int[] array) {
        for (int num : array) {
            while (num > 0) {
                int digit = num % UNIT;

                if (digit == TARGET_NUMBER) {
                    answer++;
                }

                num /= UNIT;
            }
        }

        return answer;
    }
}