package Phonebook;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean b = true;
        ArrayList<PhoneContact> contacts = new ArrayList<>();
            while (b) {
                System.out.println("Welcome to your Phonebook");
                System.out.println();
                System.out.println("1. Add contact");
                System.out.println("2. Remove contact");
                System.out.println("3. Find contact by name");
                System.out.println("4. Save to archive");
                System.out.println("5. Load the archive");
                System.out.println("6. Display all contacts");
                System.out.println("7. Exit phonebook");
                System.out.print("Choose an option: ");
                int contactChoice = scanner.nextInt();
                scanner.nextLine();

                switch (contactChoice) {
                    case 1:
                        Data.addContact(contacts, scanner);
                        break;
                    case 2:
                        Data.removeContact(contacts, scanner);
                        break;
                    case 3:
                        Data.findContact(contacts, scanner);
                        break;
                    case 4:
                            Data.addToArchive(contacts);
                        break;
                    case 5:
                            Data.loadFromArchive(contacts);
                        break;
                    case 6:
                         Data.displayAllContacts(contacts);
                        break;
                    case 7:
                        b = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }

