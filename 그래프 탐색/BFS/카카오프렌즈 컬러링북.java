import java.util.*;

class Solution {

  int height, weight;
  boolean[][] isUsed;
  int[][] data;

  // 상 하 좌 우
  int[] moveRow = { -1, 1, 0, 0 };
  int[] moveCol = { 0, 0, -1, 1 };

  int numberOfArea = 0;
  int maxSizeOfOneArea = 0;
  int[] answer = new int[2];

  public int[] solution(int m, int n, int[][] picture) {
    height = m;
    weight = n;
    data = picture;
    isUsed = new boolean[height][weight];

    for (int row = 0; row < height; row++) {
      for (int col = 0; col < weight; col++) {
        if (picture[row][col] != 0 && !isUsed[row][col]) {
          numberOfArea++;
          maxSizeOfOneArea = Math.max(bfs(row, col), maxSizeOfOneArea);
        }
      }
    }

    answer[0] = numberOfArea;
    answer[1] = maxSizeOfOneArea;
    return answer;
  }

  public int bfs(int row, int col) {
    int cnt = 0;
    int num = data[row][col];

    LinkedList<Point> queue = new LinkedList<>();
    queue.add(new Point(row, col));
    isUsed[row][col] = true;

    while (!queue.isEmpty()) {
      Point p = queue.pop();
      cnt++;

      for (int i = 0; i < 4; i++) {
        int nextRow = p.row + moveRow[i];
        int nextCol = p.col + moveCol[i];

        if (checkBoundary(nextRow, nextCol) && !isUsed[nextRow][nextCol] && isSameNumber(data[nextRow][nextCol], num)) {
          queue.add(new Point(nextRow, nextCol));
          isUsed[nextRow][nextCol] = true;
        }
      }
    } // end of while

    return cnt;
  }

  public boolean checkBoundary(int row, int col) {
    if ((0 <= row && row < height) && (0 <= col && col < weight))
      return true;
    return false;
  }

  public boolean isSameNumber(int a, int b) {
    if (a == b)
      return true;
    return false;
  }
}

class Point {
  int row, col;

  public Point(int row, int col) {
    this.row = row;
    this.col = col;
  }
}