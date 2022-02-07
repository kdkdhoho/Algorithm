import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Boolean> stack = new Stack<>();

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String input = br.readLine();

			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == '(')
					stack.push(true);
				else {
					if (stack.empty()) {
						stack.push(false);
						break;
					} else {
						stack.pop();
					}
				}
			}

			if (stack.empty())
				sb.append("YES\n");
			else
				sb.append("NO\n");
			
			stack.clear();
		}

		System.out.print(sb);
	}
}