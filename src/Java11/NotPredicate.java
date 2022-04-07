package Java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicate {
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", " ", "Kotlin", " ");
        List<String> allBlanks = sampleList.stream()
                .filter(String::isBlank)
                .collect(Collectors.toList());
        List<String> withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        System.out.println(allBlanks + "\n" + withoutBlanks);
    }
}
