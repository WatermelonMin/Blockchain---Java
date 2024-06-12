package assignment;
import assignment.Change_info_field;
public class User_ChooseFieldToChange extends javax.swing.JFrame {
    private String CredentialNo;
    
    public User_ChooseFieldToChange(String CredentialNo) {
        initComponents();
        this.CredentialNo = CredentialNo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasswordButton = new javax.swing.JButton();
        UsernameButton = new javax.swing.JButton();
        EmailButton = new javax.swing.JButton();
        BackToMeny_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PasswordButton.setText("Change Password");
        PasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordButtonActionPerformed(evt);
            }
        });

        UsernameButton.setText("Change Username");
        UsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameButtonActionPerformed(evt);
            }
        });

        EmailButton.setText("Change Email");
        EmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailButtonActionPerformed(evt);
            }
        });

        BackToMeny_Button.setText("Back");
        BackToMeny_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMeny_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Edit Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(UsernameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmailButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BackToMeny_Button)
                        .addGap(32, 32, 32)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UsernameButton)
                .addGap(34, 34, 34)
                .addComponent(PasswordButton)
                .addGap(32, 32, 32)
                .addComponent(EmailButton)
                .addGap(27, 27, 27)
                .addComponent(BackToMeny_Button)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
        setVisible(false);
        Change_info_field changeInfoField = new Change_info_field("Password",CredentialNo);
        changeInfoField.setVisible(true);
    }//GEN-LAST:event_PasswordButtonActionPerformed

    private void UsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameButtonActionPerformed
        setVisible(false);
        Change_info_field changeInfoField = new Change_info_field("Username",CredentialNo);
        changeInfoField.setVisible(true);
    }//GEN-LAST:event_UsernameButtonActionPerformed

    private void EmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailButtonActionPerformed
        setVisible(false);
        Change_info_field changeInfoField = new Change_info_field("email",CredentialNo);
        changeInfoField.setVisible(true);
    }//GEN-LAST:event_EmailButtonActionPerformed

    private void BackToMeny_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMeny_ButtonActionPerformed
        setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);   
    }//GEN-LAST:event_BackToMeny_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMeny_Button;
    private javax.swing.JButton EmailButton;
    private javax.swing.JButton PasswordButton;
    private javax.swing.JButton UsernameButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
