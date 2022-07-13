import java.util.*;
import java.io.*;
// https://programmers.co.kr/skill_checks#level2 - 1

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int count[] = new int[n];
        List<String> used = new LinkedList<>();

        used.add(words[0]);
        count[0] = 1;

        for (int i = 1; i < words.length; i++) {
            count[i % n]++;

            if (!used.contains(words[i]) && isLink(used.get(i - 1), words[i]))
                used.add(words[i]);
            else {
                answer[0] = (i % n) + 1;
                answer[1] = count[i % n];
                break;
            }
        }

        return answer;
    }

    public boolean isLink(String before, String after) {
        String a = before.substring(before.length() - 1);
        String b = after.substring(0, 1);

        if (a.equals(b))
            return true;
        return false;
    }
}