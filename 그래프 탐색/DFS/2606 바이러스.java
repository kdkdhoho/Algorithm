// https://www.acmicpc.net/problem/2606

import java.util.*;
import java.io.*;

public class Main {
	static int result = 0;
	static boolean[] visited;

	static void dfs(int[][] graph, int x, int y) {
		graph[x][y] = -1;
		visited[y] = true;

		for (int i = 0; i < graph[y].length; i++) {
			if (graph[y][i] == 1)
				dfs(graph, y, i);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[][] graph = new int[n][n];
		visited = new boolean[n];

		int lines = Integer.parseInt(br.readLine());
		for (int i = 0; i < lines; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;

			graph[x][y] = 1;
			graph[y][x] = 1;
		}

		for (int i = 0; i < graph[0].length; i++) {
			if (graph[0][i] == 1)
				dfs(graph, 0, i);
		}

		for (int i = 1; i < visited.length; i++) {
			if(visited[i])
				result++;
		}

		System.out.print(result);
	}
}