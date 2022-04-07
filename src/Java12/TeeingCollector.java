package Java12;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class TeeingCollector {
    @Test
    public void givenSetOfNumbers_thenCalculateAverage() {
        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        assertEquals(3.0, mean, 0.0);
    }
}
