package assignment;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.spec.SecretKeySpec;
public class RandomSecretKeySpec {
    private static final String ALGORITHM = "AES";
    private static final int keySize = 16;
    
    private static byte[] generateRandomBytes(int size) {
        byte[] bytes = new byte[size];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bytes);
        return bytes;
    }
    
    public static Key create() {
        byte[] keyBytes = generateRandomBytes(keySize);
        return new SecretKeySpec(keyBytes, ALGORITHM);
    }
}