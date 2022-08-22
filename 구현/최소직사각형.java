// https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=java 

class Solution {
    public int solution(int[][] sizes) {
        int max = Integer.MIN_VALUE;
        int min = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int a = sizes[i][0];
            int b = sizes[i][1];
            
            if(a < b) {
                min = Math.max(min, a);
                max = Math.max(max, b);
            }
            else if(a > b) {
                min = Math.max(min, b);
                max = Math.max(max, a);
            }
            else {
                max = Math.max(max, a);
                min = Math.max(min, a);
            }
        }
        
        int answer = min * max;
        return answer;
    }
}