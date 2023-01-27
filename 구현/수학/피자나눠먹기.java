class Solution {
    private static final int PIECES = 6;

    public int solution(int n) {
        int pizzas = 1;
        while (true) {
            if ((pizzas * PIECES) % n == 0) {
                break;
            }
            pizzas++;
        }
        return pizzas;
    }
}