// https://school.programmers.co.kr/learn/courses/30/lessons/12916

class Solution {
  boolean solution(String s) {
      int countP = 0, countY = 0;
      
      for(int i = 0; i < s.length(); i++) {
          char ch = s.charAt(i);
          
          if(ch == 'p' || ch == 'P')
              countP++;
          if(ch == 'y' || ch == 'Y')
              countY++;
      }
      
      if(countP != countY)
          return false;
      return true;
  }
}