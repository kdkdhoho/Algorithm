import java.util.*;

class Solution {
    int[] cutArray(int[] array, int i, int j) {
        int n = j - i + 1;
        int[] result = new int[n];
        int index = i - 1;
        
        for(int k = 0; k < n; k++) {
            result[k] = array[index];
            index++;
        }
        
        return result;
    }
    
    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        
        for(int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            // 1. 배열 추출
            int[] tmp = cutArray(array, i, j);

            // 2. 정렬
            Arrays.sort(tmp);
            
            // 3. k번 째 데이터 삽입
            answer[a] = tmp[k - 1];
        }
        
        return answer;
    }
}