// https://school.programmers.co.kr/learn/courses/30/lessons/1835?language=java

public class 단체사진찍기 {
  int answer = 0;
  String[] friends = { "A", "C", "F", "J", "M", "N", "R", "T" };

  public int solution(int n, String[] data) {
    boolean[] isVisited = new boolean[8];

    dfs("", isVisited, data);
    return answer;
  }

  public void dfs(String arr, boolean[] isVisited, String[] datas) {
    if (arr.length() == 8) {
      if (check(arr, datas))
        answer++;

      return;
    }

    for (int i = 0; i < 8; i++) {
      if (!isVisited[i]) {
        isVisited[i] = true;
        String tmp = arr + friends[i];
        dfs(tmp, isVisited, datas);
        isVisited[i] = false;
      }
    }
  }

  public boolean check(String arr, String[] datas) {
    for (String data : datas) {
      int position1 = arr.indexOf(data.charAt(0));
      int position2 = arr.indexOf(data.charAt(2));
      char op = data.charAt(3);
      int gap = data.charAt(4) - '0';

      if (op == '=') {
        if (!(Math.abs(position1 - position2) == gap + 1))
          return false;
      }
      if (op == '>') {
        if (!(Math.abs(position1 - position2) > gap + 1))
          return false;
      }
      if (op == '<') {
        if (!(Math.abs(position1 - position2) < gap + 1))
          return false;
      }
    }

    return true;
  }
}
