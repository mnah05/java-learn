package stream.easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Reverse a string that may contain special characters and Unicode (e.g., emojis).
 *
 * <p>Example: <br>
 * Input: "Hello world! This is a test. 😅" <br>
 * Output: "😅 .tset a si sihT !dlrow olleH"
 */
class H_ReverseStringWithSpecialCharactersTest {

  @Test
  @Disabled
  void testReverseStringWithSpecialCharactersTest() {
    var input = "Hello world! This is a test. 😅";
    var mySolution = StringProblemsSolution.reverseStringWithSpecialCharacters(input);

    var yourSolution = "";

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
