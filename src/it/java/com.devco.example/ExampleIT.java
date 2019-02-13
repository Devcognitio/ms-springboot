package com.devco.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleIT {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        assertEquals(0, (10 * 0));
    }
}
