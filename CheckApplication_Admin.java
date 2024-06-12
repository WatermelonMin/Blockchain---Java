package assignment;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CheckApplication_Admin extends javax.swing.JFrame {
    private String CredentialNumber;
    
    public CheckApplication_Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AppID_Label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Occupation_Text = new javax.swing.JLabel();
        FullyQualified_Text = new javax.swing.JLabel();
        Specialization_Text = new javax.swing.JLabel();
        Expired_Date_Text = new javax.swing.JLabel();
        ApplicationID_Label = new javax.swing.JLabel();
        CredentialNumber_Label = new javax.swing.JLabel();
        FirstName_Label = new javax.swing.JLabel();
        LastName_Label = new javax.swing.JLabel();
        Occupation_Label = new javax.swing.JLabel();
        Qualification_Label = new javax.swing.JLabel();
        Specialization_Label = new javax.swing.JLabel();
        ExpiryDate_Label = new javax.swing.JLabel();
        Reject_Button = new javax.swing.JButton();
        Approve_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MiddleName_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Application: ");

        AppID_Label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AppID_Label.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Application ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Credential Number:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("First Name:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Last Name:");

        Occupation_Text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Occupation_Text.setText("Occupation:");

        FullyQualified_Text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FullyQualified_Text.setText("Qualification:");

        Specialization_Text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Specialization_Text.setText("Specialization:");

        Expired_Date_Text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Expired_Date_Text.setText("Expiry Date:");

        ApplicationID_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ApplicationID_Label.setText("appid");

        CredentialNumber_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CredentialNumber_Label.setText("creno");

        FirstName_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FirstName_Label.setText("fname");

        LastName_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LastName_Label.setText("lname");

        Occupation_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Occupation_Label.setText("occ");

        Qualification_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Qualification_Label.setText("qua");

        Specialization_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Specialization_Label.setText("spec");

        ExpiryDate_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ExpiryDate_Label.setText("date");

        Reject_Button.setText("Reject");
        Reject_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reject_ButtonActionPerformed(evt);
            }
        });

        Approve_Button.setText("Approve");
        Approve_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Approve_ButtonActionPerformed(evt);
            }
        });

        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Middle Name:");

        MiddleName_Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MiddleName_Label.setText("mname");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ApplicationID_Label)
                                    .addComponent(CredentialNumber_Label)
                                    .addComponent(FirstName_Label)
                                    .addComponent(MiddleName_Label)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LastName_Label)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Occupation_Text)
                                    .addComponent(Specialization_Text)
                                    .addComponent(FullyQualified_Text)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(Expired_Date_Text)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Qualification_Label)
                            .addComponent(Specialization_Label)
                            .addComponent(Occupation_Label)
                            .addComponent(ExpiryDate_Label))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 95, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AppID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Approve_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Reject_Button)
                                .addGap(97, 97, 97)))
                        .addComponent(Back_Button)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AppID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(ApplicationID_Label))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(CredentialNumber_Label))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(FirstName_Label))
                                .addGap(52, 52, 52))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(MiddleName_Label)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(LastName_Label)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Occupation_Text)
                            .addComponent(Occupation_Label))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FullyQualified_Text)
                            .addComponent(Qualification_Label))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Specialization_Text)
                            .addComponent(Specialization_Label))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Expired_Date_Text)
                            .addComponent(ExpiryDate_Label))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Approve_Button)
                    .addComponent(Reject_Button)
                    .addComponent(Back_Button))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Reject_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reject_ButtonActionPerformed
        setVisible(false);
        AdminPage_Reject adminPage_Reject = new AdminPage_Reject(CredentialNumber);
        adminPage_Reject.setVisible(true);       
    }//GEN-LAST:event_Reject_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        setVisible(false);
        AdminPage adminpage = new AdminPage();
        adminpage.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Approve_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Approve_ButtonActionPerformed
        DataIO dataIO = new DataIO();
        dataIO.editRecord(CredentialNumber,"-","Approve");            
        setVisible(false);
        AdminPage adminPage = new AdminPage();
        adminPage.setVisible(true);  
    }//GEN-LAST:event_Approve_ButtonActionPerformed

    private String[] loadDataFromCSV(){
    String csvFilePath = "C:\\Users\\User\\Documents\\Blockchain\\code\\assignment\\BCD2.csv"; // Specify the path to your CSV file
    
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Split the line by comma to get individual fields
                if (data.length >= 2 && data[0].equals(CredentialNumber)) {
                    // Credential Number is at index 1 (assuming it's the second field)
                    // If Credential Number matches, process the data as needed
                    String[] result = new String[8]; // Array to store the values of all 8 fields
                    result[0] = data[0]; // Application ID
                    result[1] = data[1]; // Credential Number
                    result[2] = data[2]; // First Name
                    result[3] = data[3]; // Middle Name
                    result[4] = data[4]; // Last Name
                    result[5] = data[5]; // Occupation
                    result[6] = data[6]; // Qualification
                    result[7] = data[7]; // Specialization
                    result[8] = data[8]; // Expiry Date
                    System.out.println("Match found:");
                    return result;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // If no match is found, return null
        return null;
    }
    
    public void compareData(String ApplicationID, String CredentialNumber, String FirstName, String MiddleName,
            String LastName, String Occupation, String Qualification, String Specialization, String ExpiryDate) {
        
        this.CredentialNumber = CredentialNumber;

        String [] csvData = loadDataFromCSV();
            if (csvData != null) {
            // Compare each field with the corresponding parameter
            if (!csvData[0].equals(CredentialNumber)) {
                CredentialNumber_Label.setForeground(Color.RED); // Highlight with red color
            }
            if (!csvData[1].equals(FirstName)) {
                FirstName_Label.setForeground(Color.RED); // Highlight with red color
            }
            if (!csvData[2].equals(MiddleName)) {
                MiddleName_Label.setForeground(Color.RED); // Highlight with red color
            }
            if (!csvData[3].equals(LastName)) {
                LastName_Label.setForeground(Color.RED); // Highlight with red color
            }
             if (!csvData[4].equals(Occupation)) {
                Occupation_Label.setForeground(Color.RED); // Highlight with red color
            }
            if (!csvData[5].equals(Qualification)) {
                Qualification_Label.setForeground(Color.RED); // Highlight with red color
            }
            if (!csvData[6].equals(Specialization)) {
                Specialization_Label.setForeground(Color.RED); // Highlight with red color
            }
            if (!csvData[7].equals(ExpiryDate)) {
            ExpiryDate_Label.setForeground(Color.RED); // Highlight with red color
            }
            // Similarly, compare other fields and highlight if necessary
        }
            ApplicationID_Label.setText(ApplicationID);
            CredentialNumber_Label.setText(CredentialNumber);
            FirstName_Label.setText(FirstName);
            MiddleName_Label.setText(MiddleName);
            LastName_Label.setText(LastName);
            Occupation_Label.setText(Occupation);
            Qualification_Label.setText(Qualification);
            Specialization_Label.setText(Specialization);
            ExpiryDate_Label.setText(ExpiryDate); 
            AppID_Label.setText(ApplicationID);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppID_Label;
    private javax.swing.JLabel ApplicationID_Label;
    private javax.swing.JButton Approve_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel CredentialNumber_Label;
    private javax.swing.JLabel Expired_Date_Text;
    private javax.swing.JLabel ExpiryDate_Label;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JLabel FullyQualified_Text;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JLabel MiddleName_Label;
    private javax.swing.JLabel Occupation_Label;
    private javax.swing.JLabel Occupation_Text;
    private javax.swing.JLabel Qualification_Label;
    private javax.swing.JButton Reject_Button;
    private javax.swing.JLabel Specialization_Label;
    private javax.swing.JLabel Specialization_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}