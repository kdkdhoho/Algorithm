import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		int[] arr = new int[26]; // 영문자의 개수는 26개임

		int c = System.in.read();

		while (c > 64) {
			if (c < 91)
				arr[c - 65]++;
			else
				arr[c - 97]++;

			c = System.in.read();
		}

		int max = -1;
		int ch = -2;

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if (arr[i] == max)
				ch = -2;
		}
		System.out.print((char) (ch + 65));
	}
} // 13MB, 112ms