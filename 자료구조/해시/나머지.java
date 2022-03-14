// https://www.acmicpc.net/problem/3052

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i = 0; i < 10; i++) {
    		int data = Integer.parseInt(br.readLine()) % 42;
    		map.put(data, map.getOrDefault(data, 0) + 1);
    	}
    	
    	Set<Integer> keys = map.keySet();
    	int answer = keys.size();
    	System.out.println(answer);
    }
}