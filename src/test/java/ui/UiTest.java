package ui;

import org.junit.Test;
import org.junit.jupiter.api.Tag;


public class UiTest {
    @Test
    @Tag("ui")
   public void testLoginPage() {
        System.out.println("UI Test 1 (Thread: " + Thread.currentThread().getId() + ")");
    }

    @Test
    @Tag("ui")
   public void testDashboard() {
        System.out.println("UI Test 2 (Thread: " + Thread.currentThread().getId() + ")");
    }
}