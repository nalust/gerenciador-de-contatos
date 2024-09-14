import java.util.Optional;

public class ContactList {

    private Node head;

    public void listContacts() {
        if (head == null) {
            System.out.println("Sem contatos!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.getContact().toString());
            current = current.getNext();
        }
    }

    public void addContact(final Contact contact) {
        final Node newNode = new Node(contact);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public Optional<Contact> searchContact(final String nameOrPhone) {
        Node current = head;
        while (current != null) {
            if (hasNameOrPhone(current, nameOrPhone)) {
                return Optional.of(current.getContact());
            }
            current = current.getNext();
        }
        return Optional.empty();
    }

    public boolean removeContact(final String nameOrPhone) {
        if (head == null) {
            return false;
        }
        if (hasNameOrPhone(head, nameOrPhone)) {
            head = head.getNext();
            return true;
        }
        Node current = head;
        while (current.getNext() != null && !hasNameOrPhone(current.getNext(), nameOrPhone)) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            return true;
        }
        return false;
    }

    private boolean hasNameOrPhone(final Node node, final String nameOrPhone) {
        if (node == null) {
            return false;
        }
        return nameOrPhone.equalsIgnoreCase(node.getContact().getName())
                || nameOrPhone.equalsIgnoreCase(node.getContact().getPhoneNumber());
    }

}
