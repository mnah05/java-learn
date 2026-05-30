package stream.easy.strings;

import com.github.streams.practice.b_medium_problems.ProblemSolutions;

import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Find the first character in a string that does not repeat anywhere else in
 * the string.
 * (Classic Google interview question)
 *
 * <p>
 * Example: <br>
 * Input: "The quick brown fox jumps over the lazy dog, find the first non
 * repeated character." <br>
 * Output: 'T' <br>
 * Explanation: 'T' appears only once and is the first such character from the
 * left.
 */
class N_FirstNonRepeatingCharacterTest {
    @Test
    @Disabled
    void testFirstNonRepeatingCharacter() {
        final var input = "The quick brown fox jumps over the lazy dog, find the first non repeated character.";
        var frequencies = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
        final var yourSolution = input.chars().mapToObj(c -> (char) c).filter(c -> frequencies.get(c) == 1)
                .findFirst().orElseThrow();

        final var mySolution = ProblemSolutions.firstNonRepeatingCharacter(input);

        Assertions.assertEquals(mySolution, yourSolution);
    }
}
