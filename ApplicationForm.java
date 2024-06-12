package assignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.security.PrivateKey;
import java.util.Base64;
import javax.swing.JOptionPane;

public class ApplicationForm extends javax.swing.JFrame {
    ApplicationIDGenerator id = new ApplicationIDGenerator();
    boolean keyPairGenerated = false; // Flag to track if key pair is generated
    
    public ApplicationForm() throws Exception {
        initComponents();
        genappID.setText(id.generateID());
        generateKeyPair();
    }
    
    // Method to generate the key pair
    private void generateKeyPair() {
        if (!keyPairGenerated) {
            try {
                // Check if the key pair files already exist
                File publicKeyFile = new File("assignment/MyKeyPair/PublicKey");
                File privateKeyFile = new File("assignment/MyKeyPair/PrivateKey");

                if (!publicKeyFile.exists() || !privateKeyFile.exists()) {
                    // Generate the key pair if files do not exist
                    MyKeyPair.create();
                    byte[] publicKey = MyKeyPair.getPublicKey().getEncoded();
                    byte[] privateKey = MyKeyPair.getPrivateKey().getEncoded();

                    MyKeyPair.put(publicKey, "assignment/MyKeyPair/PublicKey");
                    MyKeyPair.put(privateKey, "assignment/MyKeyPair/PrivateKey");
                }

                keyPairGenerated = true; // Set the flag to true
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formName = new javax.swing.JLabel();
        appID = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        creNo = new javax.swing.JLabel();
        mName = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        occ = new javax.swing.JLabel();
        spec = new javax.swing.JLabel();
        qua = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        creNoText = new javax.swing.JTextField();
        fNameText = new javax.swing.JTextField();
        genappID = new javax.swing.JLabel();
        lNameText = new javax.swing.JTextField();
        quaText = new javax.swing.JTextField();
        specText = new javax.swing.JTextField();
        mNameText = new javax.swing.JTextField();
        occText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        backBut = new javax.swing.JButton();
        submitBut1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        formName.setText("Application");

        appID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        appID.setText("Application ID: ");

        fname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fname.setText("First Name:");

        creNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        creNo.setText("Credential No:");

        mName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mName.setText("Middle Name:");

        lName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lName.setText("Last Name:");

        occ.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        occ.setText("Occupation:");

        spec.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spec.setText("Specialization:");

        qua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qua.setText("Qualification:");

        date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        date.setText("Expiry Date:");

        creNoText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        creNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creNoTextActionPerformed(evt);
            }
        });

        fNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextActionPerformed(evt);
            }
        });

        genappID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genappID.setText("AppID");

        lNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTextActionPerformed(evt);
            }
        });

        quaText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaTextActionPerformed(evt);
            }
        });

        specText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        specText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specTextActionPerformed(evt);
            }
        });

        mNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNameTextActionPerformed(evt);
            }
        });

        occText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        occText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occTextActionPerformed(evt);
            }
        });

        dateText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });

        backBut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backBut.setText("Back");
        backBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButActionPerformed(evt);
            }
        });

        submitBut1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        submitBut1.setText("Submit");
        submitBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBut1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formName)
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(appID)
                        .addGap(18, 18, 18)
                        .addComponent(genappID)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(submitBut1)
                        .addGap(85, 85, 85)
                        .addComponent(backBut))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creNo)
                            .addComponent(occ)
                            .addComponent(fname)
                            .addComponent(qua)
                            .addComponent(date)
                            .addComponent(spec)
                            .addComponent(lName)
                            .addComponent(mName))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameText)
                            .addComponent(specText)
                            .addComponent(occText)
                            .addComponent(dateText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quaText)
                            .addComponent(creNoText)
                            .addComponent(lNameText)
                            .addComponent(mNameText))))
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(occ)
                            .addComponent(occText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(formName)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appID)
                            .addComponent(genappID))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(creNo)
                            .addComponent(creNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mName))
                        .addGap(97, 97, 97)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qua)
                    .addComponent(quaText, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBut1)
                    .addComponent(backBut))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creNoTextActionPerformed

    private void fNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTextActionPerformed

    private void lNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTextActionPerformed

    private void specTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specTextActionPerformed

    private void mNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNameTextActionPerformed

    private void occTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occTextActionPerformed

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextActionPerformed

    private void quaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quaTextActionPerformed

    private void backButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButActionPerformed
        setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_backButActionPerformed

    private void submitBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBut1ActionPerformed
        try {
            if(creNoText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Enter Credential Number!!");
                creNoText.grabFocus();
                return;
            } else if(fNameText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Enter Your First Name!!");
                creNoText.grabFocus();
                return;
            } else if(lNameText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Enter Your Last Name!!");
                creNoText.grabFocus();
                return;
            } else if(mNameText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Enter Your Middle Name!!");
                creNoText.grabFocus();
                return;
            } else if(occText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Enter Your Occupation!!");
                creNoText.grabFocus();
                return;
            } else if(quaText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Enter Your Qualifications!!");
                creNoText.grabFocus();
                return;
            } else if(specText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Enter Your Specialization!!");
                creNoText.grabFocus();
                return;
            } else if(dateText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Enter Expiry Date!!");
                creNoText.grabFocus();
                return;
            } else {
                PrivateKey privKey = KeyAccess.getPrivateKey("assignment/MyKeyPair/PrivateKey");  
                
                String applicationID = genappID.getText();
                String credentialNo = creNoText.getText();
                String firstName = fNameText.getText();
                String middleName = mNameText.getText();
                String lastName = lNameText.getText();
                String occupation = occText.getText();
                String qualification = quaText.getText();
                String specialization = specText.getText();
                String expiryDate = dateText.getText();
                
                // Create medical staff application
                MedicalStaffApplication application = new MedicalStaffApplication(
         applicationID, credentialNo, firstName, lastName, middleName,
           occupation, qualification, specialization, expiryDate);
                
                // Convert application data to text format for signing
                String applicationText = applicationID + ";" +
                                         credentialNo + ";" +
                                         firstName + ";" +
                                         middleName + ";" +
                                         lastName + ";" +
                                         occupation + ";" +
                                         qualification + ";" +
                                         specialization + ";" +
                                         expiryDate;
                
                DigSignature sig = new DigSignature();

                byte[] signature = sig.getSignature(applicationText, privKey);
                String digsignature = Base64.getEncoder().encodeToString(signature);
               
                // Set the digital signature for the application
                application.setSignature(digsignature);

                // Add the application to the array & text file
                DataIO.allApplications.add(application);
                DataIO.writeToApplicationFile();
                
                // Increment and set the application ID for the next submission
                genappID.setText(id.generateID());

                JOptionPane.showMessageDialog(rootPane, "Application Submission Successful!!");
                creNoText.setText("");
                fNameText.setText("");
                lNameText.setText("");
                mNameText.setText("");
                occText.setText("");
                quaText.setText("");
                specText.setText("");
                dateText.setText("");
                return;
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error Submitting Application: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitBut1ActionPerformed

    public class ApplicationIDGenerator {
        private int counter = 0;
        
        public ApplicationIDGenerator() {
            // Initialize counter by finding the maximum ID from the text file
            try {
                BufferedReader reader = new BufferedReader(new FileReader("applications.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    // Assuming the first line is the application ID
                    String id = line.trim();
                    // Check if the line represents an application ID
                    if (id.matches("^A\\d+$")) { // Matches "A" followed by digits
                        String idNumericPart = id.substring(1); // Remove the 'A' prefix
                        int idNumber = Integer.parseInt(idNumericPart);
                        if (idNumber > counter) {
                            counter = idNumber;
                        }
                    }
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String generateID() {
            // Increment the counter and generate the next ID
            counter++;
            return "A" + String.format("%04d", counter);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appID;
    private javax.swing.JButton backBut;
    private javax.swing.JLabel creNo;
    private javax.swing.JTextField creNoText;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField fNameText;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel formName;
    private javax.swing.JLabel genappID;
    private javax.swing.JLabel lName;
    private javax.swing.JTextField lNameText;
    private javax.swing.JLabel mName;
    private javax.swing.JTextField mNameText;
    private javax.swing.JLabel occ;
    private javax.swing.JTextField occText;
    private javax.swing.JLabel qua;
    private javax.swing.JTextField quaText;
    private javax.swing.JLabel spec;
    private javax.swing.JTextField specText;
    private javax.swing.JButton submitBut1;
    // End of variables declaration//GEN-END:variables
}
