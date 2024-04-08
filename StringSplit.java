import java.util.ArrayList;
import java.util.List;

public class StringSplit {

  public static void main(String[] args) {
    StringSplit.solution("LovePizza");
  }

  public static String[] solution(String s) {
    String[] split = s.split("");
    List<String> result = new ArrayList<>();
    String insert = "";

    for (int i = 0; i < split.length; i++) {
      insert += split[i];
      if (i % 2 == 1 && i !=0) {
        result.add(insert);
        insert = "";
      }
    }
    if (s.length() % 2 == 1) {
      insert = s.substring(s.length() - 1);
      result.add(insert + "_");
    }
    System.out.println(result);
    return result.stream().toArray(String[] ::new);
  }

}
