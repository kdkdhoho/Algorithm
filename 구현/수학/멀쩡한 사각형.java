// https://school.programmers.co.kr/learn/courses/30/lessons/62048?language=java

class Solution {
  public long solution(int w, int h) {
    long answer = 1;

    Long width = Long.valueOf(w);
    Long height = Long.valueOf(h);

    answer = width * height - (width + height - GCD(width, height));

    return answer;
  }

  long GCD(long width, long height) {
    if (height == 0)
      return width;
    return GCD(height, width % height);
  }
}