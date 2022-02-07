import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String input = br.readLine();
			int sep = input.indexOf(" ");

			int a = Integer.parseInt(input.substring(0, sep));
			int b = Integer.parseInt(input.substring(sep + 1));

			sb.append((a + b) + "\n");
		}
		System.out.print(sb);

		br.close();
	}
}

// 166.628MB, 0.832s