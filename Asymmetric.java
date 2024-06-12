package assignment;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
public class Asymmetric {
    private Cipher cipher;
    public static final String ALGORITHM = "RSA";
    
    private Asymmetric(String transformation) throws NoSuchAlgorithmException, NoSuchPaddingException{
        this.cipher = Cipher.getInstance(transformation);
    }
    
    public Asymmetric() throws NoSuchAlgorithmException, NoSuchPaddingException{
        this.cipher = Cipher.getInstance(ALGORITHM);
    }
    
    public String encrypt(String data, PublicKey pubKey) throws Exception{
        String cipherText = null;
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        byte[] cipherBytes = cipher.doFinal(data.getBytes());
        cipherText = Base64.getEncoder().encodeToString(cipherBytes);
        return cipherText;
    }
    
    public String decrypt(String cipherText, PrivateKey privKey) throws Exception{
        cipher.init(Cipher.DECRYPT_MODE, privKey);
        byte[] cipherBytes = Base64.getDecoder().decode(cipherText);
        byte[] dataBytes = cipher.doFinal(cipherBytes);
        return new String(dataBytes);
    }
}
