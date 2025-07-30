package b_collections_framework.arraylist.Mobile_Phone_Contacts;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("0172");

        Contact.createContact("Name", "Number");
        Contact Bob = new Contact("Bob", "31415926");
        mobilePhone.addNewContact(Bob);
        Contact Alice = new Contact("Alice", "16180339");
        mobilePhone.addNewContact(Alice);
        Contact Tom = new Contact("Tom", "11235813");
        mobilePhone.addNewContact(Tom);
        Contact Jane = new Contact("Jane", "23571113");
        mobilePhone.addNewContact(Jane);

        mobilePhone.printContacts();

        mobilePhone.updateContact(mobilePhone.queryContact("Tom"), new Contact("Tom", "newTom"));
        mobilePhone.updateContact(mobilePhone.queryContact("Alice"), new Contact("Alice", "newAlice"));
        mobilePhone.printContacts();
        System.out.println();

        mobilePhone.removeContact(Jane);
        mobilePhone.printContacts();
        System.out.println();


    }
}
