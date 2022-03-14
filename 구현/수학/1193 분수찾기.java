// https://www.acmicpc.net/problem/1193

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());

		int[] arr = new int[5000];
		int tmp = 1;
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = tmp + arr[i - 1];
			tmp += 1;
		}

		int index = 0;
		while(true) {
			if(arr[index] > target)
				break;
			
			index++;
		}
		
		int mother, son;
		if((index-1) % 2 == 0) {
			mother = index;
			son = 1;
			
			int gap = target - arr[index - 1];
			for(int i = 0; i < gap; i++) {
				mother--;
				son++;
			}
		}
		else {
			mother = 1;
			son = index;
			
			int gap = target - arr[index - 1];
			for(int i = 0; i < gap; i++) {
				mother++;
				son--;
			}
		}
		
		String answer = "";
		answer += Integer.toString(mother) + "/" + Integer.toString(son);
		System.out.println(answer);
	}
}