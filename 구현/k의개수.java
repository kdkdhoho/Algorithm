class Solution {
    int answer = 0;

    public int solution(int i, int j, int k) {
        for (int num = i; num <= j; num++) {
            int target = num;
            while (target > 0) {
                int digit = target % 10;

                if (digit == k) {
                    answer++;
                }
                target /= 10;
            }
        }
        return answer;
    }
}