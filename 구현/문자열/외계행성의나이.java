class Solution {
    private static final int ASCII_LOWER_A = 97;
    private static final int DIGIT = 10;

    private StringBuilder answer = new StringBuilder();

    public String solution(int age) {
        while (age > 0) {
            int digitNumber = age % DIGIT;
            char word = (char)(digitNumber + ASCII_LOWER_A);
            answer.append(word);
            age /= DIGIT;
        }
        return answer.reverse().toString();
    }
}