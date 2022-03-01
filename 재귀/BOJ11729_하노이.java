import java.util.*;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int answer = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int now = 1;
		int target = 3;
		recursion(now, target, n);
		
		System.out.println(answer);
		System.out.println(sb);
	}

	static void recursion(int start, int target, int n) {
		answer += 1;
		
		if(n == 1) {
			sb.append(start + " " + target).append("\n");
			return;
		}
		
		recursion(start, 6-target-start, n-1);
		sb.append(start + " " + target).append("\n");
		recursion(6-target-start, target, n-1);
	}
}