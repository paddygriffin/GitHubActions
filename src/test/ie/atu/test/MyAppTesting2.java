package test.ie.atu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ie.atu.java.MyApp;

class MyAppTesting2 {
    private final MyApp app = new MyApp();

    @Test
    void testAddition() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, app.subtract(3, 2));
    }
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
