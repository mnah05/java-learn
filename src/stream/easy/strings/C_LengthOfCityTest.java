package stream.easy.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculates the length of city names that start with 'm' or 'M' and returns a map of city name
 * to its length.
 *
 * <p>Example: <br>
 * Input: ["Mumbai", "Munnar", "Chennai", "Hyderabad"] <br>
 * Output: {"Mumbai"=6, "Munnar"=6} <br>
 * Explanation: Only cities starting with 'M' or 'm' are included.
 */
class C_LengthOfCityTest {
  @Test
  @Disabled
  void testCalculateLengthOfEachCityTest() {
    final var cities = List.of("Mumbai", "Munnar", "Chennai", "Hyderabad");
    final var mySolution = StringProblemsSolution.findLengthOfEachCityAlongWithSize(cities);

    final Map<String, Integer> yourSolution = new HashMap<>();
    Assertions.assertEquals(yourSolution, mySolution);
  }
}
