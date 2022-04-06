package Java10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;

public class OptionalOrElseThrow {
    List<Integer> someIntList = new ArrayList<>(Arrays.asList(1,2,3));

    @Test
    public void whenListContainsInteger_OrElseThrowReturnsInteger() {
        Integer firstEven = someIntList.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow();
        is(firstEven).equals(Integer.valueOf(2));
    }

    @Test
    public void whenListContainsInteger_OrElseThrowReturnsIntegerWithException() {
        try{Integer firstEven = someIntList.stream()
                .filter(i -> i % 5 == 0)
                .findFirst()
                .orElseThrow();}
        catch (NoSuchElementException e){
            System.out.println("Element not found");
        }

    }
}
