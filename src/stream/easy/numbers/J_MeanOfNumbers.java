package stream.easy.numbers;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculate the mean (average) of a list of integers.
 *
 * <p>
 * Example: <br>
 * Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
 * 20] <br>
 * Output: 10.5
 */
class J_MeanOfNumbers {
  @Test
  @Disabled
  void meanOfNumbers() {
    final var input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

    final var mySolution = EasyNumbersProblemSolution.meanOfNumbers(input);
    final var yourSolution = input.stream().mapToInt(Integer::intValue).average().orElse(0);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
