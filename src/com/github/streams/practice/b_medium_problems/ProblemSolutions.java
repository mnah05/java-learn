package com.github.streams.practice.b_medium_problems;

import com.github.streams.practice.b_medium_problems.employee.ignore.domain_related.Identity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProblemSolutions {

  public static Map<String, ? extends Number> findUniqueDomainsCount(List<Identity> employees) {
    return employees.stream()
        .map(Identity::getEmail)
        .map(email -> email.substring(email.indexOf('@') + 1))
        .collect(Collectors.groupingBy(
            domain -> domain,
            LinkedHashMap::new,
            Collectors.counting()));
  }

  public static int maxNumberOfVowels(String input) {
    return java.util.Arrays.stream(input.split("\\s+"))
        .mapToInt(word -> (int) word.chars()
            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
            .count())
        .max()
        .orElse(0);
  }

  public static char firstNonRepeatingCharacter(String input) {
    var frequencies = input.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(
            java.util.function.Function.identity(),
            LinkedHashMap::new,
            Collectors.counting()));
    return input.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> frequencies.get(c) == 1)
        .findFirst()
        .orElseThrow();
  }
}
