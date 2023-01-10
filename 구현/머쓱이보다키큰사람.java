import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        long answer = Arrays.stream(array)
                .filter(num -> num > height)
                .count();
        return (int)answer;
    }
}