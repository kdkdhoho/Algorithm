// https://programmers.co.kr/learn/courses/30/lessons/1845

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int n = nums.length / 2;
        ArrayList<Integer> types = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(!types.contains(nums[i]))
                types.add(nums[i]);
        }
        
        int size = types.size();
        if(size >= n)
            answer = n;
        else
            answer = size;
        
        return answer;
    }
}