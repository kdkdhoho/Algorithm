// https://www.acmicpc.net/problem/9093

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            
            while(st.hasMoreTokens()) {
            	StringBuilder tmp = new StringBuilder(st.nextToken());
            	tmp.reverse();
            	
              sb.append(tmp).append(" ");
            }
            
            sb.append("\n");
            System.out.print(sb);
            sb.setLength(0);
        }
    }
}