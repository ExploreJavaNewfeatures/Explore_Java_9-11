package Java10;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    java.util.List, java.util.Map and java.util.Set each got a new static
    method copyOf(Collection).It returns the unmodifiable copy of the
    given Collection.
    java.util.stream.Collectors get additional methods to collect a Stream
    into unmodifiable List, Map or Set.
    Any attempt to modify such a collection would result in
    java.lang.UnsupportedOperationExceptionruntime exception.
* */

public class UnmodifiableCollectionDemo {

    List<Integer> someIntList = new ArrayList<>(Arrays.asList(1,2,3));

    @Test(expected = UnsupportedOperationException.class)
    public void whenModifyCopyOfList_thenThrowsException() {
        List<Integer> copyList = List.copyOf(someIntList);
        copyList.add(4);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenModifyToUnmodifiableList_thenThrowsException() {
        List<Integer> evenList = someIntList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
        evenList.add(4);
    }
}
