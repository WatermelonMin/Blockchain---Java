package assignment;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class RegisterPage implements ActionListener{
    private JFrame f;
    private JButton medicalStaff, exit,admin;
    private JLabel l;
    
    public JFrame getJFrame(){
        return f;
    }
    
    public RegisterPage(){
        f = new JFrame("Register Panel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //load image
        ImageIcon backgroundImage = new ImageIcon("C:/Users/HP/Documents/NetBeansProjects/2/assignment/r1.jpg");
        JLabel background = new JLabel(backgroundImage);
        background.setLayout(null);
        
        l = new JLabel("Register Now!!");
        l.setBounds(180,130,300,50);
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
        buttonPanel.setBounds(180, 230, 250, 35);
        
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
                JOptionPane.showMessageDialog(f, "Register Here!!");
                f.setVisible(false);
                String email = JOptionPane.showInputDialog("Enter Email: ");
                Main.userEmail = email;
                
                DataIO.readFromStaffFile();
                MedicalStaff_General found = DataIO.checkEmail(email);
                
                if (found == null){
                    f.setVisible(false);
                    Main.page3 = new InputPage();
                    Main.page3.getJFrame().setVisible(true);
                    
                }else{
                    JOptionPane.showMessageDialog(f, "This email has already registered!!");
                    f.setVisible(false);
                    HomePage homepage = new HomePage();
                    homepage.setVisible(true);
                }
                
            }else if(e.getSource()==admin){
                String code =JOptionPane.showInputDialog("Please Enter Passcode: ");
                if(code.equals("12345")){
                    JOptionPane.showMessageDialog(f, "Register Here!!");
                    f.setVisible(false);
                    String emaill = JOptionPane.showInputDialog("Enter Email: ");
                    Main.userEmail = emaill;

                    DataIO.readFromAdminFile();
                    Admin found = DataIO.checkEmaila(emaill);

                    if (found == null){
                        f.setVisible(false);
                        Main.page4 = new InputPageA();
                        Main.page4.getJFrame().setVisible(true);

                    }else{
                        JOptionPane.showMessageDialog(f, "This email has already registered!!");
                        f.setVisible(false);
                        HomePage homepage = new HomePage();
                        homepage.setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(f, "You are not an admin!");
                }
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(f,"Invalid Input");
        }
    }
}
