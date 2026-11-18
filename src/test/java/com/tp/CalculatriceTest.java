package com.tp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {
    @Test
    void testAddition() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.additionner(2, 3), "2 + 3 doit être égal à 5");
    }
}
