// https://school.programmers.co.kr/learn/courses/30/lessons/60057

import java.util.*;

class Solution {
  public int solution(String s) {
    int answer = Integer.MAX_VALUE;

    for (int criteria = 1; criteria <= s.length(); criteria++) {
      LinkedList<String> queue = new LinkedList<>();
      String result = "";

      // 기준만큼 문자열 잘라서 큐에 삽입
      for (int i = 0; i < s.length(); i += criteria) {
        if (i + criteria > s.length())
          queue.add(s.substring(i));
        else
          queue.add(s.substring(i, i + criteria));

      }

      // 맨 처음꺼 빼고, count 1로 초기화
      String tmp = queue.pop();
      int count = 1;

      // 큐가 빌 때까지 로직 실행
      while (!queue.isEmpty()) {
        String peek = queue.peek();

        if (peek.length() < criteria) {
          result += peek;
          queue.pop();
          continue;
        }

        // 같으면 count++, queue에서 빼기
        if (tmp.equals(peek)) {
          count++;
          queue.pop();
        }
        // 다르면 tmp 갱신 및 count = 1 해주고, 큐에서 빼기
        else {
          // count랑 tmp 조합해서 result에 넣어주고
          if (count > 1) {
            result += (Integer.toString(count) + tmp);
          } else {
            result += tmp;
          }

          // tmp 갱신 및 count = 1
          tmp = peek;
          count = 1;

          // 큐에서 빼주기
          queue.pop();
        }
      }
      if (count > 1)
        result += (Integer.toString(count) + tmp);
      else
        result += tmp;

      // answer 갱신
      answer = Math.min(answer, result.length());
    }

    return answer;
  }
}