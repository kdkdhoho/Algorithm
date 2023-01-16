import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer> divisors = new HashSet<>();

    public int solution(int n) {
        for (int i = 1; i <= n; i++) {
            uclid(n, i);
        }
        return divisors.size();
    }

    private void uclid(int a, int b) {
        if (b == 0) {
            divisors.add(a);
            return;
        }
        uclid(b, a%b);
    }
}