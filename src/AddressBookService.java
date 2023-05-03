//It is middle layer. We are just passing datas.

public class AddressBookService {
    AddressBookRepository addressBookRepository = new AddressBookRepository();

    public void addPerson(Person person) {
        addressBookRepository.addPerson(person);
    }

    public void displayPersons() {
        addressBookRepository.displayPersons();
    }

    public void remove(int id) {
        addressBookRepository.remove(id);
    }
}
