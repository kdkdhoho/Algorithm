class Solution {
    int answer = 0;

    public int solution(String input) {
        String[] words = input.split(" ");
        int lastNumber = 0;

        for (String word : words) {
            if (isDigit(word)) {
                lastNumber = Integer.parseInt(word);
                answer += Integer.parseInt(word);
                continue;
            }

            answer -= lastNumber;
        }
        return answer;
    }

    private boolean isDigit(String word) {
        try {
            Integer.parseInt(word);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}