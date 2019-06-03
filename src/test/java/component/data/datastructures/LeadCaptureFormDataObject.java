package component.data.datastructures;

public class LeadCaptureFormDataObject {
    String firstName;
    String lastName;
    String streedAddress01;
    String streedAddress02;
    String city;
    String state;
    String zipCode;
    String phoneNo;
    String email;
    String date;

    public LeadCaptureFormDataObject(){
        this.firstName = "";
        this.lastName = "";
        this.streedAddress01 = "";
        this.streedAddress02 = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
        this.phoneNo = "";
        this.email = "";
        this.date = "";
    }
    public LeadCaptureFormDataObject(String firstName, String lastName, String streedAddress01, String streedAddress02, String city, String state, String zipCode, String phoneNo, String email, String date){
        this.firstName = firstName;
        this.lastName = lastName;
        this.streedAddress01 = streedAddress01;
        this.streedAddress02 = streedAddress02;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNo = phoneNo;
        this.email = email;
        this.date = date;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreedAddress01() {
        return streedAddress01;
    }

    public String getStreedAddress02() {
        return streedAddress02;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }
}
