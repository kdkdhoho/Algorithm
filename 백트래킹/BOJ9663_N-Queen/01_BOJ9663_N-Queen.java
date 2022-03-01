import java.util.*;

public class Main {

	static int N;
	static boolean[] used1, used2, used3;
	static int answer;
	
	public static void main(String[] args) {
		answer = 0;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		used1 = new boolean[N];
		used2 = new boolean[2*N - 1];
		used3 = new boolean[2*N - 1];
		
		int row = 0;
		for(int col = 0; col < N; col++)
			recursion(row, col);
		
		System.out.println(answer);
	}

	static void recursion(int row, int col) {		
		used1[col] = true;
		used2[row + col] = true;
		used3[row - col + N - 1] = true;
		
		row++;
		
		if(row == N)
			answer++;
		
		for(int column = 0; column < N; column++) {
			if(!used1[column] && !used2[row + column] && !used3[row - column + N - 1]) {				
				recursion(row, column);
			}
		}
		
		row--;
		used1[col] = false;
		used2[row + col] = false;
		used3[row - col + N - 1] = false;
	}
}