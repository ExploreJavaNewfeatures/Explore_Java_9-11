package Java11;

import java.util.*;

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        System.out.println(Arrays.toString(sampleArray));
    }
}
