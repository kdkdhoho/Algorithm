class Solution {
    String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public long solution(String numbers) {
        for (int i = 0; i < words.length; i++) {
            numbers = numbers.replaceAll(words[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}