import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    static int n;
    static Long[] numbers;
    static Map<Long, Integer> store = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        input();
        countNumber();
        System.out.println(getAnswer());
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numbers = new Long[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Long.parseLong(br.readLine());
        }
    }

    private static void countNumber() {
        for (Long number : numbers) {
            store.put(number, store.getOrDefault(number, 0) + 1);
        }
    }

    private static Long getAnswer() {
        int maxCount = Integer.MIN_VALUE;
        Long result = 0L;

        for (Map.Entry<Long, Integer> entry : store.entrySet()) {
            Long number = entry.getKey();
            Integer count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                result = number;
            }
        }
        return result;
    }
}