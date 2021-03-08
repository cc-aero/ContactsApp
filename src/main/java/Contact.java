public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public static void validateFirstName(String firstName) throws FirstNameException {
        //  First name must be:
        //      - Less than 50 characters
        //      - More than 2 characters
        if(firstName.length() < 3 | firstName.length() > 49){
            throw new FirstNameException();
        }
    }
    public static void validateLastName(String lastName) throws LastNameException {
        //   Last name must be:
        //      - Less than 40 characters
        //      - More than 3 Characters
        if(lastName.length() < 4 | lastName.length() > 39){
            throw new LastNameException();
        }
    }
    public static void validatePhoneNumber(String phone) throws PhoneException {
        //  Phone number must be:
        //      - 11 Digits
        //      - Starts with '07'
        if(phone.length() != 11 | !(phone.startsWith("07"))){
            throw new PhoneException();
        }
    }
    public Contact(){
    }
    public Contact(String firstName,String lastName, String phone, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.id = id;
    }



}
