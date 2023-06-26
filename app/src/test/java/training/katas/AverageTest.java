package training.katas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageTest {

    private Average average;

    @Before
    public void setUp() {
        average = new Average();
    }

    @Test
    public void testAverageWithPositive() {
        double[] array = {1, 2, 3, 4, 5};
        double actual = average.calculate(array);
        double expected = 3.0;
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testAverageWithNegative() {
        double[] array = {1, 2, 3, 4, -5};
        double actual = average.calculate(array);
        double expected = 1.0;
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testAverageReturnsZero() {
        double[] array = {};
        double actual = average.calculate(array);
        double expected = 0.0;
        assertEquals(expected, actual, 0.0);
    }
}
