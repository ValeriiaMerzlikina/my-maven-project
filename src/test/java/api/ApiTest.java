package api;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ApiTest {
    @Test
    @Tag("api")
    void testGetUser() {
        System.out.println("API Test 1 (Thread: " + Thread.currentThread().getId() + ")");
    }

    @Test
    @Tag("api")
    void testCreateUser() {
        System.out.println("API Test 2 (Thread: " + Thread.currentThread().getId() + ")");
    }
}