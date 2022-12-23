class Solution {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int answer0, answer1;

        if (num1 == num2) {
            answer0 = denum1 + denum2;
            answer1 = num1;
        }

        answer1 = (num1 * num2) / gcd(num1, num2);
        answer0 = (denum1 * (answer1 / num1)) + (denum2 * (answer1 / num2));

        return divide(answer0, answer1);
    }

    private int gcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private int[] divide(int denum, int num) {
        int flag = gcd(denum, num);

        if (flag != 1) {
            return divide(denum / flag, num / flag);
        }

        return new int[]{denum, num};
    }
}