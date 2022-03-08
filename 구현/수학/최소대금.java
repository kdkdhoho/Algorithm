// https://codeup.kr/problem.php?id=2001

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] pasta = new int[3];
		int[] juice = new int[2];

		// 파스타 가격 입력받기
		for (int i = 0; i < pasta.length; i++)
			pasta[i] = sc.nextInt();
		// 쥬스 가격 입력받기
		for (int i = 0; i < juice.length; i++)
			juice[i] = sc.nextInt();

		int sum = Arrays.stream(pasta).min().getAsInt() + Arrays.stream(juice).min().getAsInt();

		double result = sum * 1.1;

		System.out.printf("%.1f", result);
	}
}