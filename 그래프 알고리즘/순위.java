// https://programmers.co.kr/learn/courses/30/lessons/49191#
// 플로이드 와샬 알고리즘

public class 순위 {
  int answer = 0;

  public int solution(int n, int[][] results) {
    int[][] arr = new int[n][n];

    for (int i = 0; i < results.length; i++) {
      int w = results[i][0] - 1;
      int l = results[i][1] - 1;

      arr[w][l] = 1;
      arr[l][w] = -1;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          if (arr[i][k] == 1 && arr[k][j] == 1) {
            arr[i][j] = 1;
            arr[j][i] = -1;
          }
          if (arr[i][k] == -1 && arr[k][j] == -1) {
            arr[j][i] = 1;
            arr[i][j] = -1;
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {
      int cnt = 0;

      for (int j = 0; j < n; j++)
        if (arr[i][j] == 0)
          cnt++;

      if (cnt == 1)
        answer++;
    }

    return answer;
  }
}
