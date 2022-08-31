// https://www.acmicpc.net/problem/25304

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int amount = Integer.parseInt(input[0]);
            int count = Integer.parseInt(input[1]);
            
            sum += (amount * count);
        }
        
        if(sum == total)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}