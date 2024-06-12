package assignment;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
public class Symmetric {
    private Cipher cipher;
    private static final String ALGORITHM = "AES";
    
    //the algorithm is set as AES but if other should be used, this method is called
    public Symmetric(String transformation) throws NoSuchAlgorithmException, NoSuchPaddingException{
        this.cipher = Cipher.getInstance(transformation);
    }
    
    public Symmetric() throws NoSuchAlgorithmException, NoSuchPaddingException{
        this.cipher = Cipher.getInstance(ALGORITHM);
    }
    
    public String encrypt(String data, Key key) throws Exception{
        String cipherText = null;
        //init
        cipher.init(Cipher.ENCRYPT_MODE, key);
        //encrypt
        byte[] cipherBytes = cipher.doFinal(data.getBytes());
        //convert to String
        cipherText = Base64.getEncoder().encodeToString(cipherBytes);
        return cipherText;
    }
    
    public String decrypt(String cipherText, Key key) throws Exception{
        //init
        cipher.init(Cipher.DECRYPT_MODE, key);
        //convert to byte[]
        byte[] cipherBytes = Base64.getDecoder().decode(cipherText);
        //decrypt
        byte[] dataBytes = cipher.doFinal(cipherBytes);
        return new String(dataBytes);
    }
}
