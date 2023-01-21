import java.util.*;

class Solution {
    LinkedList<Integer> queue = new LinkedList<>();

    public int[] solution(int[] numbers, String direction) {
        initQueue(numbers);
        moveNumbers(direction);
        return queue.stream()
                .mapToInt(Integer::new)
                .toArray();
    }

    private void initQueue(int[] numbers) {
        for (int number : numbers) {
            queue.add(number);
        }
    }

    private void moveNumbers(String direction) {
        if (direction.equals("right")) {
            int lastNum = queue.pollLast();
            queue.addFirst(lastNum);
        }

        if (direction.equals("left")) {
            int firstNum = queue.pollFirst();
            queue.addLast(firstNum);
        }
    }
}