class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] words = my_string.toCharArray();
        char tmp = words[num1];
        words[num1] = words[num2];
        words[num2] = tmp;
        return new String(words);
    }
}