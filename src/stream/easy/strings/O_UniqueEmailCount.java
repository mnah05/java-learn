package stream.easy.strings;

import com.github.streams.practice.b_medium_problems.ProblemSolutions;
import com.github.streams.practice.b_medium_problems.employee.ignore.domain_related.Identity;
import java.util.List;
import java.util.Map;
import net.datafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Given a list of employees, each with an email address, extract all unique email domains and
 * count how many employees use each domain.
 *
 * <p>Example: <br>
 * Input: employees with emails ["alice@gmail.com", "bob@yahoo.com", "carol@gmail.com",
 * "dave@hotmail.com"] <br>
 * Output: {"gmail.com"=2, "yahoo.com"=1, "hotmail.com"=1}
 */
class O_UniqueEmailCount {
  @Test
  @Disabled
  void findUniqueDomainsWithCount() {
    final var instance = new Faker();
    final var employees =
        List.of(
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""),
            new Identity(instance.internet().emailAddress(), ""));

    final var mySolution = ProblemSolutions.findUniqueDomainsCount(employees);

    final Map<String, ? extends Number> yourSolution = null;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
