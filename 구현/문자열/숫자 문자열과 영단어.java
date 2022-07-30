// https://school.programmers.co.kr/learn/courses/30/lessons/81301

// 내가 푼 방법
import java.util.*;

class Solution {

  HashMap<String, Integer> words = new HashMap<>();
  StringBuilder sb = new StringBuilder();

  public int solution(String s) {
    int i, end;

    initWords();

    for (i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (0 <= ch - '0' && ch - '0' <= 9)
        sb.append(ch);
      else {
        end = i;

        while (end < s.length() - 1 &&
            (!(0 <= s.charAt(end + 1) - '0' && s.charAt(end + 1) - '0' <= 9)) &&
            !(words.containsKey(s.substring(i, end + 1))))
          end++;

        sb.append(words.get(s.substring(i, end + 1)));

        i = end;
      }
    }

    return Integer.parseInt(sb.substring(0));
  }

  public void initWords() {
    words.put("zero", 0);
    words.put("one", 1);
    words.put("two", 2);
    words.put("three", 3);
    words.put("four", 4);
    words.put("five", 5);
    words.put("six", 6);
    words.put("seven", 7);
    words.put("eight", 8);
    words.put("nine", 9);
  }
}

// 사람들이 푼 좋은 방법
import java.util.*;

class Solution {

  String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

  public int solution(String s) {
    for (int i = 0; i < words.length; i++)
      s = s.replaceAll(words[i], Integer.toString(i));

    return Integer.parseInt(s);
  }
}