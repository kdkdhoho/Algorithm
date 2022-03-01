import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(recursion(a, b, c));
	}

	static long recursion(int a, int b, int c) {
		if(b == 1)
			return a%c;
		
		long val = recursion(a, b/2, c);
		val = (val*val) % c;
		
		if(b%2 == 0)
			return val;
		else
			return (val*a) % c;
	}
}