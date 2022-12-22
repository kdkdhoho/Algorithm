class Solution {
    public int solution(String A, String B) {
        int count = 0;
        while (!A.equals(B)) {
            if (count > 100) {
                return -1;
            }
            count++;
            A = process(A);
        }

        return count;
    }

    private String process(String input) {
        StringBuilder sb = new StringBuilder(input);
        char lastChar = sb.charAt(input.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.insert(0, lastChar);
        return sb.toString();
    }
}