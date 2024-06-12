package assignment;
import org.json.simple.JSONObject;
public class Transaction {
    private String credential;
    private String firstname;
    private String middlename;
    private String lastname;
    private String occupation;
    private String qualification;
    private String specialization;
    private String expireddate;
    private String approval;

    public Transaction(String credential, String firstname, String middlename, String lastname, String occupation,
            String qualification, String specialization, String expireddate, String approval) {
        this.credential = credential;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.occupation = occupation;
        this.qualification = qualification;
        this.specialization = specialization;
        this.expireddate = expireddate;
        this.approval = approval;
    }

    @Override

    public String toString() {
        return "{\"\nCredential\": \"" + credential + 
                "\", \"First Name\": \"" + firstname + 
                "\", \"Middle Name\": \"" + middlename + 
                "\", \"Last Name\": \"" + lastname + 
                "\", \"Occupation\": \"" + occupation + 
                "\", \"Qualification\": \"" + qualification + 
                "\", \"Specialization\": \"" + specialization + 
                "\", \"Expired Date\": \"" + expireddate 
                + "\", \"Approval\": \"" + approval + "\"}";
    }

    public JSONObject toJSONObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Credential", this.getCredential());
        jsonObject.put("First Name", this.getFirstname());
    return jsonObject;
}

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
