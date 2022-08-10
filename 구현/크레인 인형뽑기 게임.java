// https://school.programmers.co.kr/learn/courses/30/lessons/64061?language=java
import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int top = 0;
        int answer = 0;
        
        for(int i = 0; i < moves.length; i++) {
            int dropline = moves[i] - 1;
            
            for(int y = 0; y < board.length; y++) {
                if(board[y][dropline] != 0) {
                    int doll = board[y][dropline];
                    board[y][dropline] = 0;
                    
                    if(doll == top) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }
                    
                    if(stack.size() == 0)
                        top = 0;
                    else
                        top = stack.peek();
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}