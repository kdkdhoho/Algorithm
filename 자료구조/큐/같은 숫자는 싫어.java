
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
import java.util.*;

public class Solution {

  public int[] solution(int[] arr) {
    LinkedList<Integer> queue = new LinkedList<>();

    for (int i = 0; i < arr.length; i++) {
      if (queue.isEmpty())
        queue.add(arr[i]);
      else {
        if (queue.peekLast() == arr[i])
          continue;
        else
          queue.add(arr[i]);
      }
    }

    int[] answer = new int[queue.size()];
    for (int i = 0; i < answer.length; i++)
      answer[i] = queue.pop();

    return answer;
  }

}