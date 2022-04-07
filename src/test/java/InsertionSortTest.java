import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


import java.time.Duration;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    @Test
    void isSortedTest() {
            int[]  arr = IntStream.generate(() -> new Random().nextInt(10)).limit(200000).toArray();
            InsertionSort ob = new InsertionSort();
            ob.sort(arr);
            boolean isSorted = ob.isSorted(arr);
            assertTrue(isSorted);


    }


    @Test
    @RepeatedTest(3)
    void performanceTestForInsertionSort() {
        assertTimeout(Duration.ofSeconds(1),
                () -> {
                    int[]  arr = IntStream.generate(() -> new Random().nextInt(10)).limit(200000).toArray();
                    InsertionSort ob = new InsertionSort();
                    ob.sort(arr);

                }
        );
}
}