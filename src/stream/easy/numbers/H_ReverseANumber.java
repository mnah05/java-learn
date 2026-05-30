package stream.easy.numbers;

import stream.easy.numbers.data.DummyData;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Reverse the digits of an integer.
 *
 * <p>
 * Example: <br>
 * Input: 12345 <br>
 * Output: 54321
 */
class H_ReverseANumber {

  @Test
  @Disabled
  static void reverseANumber() {
    final var input = DummyData.fakerNumber();
    var mySolution = EasyNumbersProblemSolution.reverseANumber(input);
    int yourSolution = IntStream.iterate(input, n -> n > 0, n -> n / 10)
        .reduce(0, (acc, n) -> acc * 10 + n % 10);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
