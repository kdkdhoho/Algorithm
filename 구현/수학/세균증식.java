class Solution {
    private static final int MULTIPLE = 2;

    public int solution(int n, int t) {
        return function(n, t);
    }

    private int function(int value, int repeat) {
        for (int i = 0; i < repeat; i++) {
            value *= MULTIPLE;
        }

        return value;
    }
}