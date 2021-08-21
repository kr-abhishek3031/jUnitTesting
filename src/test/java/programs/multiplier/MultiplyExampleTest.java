package programs.multiplier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyExampleTest {
    MultiplyExample  m;

    @BeforeEach
    void setup() {
        m = new MultiplyExample();

    }

    @Test
    void multiplyTest() {
        assertEquals(2,
                m.multiply(1,2));
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, m.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, m.multiply(5, 0), "Multiple with zero should be zero");
    }
}
