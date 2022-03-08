public class Main {
	public static void main(String[] args) {
		long[] dp = new long[51];

		dp[1] = 1;
		dp[2] = 1;

		int n = 50;
		for (int i = 3; i <= n; i++)
			dp[i] = dp[i - 1] + dp[i - 2];

		System.out.println(dp[n]);
	}
}