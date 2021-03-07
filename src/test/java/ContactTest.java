import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class ContactTest {
    private FirstNameException e;
    @Test
    @Description("First Name Below 3 Chars")

    void validateFirstNameLessThan() throws FirstNameException {
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
    @Description("Last Name Below 4 Chars")
    void validateLastNameLessThan(){
        try {
            Contact.validateLastName("av");
            fail();
        }catch (LastNameException e){
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }
    }
    @Test
    @Description("Last Name Above 39 Chars")
    void validateLastNameMoreThan(){
        try {
            Contact.validateLastName("onetwothreefourfivesixseveneightnineteneleven");
            fail();
        }catch (LastNameException e){
            assertEquals(0,0);  //Cheeky workaround as I forgot how to pass test cleanly
        }

    }
}