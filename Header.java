package assignment;
public class Header {
    private String previousHash;
    private long timestamp;

    public Header(String previousHash,long timestamp) {
        this.previousHash = previousHash;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "{\"previousHash\": \"" + previousHash + 
                "\", \"timestamp\": " + timestamp + "}";
    }

    public long getTimestamp() {
        return timestamp;
    }
}
