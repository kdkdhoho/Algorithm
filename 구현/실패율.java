// https://school.programmers.co.kr/learn/courses/30/lessons/42889?language=java

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] fail = new int[N + 1];
        int[] total = new int[N + 1];
        double[] failRatio = new double[N];

        for (int i = 0; i < stages.length; i++)
            fail[stages[i] - 1]++;

        total[N] = fail[N];
        for (int i = fail.length - 2; i >= 0; i--)
            total[i] = total[i + 1] + fail[i];

        for (int i = 0; i < failRatio.length; i++) {
            if (total[i] == 0)
                failRatio[i] = 0;
            else
                failRatio[i] = (double) fail[i] / (double) total[i];
        }

        int[] answer = new int[N];
        int idx = 0;
        int maxIdx = -1;
        for (int i = 0; i < failRatio.length; i++) {
            double max = -Double.MIN_VALUE;

            for (int j = 0; j < failRatio.length; j++) {
                if (failRatio[j] < 0)
                    continue;

                if (failRatio[j] > max) {
                    max = failRatio[j];
                    maxIdx = j;
                }
            }

            answer[idx++] = maxIdx + 1;
            failRatio[maxIdx] = -1;
        }

        return answer;
    }
}