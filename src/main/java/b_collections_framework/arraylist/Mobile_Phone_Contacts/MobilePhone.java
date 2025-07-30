package b_collections_framework.arraylist.Mobile_Phone_Contacts;

import java.util.ArrayList;

public class MobilePhone {
    private final String myNumber;
    private final ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) < 0) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact old, Contact neu) {
        if (!old.getName().equals(neu.getName())) return false;
        if (findContact(old) >= 0) {
            myContacts.set(findContact(old), neu);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0) {
            myContacts.remove(findContact(contact));
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        int i = 0;
        for (Contact c : myContacts) {
            if (c.getName().equalsIgnoreCase(contact.getName())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private int findContact(String name) {
        int i = 0;
        for (Contact contact : myContacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        int i = 1;
        for (Contact contact : myContacts) {
            System.out.println(i++ + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
