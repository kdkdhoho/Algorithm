import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            char word = my_string.charAt(i);

            if (Character.isDigit(word)) {
                answer.add(Character.digit(word, 10));
            }
        }

        Collections.sort(answer);
        return answer.stream()
                .mapToInt(Integer::new)
                .toArray();
    }
}