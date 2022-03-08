// https://programmers.co.kr/learn/courses/30/lessons/43162

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        for(int i = 0; i < computers.length; i++) {
            for(int j = 0; j < computers[i].length; j++) {
                if(computers[i][j] == 1) {
                    answer++;
                    dfs(computers, i, j);
                }
            }
        }
        
        return answer;
    }

    void dfs(int[][] computers, int i, int j) {
        computers[i][j] = -1;
        
        for(int a = 0; a < computers[i].length; a++) {
            if(computers[i][a] == 1)
                dfs(computers, i, a);
        }
        for(int a = 0; a < computers.length; a++) {
            if(computers[a][j] == 1)
                dfs(computers, a , j);
        }
    }
}