package MobilePhoneApplication;
import java.util.ArrayList;
public class MobilePhone {
    private ArrayList<ContactClass> contactList = new ArrayList<ContactClass>();

        // Getters and setters
        public ArrayList<ContactClass> getContacts() {
            return contactList;
        }

        public void setContacts(ArrayList<ContactClass> contacts) {
            this.contactList = contacts;
        }

        // Methods
        public void printListOfContacts() {
            if(contactList.size() == 0) {
                System.out.println("List of contacts is empty");
            } else {
                System.out.println("/*--- List of contacts ---*/");
                for(int i = 0; i < contactList.size(); i++) {
                    System.out.println(contactList.get(i).getName() + ": " + contactList.get(i).getNumber());
                }
            }
        }

        public void addContact(ContactClass contact) {
            contactList.add(contact);
            System.out.println("Contact added");
        }

        public void updateContact(String name, ContactClass newContact) {
            int position = findContact(name);
            if(position < 0) {
                System.out.println("Contact not found");
            }
            contactList.set(position, newContact);
            System.out.println("Contact updated");
        }

        public void removeContact(String name) {
            int position = findContact(name);
            if(position < 0) {
                System.out.println("Contact not found");
            }
            contactList.remove(position);
            System.out.println("Contact deleted");
        }

        public int findContact(ContactClass contact) {
            return contactList.indexOf(contact);
        }

        public int findContact(String contactName) {
            for(int i = 0; i < contactList.size(); i++) {
                ContactClass contact = contactList.get(i);
                if(contact.getName().toLowerCase().equals(contactName.toLowerCase())) {
                    return i;
                }
            }
            return -1;
        }

}
