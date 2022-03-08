// https://www.acmicpc.net/problem/4673

public class Main {
	static int size = 10000;
	static boolean[] arr = new boolean[size + 1];

	public static void main(String[] args) {
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i])
				d(i);
		}

		for (int i = 1; i < arr.length; i++)
			if (!arr[i])
				System.out.println(i);
	}

	static void d(int n) {
		int next = 0;

		if (n < 10) {
			next = n + n;

			if (next <= size) {
				arr[next] = true;
				d(n + n);
			}
		} else {
			next += n;

			String str = Integer.toString(n);
			for (int i = 0; i < str.length(); i++)
				next += str.charAt(i) - '0';

			if (next <= size) {
				arr[next] = true;
				d(next);
			}
		}
	}
}