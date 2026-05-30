package stream.easy.numbers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EasyNumbersProblemSolution {

  public static List<String> getNumberOnly(List<String> values) {
    return values.stream()
        .<String>mapMulti(
            (value, stream) -> {
              try {
                Double.parseDouble(value);
                stream.accept(value);
              } catch (NumberFormatException ignore) {
              }
            })
        .toList();
  }

  public static String getSmallestPossibleValue(List<Integer> input) {
    return input.stream().map(String::valueOf).sorted().collect(Collectors.joining());
  }

  public static String getHighestPossibleValue(List<Integer> input) {
    return input.stream()
        .map(String::valueOf)
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.joining());
  }

  public static <T> List<T> getUniqueNumberFromList(List<T> input) {
    return input.stream().distinct().toList();
  }

  public static int reverseANumber(int input) {
    System.out.println("Input number : " + input);
    return IntStream.iterate(input, x -> x > 0, x -> x / 10)
        .map(x -> x % 10)
        .reduce(0, (value, previous) -> value * 10 + previous);
  }

  public static List<List<Integer>> convertInt2DArrayToList(int[][] input) {
    return Arrays.stream(input)
        .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
        .toList();
  }

  public static double meanOfNumbers(List<Integer> input) {
    return input.stream().mapToInt(Integer::intValue).average().orElse(0);
  }

  public static Map<Integer, List<Integer>> groupingOfNumbers(List<Integer> randomIntegers) {
    return randomIntegers.stream().collect(Collectors.groupingBy(e -> e / 10));
  }

  public static long countNumberOfEvenNumbers(final List<Integer> input) {
    return input.stream().filter(x -> x % 2 == 0).count();
  }

  public static List<Double> convertCelsiusToFahrenheit(final List<Integer> input) {
    return input.stream().map(value -> (value * 9.0 / 5.0) + 32).toList();
  }

    public static List<String> uniqueEmailAddresses(List<String> input) {
      return input.stream().distinct().toList();
    }
}
