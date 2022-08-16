// https://www.acmicpc.net/problem/10953

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split(",");
      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);

      sb.append(a + b).append("\n");
    }

    System.out.print(sb);
  }
}