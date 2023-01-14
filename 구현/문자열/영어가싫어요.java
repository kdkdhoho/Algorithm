import java.util.Map;

class Solution {
    Map<String, Integer> words = Map.of("zero", 0, "one", 1, "two", 2, "three", 3, "four", 4, "five", 5,
            "six", 6, "seven", 7, "eight", 8, "nine", 9);
    StringBuilder answer = new StringBuilder();

    public long solution(String numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numbers.length(); i++) {
            String substring = numbers.substring(i, i + 1);
            stringBuilder.append(substring);

            if (words.containsKey(stringBuilder.toString())) {
                answer.append(words.get(stringBuilder.toString()));
                stringBuilder.setLength(0);
            }
        }

        return Long.parseLong(answer.toString());
    }
}