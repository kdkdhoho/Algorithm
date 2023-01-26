class Solution {
    final int MAX_SIZE = 3_628_800;

    int answer = Integer.MIN_VALUE;

    public int solution(int n) {
        int i = 1;
        while (true) {
            int multipledNum = factorial(i);

            if (multipledNum > MAX_SIZE) {
                break;
            }
            if (multipledNum <= n && multipledNum > answer) {
                answer = i;
            }
            i++;
        }
        return answer;
    }

    private int factorial(int i) {
        if (i == 1) {
            return i;
        }
        return i * factorial(i-1);
    }
}