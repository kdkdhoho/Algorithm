// 2차원 배열에서 이루어지는 BFS를 가정하고 짜본 코드
// 상황에 따라 약간씩 달라질 수 있음
boolean[] visited = new bolean[row][col];

// 순서: 상 하 좌 우
int[] dX = {-1, 1, 0, 0};
int[] dY = {0, 0, -1, 1};
int N = dx.length;

public void BFS(Point startPoint) {
  Queue<Point> queue = new ArrayList<>();

  visited[startPoint.x][startPoint.y] = true;
  queue.add(startPoint);

  while(!queue.isEmpty()) {
    Point point = queue.poll();

    for(int i = 0; i < N; i++) {
      int nextX = point.X + dx[i];
      int nextY = point.Y + dy[i];

      if(!visited[nextX][nextY])
        queue.add(new Point(nextX, nextY));
    }
  }
}