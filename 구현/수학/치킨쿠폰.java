class Solution {
    int answer = 0;

    public int solution(int chicken) {
        int coupon = chicken;

        while (coupon >= 10) {
            answer += coupon / 10;
            coupon = (coupon % 10) + (coupon / 10);
        }
        return answer;
    }
}