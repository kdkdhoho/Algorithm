// 2번 방법
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}

		System.out.print(sb);

		br.close();
	}
}

// 237.696MB, 0.884s