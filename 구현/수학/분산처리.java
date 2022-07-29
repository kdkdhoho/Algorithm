import java.util.*;
import java.io.*;

public class 분산처리 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if (b == 0 || a == 1) {
        sb.append(1 + "\n");
        continue;
      }

      if (b > 4) {
        if (b % 4 == 0)
          b = 4;
        else
          b %= 4;
      }

      int data = (int) Math.pow(a, b);

      int lastNum = data % 10;
      if (lastNum == 0)
        sb.append(10 + "\n");
      else
        sb.append(lastNum + "\n");
    }

    System.out.println(sb);
  }
}