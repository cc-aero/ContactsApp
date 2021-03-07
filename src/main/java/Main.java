import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Contact> contactList;
    private static Scanner scanner = new Scanner(System.in);

    private static void addContactInterface(){
        String contactFirstName;
        System.out.println( "\n--------------------------------=[Add  Contact]=--------------------------------\n");
        System.out.print( "                              Enter Contact First Name:\n\n");
        System.out.print("addcontact>");
        contactFirstName = scanner.next();

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
