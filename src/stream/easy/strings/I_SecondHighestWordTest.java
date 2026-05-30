package stream.easy.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Find the second-largest word (by character length) in a given string.
 *
 * <p>Example: <br>
 * Input: "I am interested123455 to grow in my organization" <br>
 * Output: "organization" <br>
 * Explanation: "interested123455" is the longest (16 chars); "organization" is second (12 chars).
 */
class I_SecondHighestWordTest {
  @Test
  @Disabled()
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String mySolution = StringProblemsSolution.find2ndLargestWordInTheString(input);

    final String yourSolution = "";

    assertEquals(mySolution, yourSolution);
  }
}
