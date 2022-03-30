package Java9;

import java.util.List;
import java.util.stream.Stream;

public class Java9StreamAPI {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(5, 4, 3, 2, 1);
        list1.stream().takeWhile(s -> s < 4).forEach(System.out::println);
        list2.stream().dropWhile(s -> s >= 4).forEach(System.out::println);
        Stream.iterate('a', x-> x < 200, x -> x++).forEach(System.out::println);
    }
}
