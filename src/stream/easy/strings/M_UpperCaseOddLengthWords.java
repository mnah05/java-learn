package stream.easy.strings;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Given a list of words, filter out only the words with an odd character length
 * and convert them
 * to uppercase.
 *
 * <p>
 * Example: <br>
 * Input: ["alfa", "bravo", "charlie", "delta", "echo", "foxtrot"] <br>
 * Output: ["BRAVO", "CHARLIE", "DELTA", "FOXTROT"] <br>
 * Explanation: "alfa" (4) and "echo" (4) have even lengths and are excluded.
 */
public class M_UpperCaseOddLengthWords {

  @Test
  @Disabled
  public void uppercaseOddLengthWords() {
    List<String> input = List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");
    List<String> result = input.stream().map(String::toUpperCase).filter(word -> word.length() % 2 != 0)
        .toList(); // TODO

    Assertions.assertEquals(List.of("BRAVO", "CHARLIE", "DELTA", "FOXTROT"), result);
  }
}
