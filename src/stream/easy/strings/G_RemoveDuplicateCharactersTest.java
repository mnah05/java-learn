package stream.easy.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Remove duplicate characters from a string, preserving the order of first occurrence.
 *
 * <p>Example: <br>
 * Input: "dabfcadef" <br>
 * Output: "dabfce" <br>
 * Explanation: 'a', 'd', and 'e' appear more than once; only their first occurrences are kept.
 */
class G_RemoveDuplicateCharactersTest {
  @Test
  @Disabled()
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    final String yourSolution = "";
    final String mySolution = StringProblemsSolution.getUniqueCharacters(input);

    assertEquals(mySolution, yourSolution);
  }
}
