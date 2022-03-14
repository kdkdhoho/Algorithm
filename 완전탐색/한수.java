// https://www.acmicpc.net/problem/1065

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		int answer = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine());
		for (int i = 1; i <= input; i++) {
			if (is한수(i))
				answer++;
		}

		System.out.print(answer);
	}

	public static boolean is한수(int input) {
		if (input < 100)
			return true;

		String str = Integer.toString(input);
		String[] strArr = str.split("");

		int left = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[1]);
		int rigth = Integer.parseInt(strArr[1]) - Integer.parseInt(strArr[2]);

		if (left == rigth)
			return true;

		return false;
	}
}