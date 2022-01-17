package day01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {
    @Test
    void testGetPw() {
        User user = new AdminUser("xyz", "abc123");
        assertEquals("xyz", user.getEmail());
        assertEquals("******", user.getPassword());
    }
}