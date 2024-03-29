import java.security.SecureRandom;
import java.util.Base64;

public class SaltGenerator {

    public static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[4];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }
}
