package stream.easy.strings;

import com.github.streams.practice.b_medium_problems.ProblemSolutions;
import net.datafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Given a string, find the highest number of vowels present in any single word.
 *
 * <p>Example: <br>
 * Input: "HELLO HOW ARE YOU" <br>
 * Output: 2 <br>
 * Explanation: "HELLO" contains 2 vowels (E, O), which is the most of any word in the string.
 */
class P_WordWithMaxNumberOfVowelsTest {

  @Disabled
  @Test
  void testNumberOfVowels() {
    var input = new Faker().chuckNorris().fact();
    final var mySolution = ProblemSolutions.maxNumberOfVowels(input);
    final var yourSolution = 0;
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
