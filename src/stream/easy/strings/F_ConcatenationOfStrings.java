package stream.easy.strings;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Given a list of strings, concatenate all strings separated by a comma using
 * Java Streams.
 *
 * <p>
 * Example: <br>
 * Input: ["Hellow", "World", "Hello", "World"] <br>
 * Output: "Hellow,World,Hello,World"
 */
class F_ConcatenationOfStrings {

  @Test
  @Disabled
  void testConcatenationOfStrings() {
    List<String> input = List.of("Hellow", "World", "Hello", "World");
    final var mySolution = StringProblemsSolution.concatenateStrings(input);
    final var yourSolution = input
        .stream()
        .collect(Collectors.joining(","));

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
