package assignment;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.security.Key;
import java.security.PublicKey;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputPageA implements ActionListener{
     private Container c;
    private JLabel title;
    private JLabel fname;
    private JTextField tfname;
    private JLabel mname;
    private JTextField tmname;
    private JLabel lname;
    private JTextField tlname;
    private JLabel uname;
    private JTextField tuname;
    private JLabel password;
    private JTextField tpassword;

    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton check;
    private JButton reset;
    private JButton sub;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private JButton exit;
    private JFrame f;
    
    private String dates[]
            ={"1","2","3","4","5",
              "6","7","8","9","10",
              "11","12","13","14","15",
                "16","17","18","19","20",
                "21","22","23","24","25",
                "26","27","28","29","30",
                "31"};
    
    private String months[]
            ={"Jan","Feb","Mar","Apr",
                "May","Jun","July","Aug",
                "Sep","Oct","Nov","Dec"};
    
    private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
    
    public JFrame getJFrame(){
        return f;
    }
    
    public InputPageA(){
        
        f = new JFrame("Admin Registration Form");
        f.setBounds(300,90,900,650);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        
        c = f.getContentPane();
        c.setLayout(null);
        
        title = new JLabel("Admin Registration Form");
        title.setFont(new Font("Arial",Font.PLAIN,28));
        title.setSize(300,30);
        title.setLocation(300,30);
        c.add(title);
        
        fname = new JLabel("First Name");
        fname.setFont(new Font("Arial",Font.PLAIN,20));
        fname.setSize(100,20);
        fname.setLocation(100,100);
        c.add(fname);
        
        tfname = new JTextField();
        tfname.setFont(new Font("Arial",Font.PLAIN,15));
        tfname.setSize(190,20);
        tfname.setLocation(250,100);
        c.add(tfname);
        
        mname = new JLabel("Middle Name");
        mname.setFont(new Font("Arial",Font.PLAIN,20));
        mname.setSize(120,20);
        mname.setLocation(100,150);
        c.add(mname);
        
        tmname = new JTextField();
        tmname.setFont(new Font("Arial",Font.PLAIN,15));
        tmname.setSize(190,20);
        tmname.setLocation(250,150);
        c.add(tmname);
        
        lname = new JLabel("Last Name");
        lname.setFont(new Font("Arial",Font.PLAIN,20));
        lname.setSize(100,20);
        lname.setLocation(100,200);
        c.add(lname);
        
        tlname = new JTextField();
        tlname.setFont(new Font("Arial",Font.PLAIN,15));
        tlname.setSize(190,20);
        tlname.setLocation(250,200);
        c.add(tlname);
        
        uname = new JLabel("Username");
        uname.setFont(new Font("Arial",Font.PLAIN,20));
        uname.setSize(100,20);
        uname.setLocation(100,250);
        c.add(uname);
        
        tuname = new JTextField();
        tuname.setFont(new Font("Arial",Font.PLAIN,15));
        tuname.setSize(190,20);
        tuname.setLocation(250,250);
        c.add(tuname);
        
        password = new JLabel("Password");
        password.setFont(new Font("Arial",Font.PLAIN,20));
        password.setSize(100,20);
        password.setLocation(100,300);
        c.add(password);
        
        tpassword = new JTextField();
        tpassword.setFont(new Font("Arial",Font.PLAIN,15));
        tpassword.setSize(190,20);
        tpassword.setLocation(250,300);
        c.add(tpassword);
        
        
        dob = new JLabel("Birth Date");
        dob.setFont(new Font("Arial",Font.PLAIN,20));
        dob.setSize(100,20);
        dob.setLocation(100,400);
        c.add(dob);
        
        date = new JComboBox(dates);
        date.setFont(new Font("Arial",Font.PLAIN,15));
        date.setSize(50,20);
        date.setLocation(250,400);
        c.add(date);
        
        month = new JComboBox(months);
        month.setFont(new Font("Arial",Font.PLAIN,15));
        month.setSize(60,20);
        month.setLocation(300,400);
        c.add(month);
        
        year = new JComboBox(years);
        year.setFont(new Font("Arial",Font.PLAIN,15));
        year.setSize(60,20);
        year.setLocation(370,400);
        c.add(year);
        
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 450);
        c.add(term);
        
        check = new JButton("Check");
        check.setFont(new Font("Arial", Font.PLAIN, 20));
        check.setSize(100, 40);
        check.setLocation(150, 500);
        check.addActionListener(this);
        c.add(check);
        
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 20));
        sub.setSize(100, 40);
        sub.setLocation(300, 500);
        sub.addActionListener(this);
        c.add(sub);
        
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(150, 580);
        c.add(res);
        
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
        
        exit = new JButton("Exit");
        exit.setFont(new Font("Arial", Font.PLAIN, 20));
        exit.setSize(100, 40);
        exit.setLocation(600, 550);
        exit.addActionListener(this);
        c.add(exit);
        
        clearFields();
        
        f.setLocation(600, 170);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== check){
            if(term.isSelected()){
                String data
                        = "First Name: "+tfname.getText()+"\n"+
                        "Middle Name: "+tmname.getText()+"\n"+
                        "Last Name: "+tlname.getText()+"\n"+
                        "Username: "+tuname.getText()+"\n";

                String data2
                        ="BirthDate : "
                        +(String)date.getSelectedItem()
                        +"/"+(String)month.getSelectedItem()
                        +"/"+(String)year.getSelectedItem()
                        +"\n";
                
                tout.setText(data + data2);
                tout.setEditable(false);
                res.setText("Please Check Before Submit");
                
            }else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the "+
                        "terms & conditions..");
            }
        }else if(e.getSource() == exit){
            JOptionPane.showMessageDialog(f, "Returning to Main Page");
            f.setVisible(false);
            HomePage homepage = new HomePage();
            homepage.setVisible(true);
            
        }else if (e.getSource()==sub){
            try {
                String a = tuname.getText();
                String b = tpassword.getText();
                String c = tfname.getText();
                String d = tmname.getText();
                String g = tlname.getText();
                String h = (String)date.getSelectedItem()+"/"+
                        (String)month.getSelectedItem()+"/"+
                        (String)year.getSelectedItem();
                String k = Main.userEmail;
                
                // Symmetric encryption of password
                Symmetric symm = new Symmetric();
                Key secretKey = RandomSecretKeySpec.create();
                String secretKeyString = Base64.getEncoder().encodeToString(secretKey.getEncoded());
                String encrypted = symm.encrypt(b, secretKey);
                
                // Asymmetric encryption of username
                File publicKeyFile = new File("assignment/MyKeyPair/PublicKey");
                File privateKeyFile = new File("assignment/MyKeyPair/PrivateKey");

                if (!publicKeyFile.exists() || !privateKeyFile.exists()) {
                    MyKeyPair.create();
                    byte[] publicKey = MyKeyPair.getPublicKey().getEncoded();
                    byte[] privateKey = MyKeyPair.getPrivateKey().getEncoded();

                    MyKeyPair.put(publicKey, "assignment/MyKeyPair/PublicKey");
                    MyKeyPair.put(privateKey, "assignment/MyKeyPair/PrivateKey");
                }
                PublicKey pubKey = KeyAccess.getPublicKey("assignment/MyKeyPair/PublicKey");

                Asymmetric asymm = new Asymmetric();
                String encrypted_user = asymm.encrypt(a, pubKey);  
                
                res.setText("Successfully Submitted");
                DataIO.allAdmin.add(new Admin(encrypted_user,encrypted,c,
                        d,g,h,k,secretKeyString));
                DataIO.writeAdminToFile();
                f.setVisible(false);
                HomePage homepage = new HomePage();
                homepage.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(InputPageA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void clearFields(){
        System.out.println("Clearing field");
        tfname.setText("");
        tmname.setText("");
        tlname.setText("");
        tuname.setText("");
        tpassword.setText("");
        date.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
        term.setSelected(false);
        tout.setText("");
        res.setText("");
        resadd.setText("");
}
}
