package ie.atu.test;

import org.junit.jupiter.api.Test;

import ie.atu.java.MyApp;

import static org.junit.jupiter.api.Assertions.*;

public class MyAppTesting {
    private final MyApp app = new MyApp();

    @Test
    void testAddition() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, app.subtract(3, 2));
    }
}
