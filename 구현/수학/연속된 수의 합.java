class Solution {
  public int[] solution(int num, int total) {
    int[] answer = {};
    for (int i = -1000; i <= total; i++) {
      if (isValid(i, num, total)) {
        answer = makeAnswer(i, num);
        break;
      }
    }
    return answer;
  }

  private boolean isValid(int x, int num, int total) {
    int sum = 0;
    for (int i = 0; i < num; i++) {
      sum += x;
      x++;
    }

    if (total == sum) {
      return true;
    }
    return false;
  }

  private int[] makeAnswer(int x, int num) {
    int[] answer = new int[num];
    for (int i = 0; i < num; i++) {
      answer[i] = x;
      x++;
    }
    return answer;
  }
}