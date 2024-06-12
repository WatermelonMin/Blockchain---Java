package assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class AdminPage_PickApplication extends javax.swing.JFrame {
    private String[][] data; // Declare class-level variable
    
    public AdminPage_PickApplication() {
        initComponents();
        data = loadData();
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                // Iterate over each array in the dataArray
        for (String[] innerArray : data) {
            // Add the innerArray as a row in the table
            tblModel.addRow(innerArray);
        }
    }
    
    private String[][] loadData() {
        try {
            File file = new File("applications.txt");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\\n\\s*\\n"); // Use empty lines as delimiter

            List<String[]> userDataList = new ArrayList<>();

            // Read each user data and split into fields
            while (scanner.hasNext()) {
                String userData = scanner.next().trim();
                String[] userDataFields = userData.split("\\r?\\n");
                userDataList.add(userDataFields);
            }

            // Convert the list to a 2D array
            String[][] userDataArray = userDataList.toArray(new String[0][]);

            scanner.close();
            return userDataArray;

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return null;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Back_Button = new javax.swing.JButton();
        Confirm_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ApplicationID", "Credentail Number"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Confirm_Button.setText("Confirm");
        Confirm_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Back_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(Confirm_Button)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirm_Button)
                    .addComponent(Back_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void Confirm_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_ButtonActionPerformed
        int i = jTable1.getSelectedRow();
        try {
            String ApplicationID = jTable1.getValueAt(i, 0).toString(); 
        
            // Iterate over each 2D array in the 3D array
            for (String[] innerArray : data) {
                // Check if the first element of the inner array matches the ApplicationID
                if (innerArray.length > 0 && innerArray[0].equals(ApplicationID)) {
                    // Extract the necessary data
                    String applicationID = innerArray[0];
                    String credentialNumber = innerArray[1];
                    String FirstName = innerArray[2];
                    String MiddleName = innerArray[3];
                    String LastName = innerArray[4];
                    String Occupation = innerArray[5];  
                    String Qualification = innerArray[6];
                    String Specialization = innerArray[7];
                    String ExpiryDate = innerArray[8];   
                    String Signature = innerArray[9];

                    try {
                        // Initialize DigSignature object
                        DigSignature sig = new DigSignature();

                        // Get public key
                        PublicKey pubKey = KeyAccess.getPublicKey("assignment/MyKeyPair/PublicKey");

                        // Text data to verify
                        String text = applicationID + ";" + credentialNumber + ";" + FirstName + ";" + MiddleName
                                + ";" + LastName + ";" + Occupation + ";" + Qualification + ";" + Specialization
                                + ";" + ExpiryDate;

                        // Signature bytes 
                        byte[] signatureBytes = Base64.getDecoder().decode(Signature);

                        // Verify signature
                        boolean valid = sig.isValid(text, signatureBytes, pubKey);

                        if (valid) {
                            JOptionPane.showMessageDialog(this, "Signature is valid.");
                            setVisible(false);
                            CheckApplication_Admin checkApplication = new CheckApplication_Admin();
                            checkApplication.compareData(applicationID, credentialNumber, FirstName, MiddleName,
                                    LastName, Occupation, Qualification, Specialization, ExpiryDate);
                            checkApplication.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(this, "Signature is invalid.");
                            setVisible(false);
                            AdminPage_Reject adminPage_Reject = new AdminPage_Reject(credentialNumber);
                            adminPage_Reject.setVisible(true);    
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(AdminPage_PickApplication.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break; // Exit the loop after finding the matching ApplicationID
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle any potential exceptions here
        }
    }//GEN-LAST:event_Confirm_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        setVisible(false);
        AdminPage adminpage = new AdminPage();
        adminpage.setVisible(true);    
    }//GEN-LAST:event_Back_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Confirm_Button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}