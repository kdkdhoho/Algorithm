// https://programmers.co.kr/learn/courses/30/lessons/42584

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int second = 0;
        int index;
        
        for(int i = 0; i < prices.length - 1; i++) {
            int tmp = prices[i];
            
            for(int j = i + 1; j < prices.length; j++) {
                second++;
                
                if(prices[j] >= tmp)
                    continue;
                else
                    break;
            }
            
            answer[i] = second;
            second = 0;
        }
        answer[prices.length - 1] = 0;
        
        return answer;
    }
}