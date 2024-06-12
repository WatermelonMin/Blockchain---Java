package assignment;
public class MedicalStaff_General {
    private String id;
    private String username;
    private String password;
    private String firstname;
    private String middlename;
    private String lastname;
    private String birthdate;
    private String gender;
    private String email;
    private String status;
    private String comments;
    private String secretkey;
    
    public String toString(){
        return("Credential Number: "+this.id+"\nUsername: "+this.username+"\nPassword: "+this.password+
                "\nFirst Name: "+this.firstname+"\nMiddle Name: "+this.middlename+"\nLast Name: "+this.lastname+
                        "\nBirth Date: "+this.birthdate+"\nGender: "+this.gender+"\nEmail: "+this.email
                +"\nStatus: "+this.status+"\nComment: "+this.comments+"\nSecret Key: "+this.secretkey);
    }
    
    public MedicalStaff_General(String id,String username, String password, String firstname, String middlename,
            String lastname, String birthdate, String gender, String email, String status, String comments, String secretkey){
    
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.email = email;
        this.status = status;
        this.comments = comments;
        this.secretkey = secretkey;
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comments;
    }

    public void setComment(String comments) {
        this.comments = comments;
    }
}
