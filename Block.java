package assignment;
import java.security.MessageDigest;
import java.util.List;
import org.apache.commons.codec.binary.Hex;

public class Block {
    private Header header;
    private List<Transaction> transactions;
    private String previousHash;
    private String hash;
    private String merkleRoot;

    public Block(Header header, List<Transaction> transactions,String previousHash,List<String> data) {
        this.header = header;
        this.transactions = transactions;
        this.previousHash = previousHash;
        this.hash = calculateHash(header.toString() + transactions.toString() + previousHash, "SHA-256");
            if (!transactions.isEmpty()) {
        MerkleTree merkleTree = MerkleTree.getInstance(data);
        merkleTree.build();
        this.merkleRoot=merkleTree.getRoot();
    }else{
        this.merkleRoot = "0";
    }
    }
    
    private String calculateHash(String input,String algorithm){
       String hashCode = ""; 
       try{
           MessageDigest md = MessageDigest.getInstance(algorithm);
           md.update(input.getBytes());
           byte[] hashBytes = md.digest();
           
           hashCode = Hex.encodeHexString(hashBytes);
       }catch(Exception e){
           e.printStackTrace();
       }
       return hashCode;
     
    }
    
    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }
     public String getMerkleRoot() {
        return merkleRoot;
    }
    
    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }
    
    private String formatTransactions(List<Transaction> transactions) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            sb.append("\"").append(transaction.toString()).append("\"");
            if (i < transactions.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    @Override
    
    public String toString() {
         return "{\n" +
            "  \"header\": " + header.toString() + ",\n" +
            "  \"tranxLst\": [\n" +
            "    " + formatTransactions(transactions) + "\n" +
            "  ],\n" +
            "  \"CurrentHash\": \"" + hash + "\",\n" +                 
            "  \"previousHash\": \"" + previousHash + "\",\n" +
            "  \"merkleRoot\": \"" + merkleRoot + "\",\n" +
            "  \"timestamp\": " + header.getTimestamp() + "\n" +
            "}";
    }

}
