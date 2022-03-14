// https://www.acmicpc.net/problem/10250

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int cases = Integer.parseInt(br.readLine());
		for (int i = 0; i < cases; i++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());

			int[][] rooms = new int[H][W];

			int j;
			for (j = 0; j < N; j++)
				rooms[j % H][j / H] = 1;

			j -= 1;
			int row = j % H;
			int col = j / H;

			System.out.printf("%d", row + 1);
			System.out.printf("%02d", col + 1);
            System.out.println();
		}
	}
}