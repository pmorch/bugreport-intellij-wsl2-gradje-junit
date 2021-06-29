import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAppTest {

    @Test
    void countToTwo() {
        int result = MyApp.countToTwo();
        assertEquals(2, result);
    }

    @Test
    void countToTwoBadly() {
        int result = MyApp.countToTwo();
        assertEquals(3, result);
    }
}