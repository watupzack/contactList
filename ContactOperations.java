package com.company;

import java.util.Arrays;

public interface ContactOperations {
    static void createContact() {
        Contact contact = new Contact();
        System.out.println("OK! Type in contact's data!");
        System.out.print("First name: "); contact.data[0] = App.scanner.next();
        System.out.print("Last name: "); contact.data[1] = App.scanner.next();
        System.out.print("Number: "); contact.data[2] = App.scanner.next();
        System.out.print("Email: "); contact.data[3] = App.scanner.next();
        System.out.print("Company: "); contact.data[4] = App.scanner.next();
        System.out.println("The contact was successfully added!");
        App.dataBase.add(contact.data);
    }

    static void listAppear() {
        if (App.dataBase.size() > 0) {
            System.out.println("That's all your contacts!");
            int i = 1;
            for (String[] stringArray : App.dataBase) {
                System.out.print("[" + i + "]");
                System.out.println(Arrays.toString(stringArray));
                i++;
            }
        } else {
            System.out.println("You have no recorded contacts!");
        }
    }

    static void updateContact() {
        if (App.dataBase.size() > 0) {
            System.out.println("Which contact you want to update?");
            int i = 1;
            for (String[] stringArray : App.dataBase) {
                System.out.print("[" + i + "]");
                System.out.println(Arrays.toString(stringArray));
                i++;
            }
            int contactToUpdate = App.scanner.nextInt();
            App.dataBase.remove(contactToUpdate - 1);

            Contact contact = new Contact();
            System.out.println("OK! Update this contact!");
            System.out.print("First name: "); contact.data[0] = App.scanner.next();
            System.out.print("Last name: "); contact.data[1] = App.scanner.next();
            System.out.print("Number: "); contact.data[2] = App.scanner.next();
            System.out.print("Email: "); contact.data[3] = App.scanner.next();
            System.out.print("Company: "); contact.data[4] = App.scanner.next();
            System.out.println("The contact was successfully updated!");
            App.dataBase.add(contactToUpdate - 1, contact.data);

        } else {
            System.out.println("There are no contacts to update!");
        }
    }

    static void deleteContact() {
        if (App.dataBase.size() > 0) {
            System.out.println("Which contact you want to delete?");
            int i = 1;
            for (String[] stringArray : App.dataBase) {
                System.out.print("[" + i + "]");
                System.out.println(Arrays.toString(stringArray));
                i++;
            }
            int contactToDelete = App.scanner.nextInt();
            App.dataBase.remove(contactToDelete - 1);

        } else {
            System.out.println("There are no contacts to delete!");
        }

    }
}
