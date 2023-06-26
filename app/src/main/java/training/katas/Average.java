package training.katas;

import java.util.Arrays;
import java.util.OptionalDouble;

public final class Average {

    public Average() {
    }

    public final double calculate(double[] array) {
        OptionalDouble optional = Arrays.stream(array).average();

        return optional.isPresent() ? optional.getAsDouble() : 0;
    }
}
