package assignment;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Change_Info_Button = new javax.swing.JButton();
        SubmitApp_Button = new javax.swing.JButton();
        ViewProfile_Button = new javax.swing.JButton();
        ViewApplication_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MEDICAL STAFF MENU");

        Change_Info_Button.setText("Change Info");
        Change_Info_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_Info_ButtonActionPerformed(evt);
            }
        });

        SubmitApp_Button.setText("Submit Application");
        SubmitApp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitApp_ButtonActionPerformed(evt);
            }
        });

        ViewProfile_Button.setText("View Profile");
        ViewProfile_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProfile_ButtonActionPerformed(evt);
            }
        });

        ViewApplication_Button.setText("View Application");
        ViewApplication_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewApplication_ButtonActionPerformed(evt);
            }
        });

        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(Change_Info_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(ViewApplication_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubmitApp_Button)
                            .addComponent(ViewProfile_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Change_Info_Button)
                .addGap(18, 18, 18)
                .addComponent(SubmitApp_Button)
                .addGap(18, 18, 18)
                .addComponent(ViewProfile_Button)
                .addGap(18, 18, 18)
                .addComponent(ViewApplication_Button)
                .addGap(18, 18, 18)
                .addComponent(Exit_Button)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Change_Info_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_Info_ButtonActionPerformed
        setVisible(false);
        User_ChooseFieldToChange ChangeInfo = new User_ChooseFieldToChange(Main.loginMedicalStaff.getId());
        ChangeInfo.setVisible(true);
    }//GEN-LAST:event_Change_Info_ButtonActionPerformed

    private void ViewProfile_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProfile_ButtonActionPerformed
        setVisible(false);
        ViewProfile View_Profile = new ViewProfile(Main.loginMedicalStaff.getUsername());
        View_Profile.setVisible(true);
    }//GEN-LAST:event_ViewProfile_ButtonActionPerformed

    private void ViewApplication_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewApplication_ButtonActionPerformed
        setVisible(false);
        ViewApplication viewApplication = new ViewApplication(Main.loginMedicalStaff.getId());
        viewApplication.setVisible(true);
    }//GEN-LAST:event_ViewApplication_ButtonActionPerformed

    private void SubmitApp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitApp_ButtonActionPerformed
        setVisible(false);
        try {
            ApplicationForm appform = new ApplicationForm();
            appform.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitApp_ButtonActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        setVisible(false);
        HomePage homepage = new HomePage();
        homepage.setVisible(true);
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change_Info_Button;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JButton SubmitApp_Button;
    private javax.swing.JButton ViewApplication_Button;
    private javax.swing.JButton ViewProfile_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
