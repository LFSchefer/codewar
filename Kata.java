import java.util.HashMap;
import java.util.Map;

public class Kata {

  public static void main(String[] args) {
    Kata.count("aabbbac");
  }

  public static Map<Character, Integer> count(String str) {
    Map<Character, Integer> result = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      if (result.get(str.substring(i, i+1).toCharArray()[0]) == null) {
        result.put(str.substring(i, i+1).toCharArray()[0],1);
      } else {
        result.replace(str.substring(i, i+1).toCharArray()[0], result.get(str.substring(i, i+1).toCharArray()[0]) + 1);
      }
    }
    System.out.println(result);
    return result;
}

}
