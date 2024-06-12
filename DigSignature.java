package assignment;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
public class DigSignature {
    private static final String ALGORITHM = "SHA256WithRSA";
    private Signature sig;
    
    public DigSignature() throws NoSuchAlgorithmException {
        sig = Signature.getInstance(ALGORITHM);
    }
    
    public byte[] getSignature(String text, PrivateKey key) throws SignatureException, InvalidKeyException{
        sig.initSign(key);
        sig.update(text.getBytes());
        return sig.sign();
    }
    
    public boolean isValid(String text, byte[] signature, PublicKey key) throws SignatureException, InvalidKeyException{
        sig.initVerify(key);
        sig.update(text.getBytes());
        return sig.verify(signature);
    }
}
