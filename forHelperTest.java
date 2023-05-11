import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ForHelperTest {
    @Test
    public void forEach_shouldIterateOverArray() {
        Integer[] nums = {1, 2, 3, 4, 5};
        StringBuilder sb = new StringBuilder();

        ForHelper<Integer> forHelper = new ForHelper<>(nums);
        forHelper.forEach((index, num) -> {
            sb.append("Index: ").append(index).append(", Value: ").append(num).append("\n");
        });

        String expected = "Index: 0, Value: 1\n" +
                "Index: 1, Value: 2\n" +
                "Index: 2, Value: 3\n" +
                "Index: 3, Value: 4\n" +
                "Index: 4, Value: 5\n";
        assertEquals(expected, sb.toString());
    }
}
