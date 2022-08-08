import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<String> data = new HashSet<>();

    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++)
      data.add(br.readLine());

    List<Word> words = new ArrayList<>();
    data.forEach(s -> {
      words.add(new Word(s.length(), s));
    });

    Collections.sort(words, (a, b) -> {
      if (a.length != b.length)
        return a.length.compareTo(b.length);
      else
        return a.content.compareTo(b.content);
    });

    words.forEach(word -> {
      System.out.println(word.content);
    });
  }

  static class Word {
    Integer length;
    String content;

    public Word(Integer length, String content) {
      this.length = length;
      this.content = content;
    }
  }
}