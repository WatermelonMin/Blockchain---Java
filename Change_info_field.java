package assignment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.Key;
import java.util.Base64;
import java.util.Scanner ;
public class Change_info_field extends javax.swing.JFrame {
    private static Scanner x;
    private String CredentialNum;
    private JButton confirmedButton;
    public Change_info_field(String Field, String CredentialNum) {
        initComponents();
        Label(Field);
        this.CredentialNum = CredentialNum;
        
        ConfirmButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String inputText = Update_info.getText();
               editRecord(Field,inputText,CredentialNum);
            }
        });         
    }

    public void Label(String FieldToUpdate){
        String g = "Updating: " + FieldToUpdate;
        Current_info.setText(g);
    }

    public void editRecord(String fieldToUpdate, String inputText,String CredentialNo) {
        String filepath = "medicalstaff.txt";
        String tempFile = "Temp.txt";
        File oldFile = new File(filepath); 
        File newFile = new File(tempFile);
        String CredentialNumber = ""; String Username = ""; String Password = "";
        String FirstName ="";String MiddleName = "";String LastName = ""; String Birthdate = ""; String Gender = "";
        String Email = "";String Status = "";String Comment = "";String Secret = "";
        try {
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter writer = new PrintWriter(bw);
            Scanner scanner = new Scanner(new File(filepath));

            while(scanner.hasNext()) {
                CredentialNumber = scanner.nextLine();
                Username = scanner.nextLine();
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
                
                if(CredentialNumber.equals(CredentialNo)){
                    switch (fieldToUpdate) {
                        case "Username":
                            Username = inputText;
                            break;
                        case "Password":
                            String password = inputText;
                            Symmetric symm = new Symmetric();
                            Key secretKey = RandomSecretKeySpec.create();
                            String secretKeyString = Base64.getEncoder().encodeToString(secretKey.getEncoded());
                            String encrypted = symm.encrypt(password, secretKey);
                            Password = encrypted;
                            Secret = secretKeyString;
                            break;
                        case "email":
                            Email = inputText;
                            break;
                        default:
                            // Handle default case
                            break;
                    }
                    writer.println(CredentialNumber);
                    writer.println(Username);
                    writer.println(Password);
                    writer.println(FirstName);
                    writer.println(MiddleName);               
                    writer.println(LastName);
                    writer.println(Birthdate);
                    writer.println(Gender);
                    writer.println(Email);
                    writer.println(Status);
                    writer.println(Comment);
                    writer.println(Secret);
                    writer.println();
                } else {
                    writer.println(CredentialNumber);
                    writer.println(Username);
                    writer.println(Password);
                    writer.println(FirstName);
                    writer.println(MiddleName);               
                    writer.println(LastName);
                    writer.println(Birthdate);
                    writer.println(Gender);
                    writer.println(Email);
                    writer.println(Status);
                    writer.println(Comment);
                    writer.println(Secret);
                    writer.println();
                }
            }
            scanner.close();
            writer.flush();
            writer.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
            setVisible(false);
            Menu menu = new Menu();
            menu.setVisible(true);
        }catch(Exception e) {
            System.out.println("Error");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Update_info = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Current_info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ConfirmButton.setText("Confirm");

        Current_info.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Current_info.setText("Updating");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Update_info, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Current_info, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfirmButton)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Current_info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Update_info, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ConfirmButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel Current_info;
    private javax.swing.JTextField Update_info;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}


