import java.util.*;
import java.util.regex.*;

class Solution {
    
    List<String> tokens = new ArrayList<>(List.of("aya", "ye", "woo", "ma"));
    
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String data : babbling) {
            for (String token : tokens) {
                if (data.contains(token)) {
                    data = data.replace(token, "1");
                }
            }
            
            Pattern pattern = Pattern.compile("\\D");
            Matcher matcher = pattern.matcher(data);
            if (matcher.find()) {
                continue;
            }
            
            answer++;
        }
        
        return answer;
    }
}