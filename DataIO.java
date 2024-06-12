package assignment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DataIO {
    public static ArrayList<MedicalStaff_General> allMedicalStaff = new ArrayList<MedicalStaff_General>();
    public static ArrayList<Admin> allAdmin = new ArrayList<Admin>();
    public static ArrayList<MedicalStaffApplication> allApplications = new ArrayList<MedicalStaffApplication>();
    
    public static String[] readFromStaffFile() {
        try{
            Scanner s1 = new Scanner (new File("medicalstaff.txt"));
            allMedicalStaff.clear();
            while (s1.hasNext()){
                String id = s1.nextLine();
                String a = s1.nextLine();
                String b = s1.nextLine();
                String c = s1.nextLine();
                String d = s1.nextLine();
                String g = s1.nextLine();
                String h = s1.nextLine();
                String j = s1.nextLine();
                String k = s1.nextLine();
                String m = s1.nextLine();
                String n = s1.nextLine();
                String s = s1.nextLine();
                s1.nextLine();
                allMedicalStaff.add(new MedicalStaff_General(id,a,b,c,d,g,h,j,k,m,n,s));
            }
        } catch(Exception e){
            System.out.println("Error in Reading Staff File"+e.getMessage());
            
        }
        return null;
    }
    
    public static void writeToFile(){
        try (PrintWriter writer = new PrintWriter(new FileWriter("medicalstaff.txt", true))) {
            MedicalStaff_General newMedicalStaff = allMedicalStaff.get(allMedicalStaff.size() - 1);
            writer.println( newMedicalStaff.getId());
            writer.println( newMedicalStaff.getUsername());
            writer.println(newMedicalStaff.getPassword());
            writer.println(newMedicalStaff.getFirstname());
            writer.println(newMedicalStaff.getMiddlename());
            writer.println(newMedicalStaff.getLastname());
            writer.println(newMedicalStaff.getBirthdate());
            writer.println( newMedicalStaff.getGender());
            writer.println(newMedicalStaff.getEmail());
            writer.println(newMedicalStaff.getStatus());
            writer.println(newMedicalStaff.getComment());
            writer.println(newMedicalStaff.getSecretkey());
            writer.println();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public static void readFromAdminFile(){
        try{
            Scanner s2 = new Scanner(new File("admin.txt"));
            allAdmin.clear();
            while (s2.hasNext()){
                String a = s2.nextLine();
                String b = s2.nextLine();
                String c = s2.nextLine();
                String d = s2.nextLine();
                String g = s2.nextLine();
                String h = s2.nextLine();
                String k = s2.nextLine();
                String s = s2.nextLine();
                s2.nextLine();
                allAdmin.add(new Admin(a, b, c, d,
                g, h, k, s));
            }
        }catch(Exception e){
            System.out.println("Error in Reading Admin File"+e.getMessage());  
        }
    }
    
    public static void writeAdminToFile(){
        try (PrintWriter writer = new PrintWriter(new FileWriter("admin.txt", true))) {
            Admin newAdmin = allAdmin.get(allAdmin.size() - 1);
            writer.println( newAdmin.getUsername());
            writer.println(newAdmin.getPassword());
            writer.println(newAdmin.getFirstname());
            writer.println(newAdmin.getMiddlename());
            writer.println(newAdmin.getLastname());
            writer.println(newAdmin.getBirthdate());
            writer.println(newAdmin.getEmail());
            writer.println(newAdmin.getSecret());
            writer.println();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public static String[] readFromApplicationFile() {
        try{
            Scanner s3 = new Scanner (new File("applications.txt"));
            allApplications.clear();
            while (s3.hasNext()){
                String id = s3.nextLine();
                String no = s3.nextLine();
                String fname = s3.nextLine();
                String mname = s3.nextLine();
                String lname = s3.nextLine();
                String occ = s3.nextLine();
                String qua = s3.nextLine();
                String spec = s3.nextLine();
                String date = s3.nextLine();
                s3.nextLine();
                allApplications.add(new MedicalStaffApplication(id,no,fname,mname,lname,occ,qua,spec,date));
            }
        } catch(Exception e){
            System.out.println("Error in Reading Application File"+e.getMessage());
            
        }
        return null;
    }
    
    public static void writeToApplicationFile(){
        try (PrintWriter writer = new PrintWriter(new FileWriter("applications.txt", true))) {
            MedicalStaffApplication newApplication = allApplications.get(allApplications.size() - 1);
            writer.println( newApplication.getApplicationID());
            writer.println( newApplication.getCredentialNo());
            writer.println(newApplication.getFirstName());
            writer.println(newApplication.getMiddleName());
            writer.println(newApplication.getLastName());
            writer.println(newApplication.getOccupation());
            writer.println( newApplication.getQualification());
            writer.println(newApplication.getSpecialization());
            writer.println(newApplication.getExpiryDate());
            writer.println(newApplication.getSignature());
            writer.println();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public static void editRecord(String CredentialNo, String CommentUpdate, String StatusUpdate){
        String filepath = "medicalstaff.txt";
        String tempFile = "Temp.txt";
        File oldFile = new File(filepath); 
        File newFile = new File(tempFile);
        String CredentialNumber = ""; String Username = ""; String Password = "";
        String FirstName ="";String MiddleName = "";String LastName = ""; String Birthdate = ""; String Gender = "";
        String Email = "";String Status = "";String Comment = "";String Secretkey = "";
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter writer = new PrintWriter(bw);
            Scanner s2 = new Scanner(new File("medicalstaff.txt"));

            while (s2.hasNext()){
                CredentialNumber = s2.nextLine();
                Username = s2.nextLine();
                Password = s2.nextLine();
                FirstName = s2.nextLine();
                MiddleName = s2.nextLine();
                LastName = s2.nextLine();
                Birthdate = s2.nextLine();
                Gender = s2.nextLine();
                Email = s2.nextLine();
                Status = s2.nextLine();
                Comment = s2.nextLine();
                Secretkey = s2.nextLine();
                s2.nextLine();
                
                System.out.println(CredentialNumber);
                
                if(CredentialNumber.equals(CredentialNo)){
                    Comment = CommentUpdate;
                    Status = StatusUpdate;
                }
                // Write to file
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
                writer.println(Secretkey);
                writer.println(); 
            }
            s2.close();
            writer.flush();
            writer.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);      // Update status for specific credential number
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public static MedicalStaff_General checkEmail(String email){
        MedicalStaff_General found = null;
        for (MedicalStaff_General ms : allMedicalStaff) {
        if (email.equals(ms.getEmail())) {
            found = ms;
            break;
        }
    }
    return found;
    }
    
    public static Admin checkEmaila(String email){
        Admin found = null;
        for (Admin aa:allAdmin){
            if(email.equals(aa.getEmail())){
                found = aa;
                break;
            }
        }
        return found;
    }
    
    public static Admin checkUsernameA(String username){
        try {
            PrivateKey privKey = KeyAccess.getPrivateKey("assignment/MyKeyPair/PrivateKey");
            Asymmetric asymmetric = new Asymmetric();
            Admin founda = null;
            for (Admin a : allAdmin){
                String decrypted = asymmetric.decrypt(a.getUsername(), privKey);
                if(username.equals(decrypted)){
                    founda = a;
                    break;
                }
            }
            return founda;
        } catch (Exception ex) {
            Logger.getLogger(DataIO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static MedicalStaff_General checkUsernameS(String username){
        MedicalStaff_General founds = null;
        for(MedicalStaff_General mds:allMedicalStaff){
            if(username.equals(mds.getUsername())){
                founds = mds;
                break;
            }
        }
        return founds;
    }
}