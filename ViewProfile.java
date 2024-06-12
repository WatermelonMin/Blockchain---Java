package assignment;
import java.io.File;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.spec.SecretKeySpec;
public class ViewProfile extends javax.swing.JFrame {

    public ViewProfile(String Username) {
        initComponents();
        ShowInfo(Username);
    }

    public void ShowInfo(String Username){
        //Path to the file
        String filePath = "medicalstaff.txt";
            try {
                Scanner scanner = new Scanner(new File(filePath));
                String CredentialNumber = ""; String username = ""; String Password = "";
                String FirstName ="";String MiddleName = "";String LastName = ""; String Birthdate = ""; String Gender = "";
                String Email = "";String Status = "";String Comment = "";String Secret = "";
                while (scanner.hasNext()) {
                    // Read the line
                    // Split the line into fields
                    CredentialNumber = scanner.nextLine();
                    username = scanner.nextLine();
                    Password = scanner.nextLine();
                    FirstName = scanner.nextLine();
                    MiddleName = scanner.nextLine();
                    LastName = scanner.nextLine();
                    Birthdate = scanner.nextLine();
                    Gender = scanner.nextLine();
                    Email = scanner.nextLine();
                    Status = scanner.nextLine();
                    Comment = scanner.nextLine();
                    Secret = scanner.nextLine();
                    scanner.nextLine();
                    
                    if(Username.equals(username)) {
                        Symmetric symm = new Symmetric();
                        byte[] decodedKey = Base64.getDecoder().decode(Secret);
                        SecretKeySpec key = new SecretKeySpec(decodedKey, "AES");
                        String decrypted = symm.decrypt(Password, key);
                        
                        CredentialNumber_Label.setText(CredentialNumber);
                        Username_Label.setText(username);
                        Encrypted_Label.setText(Password);
                        Password_Label.setText(decrypted);
                        FirstName_Label.setText(FirstName);
                        MiddleName_Label.setText(MiddleName);
                        LastName_Label.setText(LastName);
                        BirthDate_Label.setText(Birthdate);
                        Gender_Label.setText(Gender);
                        Email_Label.setText(Email);
                        Status_Label.setText(Status);
                        Comment_Label.setText(Comment);
                        User_Label.setText(username);
                        Secret_Label.setText(Secret);
                        break;
                    }               
                }
                scanner.close(); 
            } catch (Exception ex) {
                Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        User_Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CredentialNumber_Label = new javax.swing.JLabel();
        Username_Label = new javax.swing.JLabel();
        Encrypted_Label = new javax.swing.JLabel();
        LastName_Label = new javax.swing.JLabel();
        FirstName_Label = new javax.swing.JLabel();
        Comment_Label = new javax.swing.JLabel();
        BirthDate_Label = new javax.swing.JLabel();
        Gender_Label = new javax.swing.JLabel();
        Email_Label = new javax.swing.JLabel();
        Status_Label = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Back_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        MiddleName_Label = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Secret_Label = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        User_Label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        User_Label.setText("Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Crediential Number:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Encrypted Password:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("First Name:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("BirthDate:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Gender:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Email:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Status:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Comment:");

        CredentialNumber_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CredentialNumber_Label.setText("CreNo");

        Username_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Username_Label.setText("user");

        Encrypted_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Encrypted_Label.setText("encrypt");

        LastName_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LastName_Label.setText("lname");

        FirstName_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FirstName_Label.setText("fname");

        Comment_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Comment_Label.setText("Comment Example");

        BirthDate_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BirthDate_Label.setText("date");

        Gender_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Gender_Label.setText("gender");

        Email_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Email_Label.setText("email");

        Status_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Status_Label.setText("stat");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Hi,");

        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Password:");

        Password_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password_Label.setText("pass");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Middle Name:");

        MiddleName_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MiddleName_Label.setText("mname");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Secret Key:");

        Secret_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Secret_Label.setText("secret");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel11)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(User_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CredentialNumber_Label)
                                    .addComponent(Encrypted_Label)
                                    .addComponent(Username_Label)
                                    .addComponent(FirstName_Label)
                                    .addComponent(LastName_Label))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Comment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gender_Label)
                            .addComponent(BirthDate_Label)
                            .addComponent(Password_Label)
                            .addComponent(MiddleName_Label)
                            .addComponent(Email_Label)
                            .addComponent(Status_Label)))
                    .addComponent(Secret_Label))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Back_Button)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CredentialNumber_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Username_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(Encrypted_Label)
                                .addComponent(Password_Label)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FirstName_Label)
                            .addComponent(jLabel13)
                            .addComponent(MiddleName_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LastName_Label)
                            .addComponent(jLabel9)
                            .addComponent(Email_Label)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(BirthDate_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Gender_Label))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Status_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(Back_Button)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Comment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Secret_Label))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
            setVisible(false);
            Menu menu = new Menu();
            menu.setVisible(true);        
    }//GEN-LAST:event_Back_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel BirthDate_Label;
    private javax.swing.JLabel Comment_Label;
    private javax.swing.JLabel CredentialNumber_Label;
    private javax.swing.JLabel Email_Label;
    private javax.swing.JLabel Encrypted_Label;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JLabel Gender_Label;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JLabel MiddleName_Label;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JLabel Secret_Label;
    private javax.swing.JLabel Status_Label;
    private javax.swing.JLabel User_Label;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
