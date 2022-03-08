// https://programmers.co.kr/learn/courses/30/lessons/42862

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        // 오름차순 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 제한 사항 마지막 case 탐색
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    reserve[j] = -2; // 빌려줌
                    lost[i] = 0; // 0 처리
                    break;
                }
            }
        }
        
        // 모든 lost와 모든 reserve에 대해 접근
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                // lost가 빌리는 경우
                if(lost[i] > 0 && reserve[j] > 0) {
                    if(reserve[j] == lost[i] - 1) {
                        reserve[j] = -2;
                        lost[i] = 0;
                        break;
                    }
                else if(reserve[j] == lost[i] + 1) {
                        reserve[j] = -2;
                        lost[i] = 0;
                        break;
                    }
                }
            }
        }
        
        for(int check : lost)
            if(check == 0)
                answer++;
        
        return answer;
    }
}