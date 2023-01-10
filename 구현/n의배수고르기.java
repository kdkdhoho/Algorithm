import java.util.Arrays;
import java.util.stream.IntStream;

public class n의배수고르기 {

    public int solution(int[] array, int height) {
        long answer = Arrays.stream(array)
                .filter(num -> num > height)
                .count();
        return (int)answer;
    }
}
