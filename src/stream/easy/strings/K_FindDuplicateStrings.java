package stream.easy.strings;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Find all strings that appear more than once in a list.
 *
 * <p>
 * Example: <br>
 * Input: ["Hellow", "World", "How", "are", "you", "How", "are", "you"] <br>
 * Output: ["How", "are", "you"] <br>
 * Explanation: "How", "are", and "you" each appear twice; "Hellow" and "World"
 * appear once.
 */
class K_FindDuplicateStrings {
  @Test
  @Disabled
  void findDuplicateStrings() {
    final var input = List.of("Hellow", "World", "How", "are", "you", "How", "are", "you");
    final var mySolution = StringProblemsSolution.findDuplicateStrings(input);
    final var yourSolution = input.stream().collect(Collectors.groupingBy(Function.identity())).values().stream()
        .filter(string -> string.size() > 1)
        .map(string -> string.get(0))
        .toList();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
