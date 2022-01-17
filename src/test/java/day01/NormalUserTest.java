package day01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {
    @Test
    void testNormalUser() {
        User user = new NormalUser("tohotom", "123");
        assertEquals("tohotom", user.getEmail());
        assertEquals("123", user.getPassword());
    }
}