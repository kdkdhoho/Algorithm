import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();

        int i = 0;
        try {
            for (i = 0; i < my_str.length(); i += n) {
                String sub = my_str.substring(i, i + n);
                answer.add(sub);
            }
        } catch (Exception e) {
            String sub = my_str.substring(i, my_str.length());
            answer.add(sub);
        }

        return answer.toArray(new String[i/n]);
    }
}