import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String before, String after) {
        List<String> beforeStore = new ArrayList<>(List.of(before.split("")));

        for (int i = 0; i < after.length(); i++) {
            String word = after.substring(i, i + 1);

            if (beforeStore.contains(word)) {
                beforeStore.remove(word);
            }
        }

        if (beforeStore.size() > 0) {
            return 0;
        }
        return 1;
    }
}