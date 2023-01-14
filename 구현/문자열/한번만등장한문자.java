import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    private Set<Character> used = new HashSet<>();
    private List<String> answer = new ArrayList<>();

    public String solution(String s) {
        for (char word : s.toCharArray()) {
            if (!used.contains(word)) {
                used.add(word);
                answer.add(Character.toString(word));
                continue;
            }
            answer.remove(Character.toString(word));
        }

        return answer.stream()
                .sorted()
                .collect(Collectors.joining());
    }
}