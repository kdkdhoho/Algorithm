import java.util.*;

class Solution {
    String answer = "";
    
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> goal = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++) {
            if(goal.containsKey(participant[i])) // 중복되는 경우 value 1 추가
                goal.compute(participant[i], (k, v) -> v += 1);
            else
                goal.put(participant[i], 1); // 중복 아닌 경우 value 1
        }
        
        for(int i = 0; i < completion.length; i++) {
            if(goal.containsKey(completion[i]))
                goal.compute(completion[i], (k, v) -> v -= 1);
        }
        
        goal.forEach((key, value) -> {
            if(goal.get(key) != 0)
                answer = key;
        });
        
        return answer;
    }
}