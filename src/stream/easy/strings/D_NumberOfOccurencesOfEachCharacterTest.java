package stream.easy.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Count the number of occurrences of each character in a string (spaces
 * excluded).
 *
 * <p>
 * Example: <br>
 * Input: "the quick brown fox jumps right over the little lazy dog little" <br>
 * Output: {'t'=5, 'h'=3, 'e'=5, 'q'=1, 'u'=2, ...} <br>
 * Explanation: Each character is mapped to how many times it appears in the
 * string.
 */
class D_NumberOfOccurencesOfEachCharacterTest {
  @Test
  @Disabled("Remove This Once you Complete The Exercise")
  void numberOfOccurencesOfEachCharacter() {
    final String input = "the quick brown fox jumps right over the little lazy dog little";
    final var mySolution = StringProblemsSolution.findOccurenceOfCharacter(input);
    final Map<Character, Long> yourSolution = input.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> c != ' ')
        .collect(Collectors.groupingBy( // grouping by has what to group and how to group
            c -> c,
            Collectors.counting()));
    ;

    assertEquals(mySolution, yourSolution);
  }
}
