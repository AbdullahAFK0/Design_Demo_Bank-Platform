import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AuthenticationTest {

    @Test
    public void testCorrectCredentials() {
        assertTrue(
            Authentication.authenticate(
                "user@gmail.com",
                "123456"
            )
        );
    }

    @Test
    public void testWrongPassword() {
        assertFalse(
            Authentication.authenticate(
                "user@gmail.com",
                "wrong123"
            )
        );
    }

    @Test
    public void testWrongEmail() {
        assertFalse(
            Authentication.authenticate(
                "wrong@gmail.com",
                "123456"
            )
        );
    }
}