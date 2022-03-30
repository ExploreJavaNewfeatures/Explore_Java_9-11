package Java9;

import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(5, 4, 3, 2, 1);
        List<Integer> list3 = null;
        //take while demo
        list1.stream().takeWhile(s -> s < 4).forEach(System.out::println);

        //drop while demo
        list2.stream().dropWhile(s -> s >= 4).forEach(System.out::println);

        //iterate demo
        Stream.iterate(3, x-> x < 10, x -> x+3).forEach(System.out::println);

        //ofNullable demo
        long count = Stream.ofNullable(list3).count();
        System.out.println(count);
    }
}
