import java.util.Arrays;

public class n의배수고르기 {

    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
                .filter(num -> num % n == 0)
                .toArray();
    }
}
