package assignment;
import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private List<Block> blocks;
    private List<String> data;
    public Blockchain() {
        this.blocks = new ArrayList<>();
        addGenesisBlock();
    }

    private void addGenesisBlock() {
        Header header = new Header("0", System.currentTimeMillis());
        Block genesisBlock = new Block(header, new ArrayList<>(), "0",data);
        blocks.add(genesisBlock);
    }
    
    public void addBlock(Block block) {
        blocks.add(block);
    }

     public boolean isValid() {
        for (int i = 1; i < blocks.size(); i++) {
            Block currentBlock = blocks.get(i);
            Block previousBlock = blocks.get(i - 1);

            if (!currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
                return false; // Invalid blockchain
            }
        }
        return true; // Valid blockchain
    }
     
    public List<Block> getBlocks() {
        return blocks;
    }
}
