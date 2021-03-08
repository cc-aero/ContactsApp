import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class ContactTest {
    private FirstNameException e;
    @Test
    @Description("First Name Below 3 Chars")

    void validateFirstNameLessThan(){
        try {
            Contact.validateFirstName("aa");
            fail("Failed to catch invalid name");
        }catch (FirstNameException e){
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }
    }
    @Test
    @Description("First Name Above 49 Chars")
    void validateFirstNameMoreThan(){
        try {
            Contact.validateFirstName("onetwothreefourfivesixseveneightnineteneleventwelve");
            fail("Failed to catch invalid name");
        }catch (FirstNameException e){
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }
    }
    @Test
    @Description("Valid First Name")
    void validateFirstNameValid(){
        try {
            Contact.validateFirstName("Kevin");
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }catch (FirstNameException e){
            fail("Valid first name not accepted");
        }
    }

    @Test
    @Description("Last Name Below 4 Chars")
    void validateLastNameLessThan(){
        try {
            Contact.validateLastName("av");
            fail("Failed to catch invalid name");
        }catch (LastNameException e){
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }
    }
    @Test
    @Description("Last Name Above 39 Chars")
    void validateLastNameMoreThan(){
        try {
            Contact.validateLastName("onetwothreefourfivesixseveneightnineteneleven");
            fail("Failed to catch invalid name");
        }catch (LastNameException e){
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }
    }
    @Test
    @Description("Valid Last Name")
    void validateLastNameValid(){
        try {
            Contact.validateLastName("Samuels");
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }catch (LastNameException e){
            fail("Valid last name not accepted");
        }
    }

    @Test
    @Description("Phone Number Not 11 Chars")
    void validatePhoneNumberNotEleven(){
        try {
            Contact.validatePhoneNumber("0734534545");
            fail("Failed to catch invalid phone number");
        }catch (PhoneException e){
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }
    }
    @Test
    @Description("Phone Number Not Starting With '07'")
    void validatePhoneNumberNotOSeven(){
        try {
            Contact.validatePhoneNumber("06345345457");
            fail("Failed to catch invalid phone number");
        }catch (PhoneException e){
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }
    }
    @Test
    @Description("Valid Phone Number")
    void validatePhoneNumberValid(){
        try {
            Contact.validatePhoneNumber("07485723756");
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }catch (PhoneException e){
            fail("Valid phone number not accepted");
        }
    }
}