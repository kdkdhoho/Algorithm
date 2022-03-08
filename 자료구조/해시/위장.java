// https://programmers.co.kr/learn/courses/30/lessons/42578

import java.util.*;

class Solution {
    Map<String, Integer> hashMap = new HashMap<>();
    int answer = 1;
    
    public int solution(String[][] clothes) {
        for(int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            
            hashMap.put(type, hashMap.getOrDefault(type, 0) + 1);
        }
        
        hashMap.forEach((k,v) -> {
            answer *= v+1;
        });
        answer -= 1;
        
        return answer;
    }
}