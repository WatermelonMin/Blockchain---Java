/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;



import static assignment.Hasher.sha256;
import java.util.ArrayList;
import java.util.List;


public class MerkleTree {
    private List<String> transactionList;
    private String root;

    //Constructor
    private MerkleTree(List<String> transactionList) {
        this.transactionList = transactionList;
        this.root = "0";
    }
    
    
    public static MerkleTree getInstance(List<String> transactionList){
        return new MerkleTree(transactionList);
    }
    
    public void build(){
        List<String> tempHashList = new ArrayList<>(transactionList);
        
        while(tempHashList.size() > 1){
            tempHashList = generateNextLevelHashList(tempHashList);
        }
        
        root = tempHashList.get(0);
        System.out.println(root);
//        return root;
    }

    private List<String> generateNextLevelHashList(List<String> hashList) {
        List<String> nextLevelList = new ArrayList<>();
        
        //Comparing pair of data, then + 2 to compare another pair
        for (int i = 0; i < hashList.size(); i+=2) {
            String left = hashList.get(i);
            String right = (i + 1 < hashList.size())?hashList.get(i+1):"";
            String combinedHash = sha256(left + right);
            nextLevelList.add(combinedHash);
        }
        return nextLevelList;
    }
    
    public String getRoot(){
        return root;
    }
    
    public void addTransaction(String transaction){
        transactionList.add(transaction);
        //rebuild merkle tree and update merkle root
        this.build();
    }
    
}
