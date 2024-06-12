package assignment;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class LoginPage implements ActionListener{
    private JFrame f;
    private JButton medicalStaff, admin,exit;
    private JLabel l;
    
    public JFrame getJFrame(){
        return f;
    }
    
    public LoginPage(){
        f = new JFrame("Login Panel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon backgroundImage = new ImageIcon("C:/Users/HP/Documents/NetBeansProjects/2/assignment/hand.jpg");
        JLabel background = new JLabel(backgroundImage);
        background.setLayout(null);
        
        l = new JLabel("Login Here!!");
        l.setBounds(180,150,400,50);
        l.setFont(new Font("Arial",Font.BOLD,38));
        l.setForeground(Color.WHITE);
        
        medicalStaff = new JButton("Medical Staff");
        medicalStaff.setBackground(Color.white);
        medicalStaff.setForeground(Color.BLACK);
        medicalStaff.addActionListener(this);
        
        admin = new JButton("Admin");
        admin.setBackground(Color.white);
        admin.setForeground(Color.BLACK);
        admin.addActionListener(this);
        
        exit = new JButton("Exit");
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(medicalStaff);
        buttonPanel.add(admin);
        buttonPanel.add(exit);
        buttonPanel.setBounds(160, 230, 250, 35);
        
        background.add(l);
        background.add(buttonPanel);
        f.setContentPane(background);

        f.setSize(600, 500);
        f.setLocation(700, 200);
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==exit){
                JOptionPane.showMessageDialog(f, "Returning to Main Page");
                f.setVisible(false);
                HomePage homepage = new HomePage();
                homepage.setVisible(true);
                
            }else if(e.getSource()== medicalStaff){
                f.setVisible(false);
                DataIO.readFromStaffFile();
                    String input = JOptionPane.showInputDialog("Enter username: ");
                    MedicalStaff_General founds = DataIO.checkUsernameS(input);
                    if(founds != null){
                        String a = JOptionPane.showInputDialog("Enter password: ");
                        Symmetric symm = new Symmetric();
                        
                        // Decode the Base64 string
                        byte[] decodedKey = Base64.getDecoder().decode(founds.getSecretkey());

                        // Reconstruct the secret key
                        SecretKeySpec key = new SecretKeySpec(decodedKey, "AES");
                        
                        String decrypted = symm.decrypt(founds.getPassword(), key);
                        if(a.equals(decrypted)){
                            Main.loginMedicalStaff = founds;
                            f.setVisible(false);
                            Menu staffpage = new Menu();
                            staffpage.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(f, "Wrong password!");
                        } 
                    }else{
                        JOptionPane.showMessageDialog(f, "User not found!");
                    }
                    
            }else if(e.getSource()== admin){
                String code = JOptionPane.showInputDialog("Please Enter Passcode: ");
                if (code.equals("12345")){
                   f.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(f, "You are not an admin!");
                }
                
                DataIO.readFromAdminFile();
                    String input = JOptionPane.showInputDialog("Enter username: ");
                    Admin founda = DataIO.checkUsernameA(input);
                    if(founda != null){
                        String a = JOptionPane.showInputDialog("Enter password: ");
                        Symmetric symm = new Symmetric();
                        byte[] decodedKey = Base64.getDecoder().decode(founda.getSecret());
                        SecretKeySpec key = new SecretKeySpec(decodedKey, "AES");
                        String decrypted = symm.decrypt(founda.getPassword(), key);
                        if(a.equals(decrypted)){
                            Main.loginAdmin = founda;
                            f.setVisible(false);
                            AdminPage adminpage = new AdminPage();
                            adminpage.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(f, "Wrong password!");
                        } 
                    }else{
                        JOptionPane.showMessageDialog(f, "User not found!");
                    }
                } 
        }catch(Exception ex){
            JOptionPane.showMessageDialog(f, "Invalid Input");
        }
    }
}