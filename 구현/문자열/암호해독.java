class Solution {
    StringBuilder answer = new StringBuilder();

    public String solution(String cipher, int code) {
        for (int i = code - 1; i < cipher.length(); i += code) {
            answer.append(cipher.substring(i, i + 1));
        }
        return answer.toString();
    }
}