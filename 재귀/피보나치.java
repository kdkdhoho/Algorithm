// https://programmers.co.kr/skill_checks#level2 - 2

class Solution {
  int[] table = new int[100001];

  public int solution(int n) {
    table[0] = 0;
    table[1] = 1;

    int answer = fibo(n);

    return answer;
  }

  public int fibo(int n) {
    if (n <= 1)
      return table[n];
    else if (table[n] != 0)
      return table[n];

    table[n] = (fibo(n - 2) + fibo(n - 1)) % 1234567;
    return table[n];
  }
}