package assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ViewApplication extends javax.swing.JFrame {
    
    public ViewApplication(String CredentialNo) {
        initComponents();
        readApplication(CredentialNo);
    }
    
    public void readApplication(String CredentialNo) {
        //Path to the file
        String filePath = "applications.txt";
        try {
            Scanner scanner = new Scanner(new File(filePath));
            String ApplicationID = ""; String CredentialNumber = ""; String FirstName ="";
            String MiddleName = ""; String LastName = ""; String Occupation = ""; String Qualification = "";
            String Specialization = ""; String ExpiryDate = "";String Signature = "";
            while (scanner.hasNextLine()) {
                // Read the line, Split the line into fields
                ApplicationID = scanner.nextLine();
                CredentialNumber = scanner.nextLine();
                FirstName = scanner.nextLine();
                MiddleName = scanner.nextLine();
                LastName = scanner.nextLine();
                Occupation = scanner.nextLine();
                Qualification = scanner.nextLine();
                Specialization = scanner.nextLine();
                ExpiryDate = scanner.nextLine();
                Signature = scanner.nextLine();
                scanner.nextLine();
                    
                if(CredentialNo.equals(CredentialNumber)) {
                    ApplicationID_Label.setText(ApplicationID);
                    CredentialNumber_Label.setText(CredentialNumber);
                    FirstName_Label.setText(FirstName);
                    MiddleName_Label.setText(MiddleName);
                    LastName_Label.setText(LastName);
                    Occupation_Label.setText(Occupation);
                    Qualification_Label.setText(Qualification);
                    Specialization_Label.setText(Specialization);
                    Expired_Label.setText(ExpiryDate);
                    Signature_Label.setText(Signature);
                    break;
                }else {
                    ApplicationID_Label.setText("None");
                    CredentialNumber_Label.setText("None");
                    FirstName_Label.setText("None");
                    MiddleName_Label.setText("None");
                    LastName_Label.setText("None");
                    Occupation_Label.setText("None");
                    Qualification_Label.setText("None");
                    Specialization_Label.setText("None");
                    Expired_Label.setText("None");
                    Signature_Label.setText("None");
                }               
            }
            scanner.close(); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back_Button = new javax.swing.JButton();
        Expired_Label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Specialization_Label = new javax.swing.JLabel();
        Qualification_Label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Occupation_Label = new javax.swing.JLabel();
        ApplicationID_Label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CredentialNumber_Label = new javax.swing.JLabel();
        FirstName_Label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LastName_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MiddleName_Label = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Signature_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Expired_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Expired_Label.setText("Date");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Expiry Date:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Specialization:");

        Specialization_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Specialization_Label.setText("Spec");

        Qualification_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Qualification_Label.setText("Qua");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Qualification:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Occupation:");

        Occupation_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Occupation_Label.setText("Occ");

        ApplicationID_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ApplicationID_Label.setText("AppID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Application ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Credential Number:");

        CredentialNumber_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CredentialNumber_Label.setText("CreNo");

        FirstName_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FirstName_Label.setText("Fname");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("First Name:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Last Name:");

        LastName_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LastName_Label.setText("LName");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Application");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Middle Name:");

        MiddleName_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MiddleName_Label.setText("MName");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Digital Signature:");

        Signature_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Signature_Label.setText("Sig");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ApplicationID_Label)
                                        .addGap(73, 73, 73))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(FirstName_Label)
                                                    .addComponent(LastName_Label)
                                                    .addComponent(Qualification_Label)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Expired_Label)
                                                .addGap(22, 22, 22)))
                                        .addGap(54, 54, 54)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Back_Button)
                        .addGap(118, 118, 118)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CredentialNumber_Label)
                    .addComponent(MiddleName_Label)
                    .addComponent(Occupation_Label)
                    .addComponent(Specialization_Label)
                    .addComponent(Signature_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ApplicationID_Label)
                    .addComponent(jLabel4)
                    .addComponent(CredentialNumber_Label))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName_Label)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(MiddleName_Label))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LastName_Label)
                    .addComponent(jLabel7)
                    .addComponent(Occupation_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Qualification_Label)
                    .addComponent(jLabel9)
                    .addComponent(Specialization_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addComponent(Expired_Label))
                    .addComponent(Signature_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(Back_Button)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApplicationID_Label;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel CredentialNumber_Label;
    private javax.swing.JLabel Expired_Label;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JLabel MiddleName_Label;
    private javax.swing.JLabel Occupation_Label;
    private javax.swing.JLabel Qualification_Label;
    private javax.swing.JLabel Signature_Label;
    private javax.swing.JLabel Specialization_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
