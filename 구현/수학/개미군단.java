class Solution {
    int[] attacks = {5, 3, 1};
    int answer = 0;

    public int solution(int hp) {
        for (int attack : attacks) {
            while (hp >= attack) {
                hp -= attack;
                answer++;
            }
        }
        return answer;
    }
}