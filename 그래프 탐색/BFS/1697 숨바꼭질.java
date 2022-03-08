// https://www.acmicpc.net/problem/1697

import java.util.*;
import java.io.*;

class Node {
	int num, count;

	Node(int num, int count) {
		this.num = num;
		this.count = count;
	}
}

public class Main {
	static boolean[] visited = new boolean[100001];

	static int bfs(int start, int target) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(start, 0));
		visited[start] = true;

		while (!q.isEmpty()) {
			Node tmp = q.poll();
			int num = tmp.num;
			int count = tmp.count;
			int next = 0;

			if (num == target)
				return count;

			for (int i = 0; i < 3; i++) {
				if (i == 0)
					next = num - 1;
				else if (i == 1)
					next = num + 1;
				else if (i == 2)
					next = num * 2;

				if (0 <= next && next <= 100000) {
					if (!visited[next]) {
						q.offer(new Node(next, count + 1));
						visited[next] = true;
					}
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int result = bfs(n, k);
		System.out.println(result);
	}
}