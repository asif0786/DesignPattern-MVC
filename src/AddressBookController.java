import java.util.Scanner;

public class AddressBookController {

    public static Person readPersonalDataFromConsole(){
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        String lname = sc.next();

        Person p = new Person();
        p.setFname(fname);
        p.setLname(lname);

        return p;
    }
    public static void main(String[] args) {
//    Person person = readPersonalDataFromConsole();
//    AddressBookService addressBookService = new AddressBookService();
//    addressBookService.addPerson(person);

        AddressBookService addressBookService = new AddressBookService();

        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1.Add , 2.Display , 3.Delete , 4.Update ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                Person person = readPersonalDataFromConsole();
                addressBookService.addPerson(person);
                break;
            case 2:
                addressBookService.displayPersons();
                break;
            case 3:
                addressBookService.remove(int id);

            default:
                System.out.println("Enter Correct Option ");
        }

    }
    }
}


