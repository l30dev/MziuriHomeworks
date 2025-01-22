package Phonebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneContact implements Serializable {
    private String name;
    private String surname;
    private int phoneNumber;
    private String email;

    PhoneContact(String name, String surname, int phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PhoneContact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public static boolean dupeChecker(int number, ArrayList<PhoneContact> Contacts, int i) {
        if(i<=0)
            return false;
            if (number == Contacts.get(i).getPhoneNumber())
                return true;
             return dupeChecker(number, Contacts, i - 1);
        }
    public static void addContact(ArrayList<PhoneContact>Contacts, Scanner scanner){
        int i=Contacts.size()-1;
        System.out.println("Lets add a contact to your phonebook");
        System.out.println("First give me a name");
        String name=scanner.next();
        System.out.println("Then a surname");
        String surname=scanner.next();
        System.out.println("Now their phone number");
        int phoneNumber=scanner.nextInt();
        if(dupeChecker(phoneNumber,Contacts,i)){
            System.out.println("the number is already inputted input again," +
                    "DON'T MAKE A MISTAKE ANYMORE");
            phoneNumber= scanner.nextInt();
        }
        System.out.println("Lastly their e-mail");
        String email=scanner.next();
        PhoneContact Contact = new PhoneContact(name,surname,phoneNumber,
                email);
        Contacts.add(Contact);
        System.out.println("Contact added");
    }
    public static PhoneContact checker(int number, ArrayList<PhoneContact> Contacts, int i) {
        if(Contacts.isEmpty()){
            System.out.println("Not enough size");
            return null;
        }
        if (number==Contacts.get(i).getPhoneNumber())
            return Contacts.get(i);
        else return checker(number, Contacts, i + 1);
    }
    public static void removeContact(ArrayList<PhoneContact>Contacts, Scanner scanner) {
        System.out.println("Harsh decision ngl, who hurt you?");
        System.out.println("Enter the phone of that person");
        int number = scanner.nextInt();
        PhoneContact person = checker(number, Contacts, 0);
        if (person != null) {
            Contacts.remove(person);
            System.out.println("Contact removed;");
            System.out.println("Farewell " + person.getName());
        }
        else{
            System.out.println("Person not found");
        }
    }
    public  static void displayAllContacts(ArrayList<PhoneContact>Contacts){
        for(int i=0; i<Contacts.size(); i++){
            System.out.println("Contact N"+(i+1));
            System.out.println(Contacts.get(i));
        }
    }
    public static void findContact(ArrayList<PhoneContact>Contacts, Scanner scanner){
        System.out.println("Enter the name of whose contact you want to display ");
        System.out.println("WARNING! there can be several people of the same name");
        String name=scanner.next();
        for (PhoneContact contact : Contacts) {
            if (name.equalsIgnoreCase(contact.getName()))
                System.out.println(contact);
        }

    }
}

