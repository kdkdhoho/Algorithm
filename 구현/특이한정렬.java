import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    private List<Integer> answer = new ArrayList<>();

    public int[] solution(int[] numlist, int n) {
        List<Integer> sortedNumList = sortNumList(numlist);

        bruteForce(sortedNumList, n);

        return getAnswer();
    }

    private List<Integer> sortNumList(int[] numlist) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    private void bruteForce(List<Integer> sortedNumList, int n) {
        for (int diff = 0; diff <= 9999; diff++) {
            for (int currentNum : sortedNumList) {
                int currentDiff = Math.abs(n - currentNum);

                if (currentDiff == diff) {
                    answer.add(currentNum);
                }
            }
        }
    }

    private int[] getAnswer() {
        return answer.stream()
                .mapToInt(Integer::new)
                .toArray();
    }
}