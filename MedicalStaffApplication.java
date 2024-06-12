package assignment;
public class MedicalStaffApplication {
    private String ApplicationID;
    private String CredentialNo;
    private String FirstName;
    private String LastName;
    private String MiddleName;
    private String Occupation;
    private String Qualification;
    private String Specialization;
    private String ExpiryDate;
    private String signature;

    public MedicalStaffApplication(String ApplicationID, String CredentialNo, String FirstName, String LastName, String MiddleName, String Occupation, String Qualification, String Specialization, String ExpiryDate) {
        this.ApplicationID = ApplicationID;
        this.CredentialNo = CredentialNo;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MiddleName = MiddleName;
        this.Occupation = Occupation;
        this.Qualification = Qualification;
        this.Specialization = Specialization;
        this.ExpiryDate = ExpiryDate;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getApplicationID() {
        return ApplicationID;
    }

    public String getCredentialNo() {
        return CredentialNo;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getOccupation() {
        return Occupation;
    }

    public String getQualification() {
        return Qualification;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }
}
