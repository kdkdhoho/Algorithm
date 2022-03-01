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
		
		recursion(0);
		
		System.out.println(answer);
	}

	static void recursion(int cur) {		
		if(cur == N) {
			answer++;
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(used1[i] || used2[i+cur] || used3[cur-i+N-1])
				continue;
			
			used1[i] = true;
			used2[i+cur] = true;
			used3[cur-i+N-1] = true;
			
			recursion(cur+1);
			
			used1[i] = false;
			used2[i+cur] = false;
			used3[cur-i+N-1] = false;
		}
	}
}