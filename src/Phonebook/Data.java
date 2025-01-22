package Phonebook;

import java.io.*;
import java.util.ArrayList;

public class Data extends PhoneContact {
    public Data(String name, String surname, int phoneNumber, String email) {
        super(name, surname, phoneNumber, email);
    }

    public static void addToArchive( ArrayList<PhoneContact> Contacts) {
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\PhoneBook.txt"));
            oos.writeObject(Contacts);
            System.out.println("Serialized!");
            oos.close();
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
    }

    public static void loadFromArchive(ArrayList<PhoneContact> Contacts) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\PhoneBook.txt"));
            ArrayList<PhoneContact> loadedContacts = (ArrayList<PhoneContact>) ois.readObject();
            Contacts.clear();
            Contacts.addAll(loadedContacts);
            System.out.println("Deserialized!");
            ois.close();
        } catch (IOException  | ClassNotFoundException e) {
            System.out.println("Exception caught");
        }
    }
}
