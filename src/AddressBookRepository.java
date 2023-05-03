import java.util.ArrayList;

public class AddressBookRepository {
    ArrayList<Person> personList = new ArrayList<>();
    public void addPerson(Person person) {
        personList.add(person);
    }

    public void displayPersons() {
        for (Person p :personList){
            System.out.println(p.getFname());
            System.out.println(p.getLname());
        }
    }

    public void remove(int id) {
        personList.remove(id);
    }
}
