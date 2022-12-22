import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int count = 0;
        while (!A.equals(B)) {
            if (count >= 10_000_000) {
                return -1;
            }

            count++;

            A = process(A);
        }

        return count;
    }

    private String process(String input) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            queue.add(input.charAt(i));
        }
        queue.add(queue.poll());

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        return sb.reverse().toString();
    }
}