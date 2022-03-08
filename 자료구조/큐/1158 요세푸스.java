// https://www.acmicpc.net/problem/1158

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("<");
		LinkedList<Integer> list = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= n; i++)
			list.offer(i);

		int gap = k - 1;
		int index = gap;
		for (int i = 0; i < n - 1; i++) {
			if (index == list.size() - 1) {
				sb.append(list.pollLast()).append(", ");
				index = 0;
				index = (index + gap) % list.size();
			} else {
				sb.append(list.get(index)).append(", ");
				list.remove(index);
				index = (index + gap) % list.size();
			}
		}

		sb.append(list.poll()).append(">");
		System.out.print(sb);
	}
}