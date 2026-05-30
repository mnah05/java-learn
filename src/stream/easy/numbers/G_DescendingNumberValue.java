package stream.easy.numbers;

import stream.easy.numbers.data.DummyData;

import java.util.Comparator;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Re-arranges the elements of a numeric array to form the highest possible
 * value.
 *
 * <p>
 * Example: <br>
 * Input: [1, 34, 3, 98, 9, 76, 45, 4] <br>
 * Output: "998764543431" <br>
 * Explanation: Numbers re-arranged as 9, 98, 76, 45, 4, 34, 3, 1.
 */
class G_DescendingNumberValue {

  @Test
  @Disabled
  public void test() {
    var input = DummyData.fakeListOfSize(7);
    var mySolution = EasyNumbersProblemSolution.getHighestPossibleValue(input);
    var yourSolution = input.stream()
        .map(String::valueOf)
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.joining());

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
