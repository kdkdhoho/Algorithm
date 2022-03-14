// https://www.acmicpc.net/problem/1924

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] results = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int days = 0;
		for (int i = 0; i < x - 1; i++)
			days += daysOfMonth[i];

		days += y - 1;

		String answer = results[(days % 7)];
		System.out.println(answer);
	}
}