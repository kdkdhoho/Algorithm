import java.util.*;
import java.io.*;

public class Main {
	static int[][] data = { {7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4} };
	
	public static void main(String[] args) {
		int N = 5;
		int[][] dp = new int[N][N];
		
		dp[0][0] = data[0][0];
		
		for(int i = 1; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(j == 0)
					dp[i][j] = dp[i-1][j] + data[i][j];
				else if(j == data[i].length - 1)
					dp[i][j] = dp[i-1][j-1] + data[i][j];
				else
					dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + data[i][j];
			}
		}
		
		int max = 0;
		for(int i = 0; i < dp[data.length-1].length; i++)
			max = max > dp[data.length-1][i] ? max : dp[data.length-1][i];
			
		System.out.println(max);
	}
}