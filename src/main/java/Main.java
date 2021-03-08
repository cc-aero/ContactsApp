import java.util.*;
import java.util.Arrays.*;
public class Main {
    private static ArrayList<Contact> contactList = new ArrayList<Contact>();
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
    }

    private static void viewContactsInterface(){
        System.out.println("\nYou have "+contactList.size()+" contacts stored."+
                    "\n"+   "Name            Phone Number                UUID");
        for (int iter = 0; iter < contactList.size(); iter++){
            Contact currentContact = contactList.get(iter);
            System.out.print(currentContact.getFirstName()+
                    " "+currentContact.getLastName()+
                    "  "+currentContact.getPhone()+
                    "  "+currentContact.getId());
        }
    }

    public static void main(String[] args) {
        String command;
        boolean valid;
        System.out.println(
                            "\n--------------------------=[Welcome to Contacts CLI!]=--------------------------");
        while(true){
            System.out.println(
                            "\n\n\n                               Choose an Option:"+
                            "\n\n                                1. Add Contact"+
                            "\n                                2. View Contacts"+
                            "\n                                3. Exit");
            System.out.print("\nccli>");
            command = scanner.next();
            valid = InputValidator.validateInput(command);
            if(command.equals("3") | valid){break;}
            if(command.equals("2") | valid){viewContactsInterface();}
            if(command.equals("1") | valid){addContactInterface();}
            if(!valid){
                System.out.println("Invalid Input.");
            }

        }
    }
}
