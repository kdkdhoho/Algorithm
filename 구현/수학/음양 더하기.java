// https://school.programmers.co.kr/learn/courses/30/lessons/76501?language=java

class Solution {
  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;

    for (int i = 0; i < absolutes.length; i++) {
      if (signs[i])
        answer += absolutes[i];
      else
        answer += (-1 * absolutes[i]);
    }

    return answer;
  }
}
