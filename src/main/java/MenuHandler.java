import java.util.Optional;
import java.util.Scanner;

public class MenuHandler {

    private final Scanner scanner = new Scanner(System.in);
    private final ContactList contactList = new ContactList();

    public void handle(final MenuOption option) {
        switch (option) {
            case ADD_CONTACT:
                addContact();
                break;
            case SEARCH_CONTACT:
                searchContact();
                break;
            case REMOVE_CONTACT:
                removeContact();
                break;
            case LIST_CONTACTS:
                listContacts();
                break;
            case EXIT:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Escolha inválida. Tente novamente.");
        }
    }

    private void addContact() {
        contactList.addContact(readContactData());
        System.out.println("Contato adicionado!");
    }

    private void searchContact() {
        System.out.println("Insira o nome ou telefone");
        final String nameOrPhone = scanner.nextLine();
        final Optional<Contact> contact = contactList.searchContact(nameOrPhone);
        if (contact.isPresent()) {
            System.out.println("Contato encontrado!");
            System.out.println(contact.get());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private void removeContact() {
        System.out.println("Insira o nome ou telefone");
        final String nameOrPhone = scanner.nextLine();
        if (contactList.removeContact(nameOrPhone)) {
            System.out.println("Contato removido!");
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    private void listContacts() {
        System.out.println("Contatos: ");
        contactList.listContacts();
    }

    private Contact readContactData() {
        System.out.println("Nome: ");
        final String name = scanner.nextLine();
        System.out.println("Telefone: ");
        final String phone = scanner.nextLine();
        System.out.println("E-mail: ");
        final String email = scanner.nextLine();
        return new Contact(name, phone, email);
    }

}
