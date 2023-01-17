class Solution {
    int answer = 0;

    public int solution(String my_string) {
        char[] words = my_string.toCharArray();
        for (char word : words) {
            if (Character.isDigit(word)) {
                answer += Character.getNumericValue(word);
            }
        }
        return answer;
    }
}