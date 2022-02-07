public class Main {
	static long[] dp = new long[100];

	static long fibo(int x) {
		if (x == 1 || x == 2)
			return 1;

		if (dp[x] != 0)
			return dp[x];

		dp[x] = fibo(x - 1) + fibo(x - 2);
		return dp[x];
	}

	public static void main(String[] args) {
		System.out.println(fibo(50));
	}
}