// https://school.programmers.co.kr/learn/courses/30/lessons/12904
// 효율성 2번은 실패

class Solution {
    int answer = 0;
    
    public int solution(String s) {
        char[] arr = s.toCharArray();
        int k;
        
        for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                
                int tmp = 0;
                
                for(k = j; k <= (j+i)/2; k++) {
                    if(arr[k] != arr[i-tmp])
                        break;
                    
                    tmp++;
                }
                
                if(k > (j+i)/2)
                    answer = Math.max(answer, (i-j+1));
            }
        }
        
        return answer;
    }
}