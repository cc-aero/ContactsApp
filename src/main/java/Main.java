import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    private static List<Contact> contactList;
    private static Scanner scanner = new Scanner(System.in);


    private static void addContactInterface(){
        Contact contact = new Contact();
        String contactFirstName;
        String contactLastName;
        String contactPhone;
        String id;
        System.out.println( "\n--------------------------------=[Add  Contact]=--------------------------------\n");
        while(true){
            System.out.print( "                              Enter Contact First Name:\n\n");
            System.out.print("addcontact>");
            contactFirstName = scanner.next();
            try {
                contact.validateFirstName(contactFirstName);
                contact.setFirstName(contactFirstName);
                break;
            } catch (FirstNameException e) {
                System.out.println("                                Please Try Again");
            }
        }
        while (true){
            System.out.println( "                             Enter Contact Last Name:\n\n");
            System.out.print("addcontact>");
            contactLastName = scanner.next();
            try {
                contact.validateLastName(contactLastName);
                contact.setLastName(contactLastName);
                break;
            } catch (LastNameException e) {
                System.out.println("                                Please Try Again");
            }
        }

        while (true){
            System.out.println( "                             Enter Contact Phone Number:\n\n");
            System.out.print("addcontact>");
            contactPhone = scanner.next();
            try {
                contact.validatePhoneNumber(contactPhone);
                contact.setPhone(contactPhone);
                break;
            }catch (PhoneException e){
                System.out.println("                                Please Try Again");
            }
        }
        id = UUID.randomUUID().toString();
        contact.setId(id);
        contactList.add(contact);
        System.out.println(contactList.toArray());
    }

    public static void main(String[] args) {
        String command;
        System.out.println(
                            "\n--------------------------=[Welcome to Contacts CLI!]=--------------------------\n");
        while(true){
            System.out.println(
                            "\n                               Choose an Option:"+
                            "\n\n                                1. Add Contact"+
                            "\n                                2. View Contacts"+
                            "\n                                3. Exit");
            System.out.print("\nccli>");
            command = scanner.next();
            if(command.equals("3")){break;}
            if(command.equals("2")){break;}
            if(command.equals("1")){addContactInterface();}

        }
    }
}
