package assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static RegisterPage page1;
    public static LoginPage page2;
    public static InputPage page3;
    public static InputPageA page4;
    public static String userEmail;
    public static Admin loginAdmin = null;
    public static MedicalStaff_General loginMedicalStaff = null;

    public static void main(String[] args) throws Exception{
        List<Transaction> approvedTransactions = new ArrayList<>();

        String csvFile = "C:/Users/HP/Documents/NetBeansProjects/2/assignment/BCD2.csv";
        String line = "";
        String csvSplitBy = ",";

        // Create a single blockchain object outside the loop
        Blockchain blockchain = new Blockchain();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (data.length == 9 && "Approve".equalsIgnoreCase(data[8].trim())) {
                    Transaction transaction = new Transaction(data[0], data[1], data[2], data[3],
                            data[4], data[5], data[6], data[7], data[8]);
                    List<String> list = new ArrayList<>(Arrays.asList(data));
                    Header header = new Header(blockchain.getBlocks().get(blockchain.getBlocks().size() - 1).getHash(), System.currentTimeMillis()); // Use the previous block's hash
                    List<Transaction> transactions = new ArrayList<>();
                    transactions.add(transaction);
                                      Block block = new Block(header, transactions, blockchain.getBlocks().get(blockchain.getBlocks().size() - 1).getHash(), list);

                    blockchain.addBlock(block);

                    }
                }
                    // Print out the blockchain for this transaction
                    System.out.println("Blockchain for transaction:");
                    List<Block> blocks = blockchain.getBlocks();
                    for (int i = 0; i < blocks.size(); i++) {
                        System.out.println("Block " + i + ":");
                        System.out.println(blocks.get(i));
                        System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        HomePage homepage = new HomePage();
        homepage.setVisible(true);
        page1 = new RegisterPage();
        page2 = new LoginPage();
        page3 = new InputPage();
        page4 = new InputPageA();
    }
}
