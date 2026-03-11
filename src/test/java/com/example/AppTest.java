package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCalculateSalary() {

        App app = new App();

        double result = app.calculateSalary(10000);

        assertEquals(13000, result, 0.01);

    }
}
