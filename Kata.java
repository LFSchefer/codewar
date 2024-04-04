import java.util.List;

public class Kata {

  public static void main(String[] args) {
    Kata kata = new Kata();
    kata.high("man i need a taxi up to ubud");
  }
    public final static List<Character> alphabet = "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(c -> (char) c).toList();

    public static String high(String s) {
      String[] words = s.split(" ");
      String highWord = "";
      int highscore = 0;
      int score = 0;
      for (String word : words) {
        score = 0;
        String[] letters = word.split("");
        for (int i = 0 ; i < letters.length ; i++) {
          score += alphabet.indexOf(letters[i].charAt(0)) + 1;
          if (score > highscore) {
            highscore = score;
            highWord = word;
               }
            }
        }
        System.out.println(highWord);
        return highWord;
      }
}
