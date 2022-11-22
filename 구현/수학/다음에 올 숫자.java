class Solution {
  public int solution(int[] common) {
    int answer = 0;

    int size = common.length;
    int x1 = common[size - 3];
    int x2 = common[size - 2];
    int x3 = common[size - 1];

    if (isAdd(x1, x2, x3)) {
      answer = add(x2, x3);
      return answer;
    }

    if (isMul(x1, x2, x3)) {
      answer = mul(x2, x3);
    }
    return answer;
  }

  private boolean isAdd(int x1, int x2, int x3) {
    if ((x2 - x1) == (x3 - x2)) {
      return true;
    }
    return false;
  }

  private boolean isMul(int x1, int x2, int x3) {
    try {
      if ((x3 / x2) == (x2 / x1)) {
        return true;
      }
    } catch (Exception e) {
      return false;
    }
    return false;
  }

  private int add(int x2, int x3) {
    return x3 + (x3 - x2);
  }

  private int mul(int x2, int x3) {
    return x3 * (x3 / x2);
  }
}