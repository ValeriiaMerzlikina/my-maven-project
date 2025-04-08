package other;

import org.junit.jupiter.api.Test;

public class OtherTest {
    @Test
    void testSomething() {
        System.out.println("Other Test (Thread: " + Thread.currentThread().getId() + ")");
    }
}