package ui;

import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class UiTest {
    @Test
    @Tag("ui")
    void testLoginPage() {
        System.out.println("UI Test 1 (Thread: " + Thread.currentThread().getId() + ")");
    }

    @Test
    @Tag("ui")
    void testDashboard() {
        System.out.println("UI Test 2 (Thread: " + Thread.currentThread().getId() + ")");
    }
}