import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testLogin() {
        assertEquals(
            "Login successful",
            App.login("admin", "1234")
        );
    }

    @Test
    void testInvalidLogin() {
        assertEquals(
            "Invalid username or password",
            App.login("admin", "wrong")
        );
    }
}