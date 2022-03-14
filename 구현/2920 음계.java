import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] asc = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] des = { 8, 7, 6, 5, 4, 3, 2, 1 };
		
		int ascCount = 0;
		int desCount = 0;

		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == asc[i])
				ascCount++;
			if(arr[i] == des[i])
				desCount++;
		}
		
		if(ascCount == 8)
			System.out.println("ascending");
		else if(desCount == 8)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}