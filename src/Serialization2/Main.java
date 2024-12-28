package Serialization2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void Palindrome(int x) {
        if (x < 0) {
            System.out.println("False");
        } else if (x < 10) System.out.println("True");
        else {
            String s = Integer.toString(x);
            String s2 = "";
            StringBuilder sb = new StringBuilder(s2);
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            int a = Integer.parseInt(sb.toString());
            if (a == x) System.out.println("True");
            else System.out.println("False");
        }
    }

    public static void Duplicates(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                i--;
            }
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void AddBook(ArrayList<Book> books, Scanner scanner) {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ID code: ");
        String idCode = scanner.nextLine();
        books.add(new Book(title, author, idCode, false));
    }

    public static void CheckOutBook(ArrayList<Book> books, Scanner scanner) {
        System.out.print("Enter ID code of the book to check out: ");
        String checkOutId = scanner.nextLine();
        boolean checkedOut = false;
        for (Book book : books) {
            if (book.getIdCode().equals(checkOutId) && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                System.out.println("Book checked out: " + book.getTitle());
                checkedOut = true;
                break;
            }
        }
        if (!checkedOut) {
            System.out.println("Book not found or already checked out.");
        }
    }

    public static void ReturnBook(ArrayList<Book> books, Scanner scanner) {
        System.out.print("Enter ID code of the book to return: ");
        String returnId = scanner.nextLine();
        boolean returned = false;
        for (Book book : books) {
            if (book.getIdCode().equals(returnId) && book.isCheckedOut()) {
                book.setCheckedOut(false);
                System.out.println("Book returned: " + book.getTitle());
                returned = true;
                break;
            }
        }
        if (!returned) {
            System.out.println("Book not found or not checked out.");
        }
    }

    public static void SaveLibraryState(ArrayList<Book> books) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\Library.txt"))) {
            out.writeObject(books);
            System.out.println("Library state saved.");
        } catch (IOException e) {
            System.out.println("Error saving library state.");
        }
    }

    public static void LoadLibraryState(ArrayList<Book> books) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\Library.txt"))) {
            books = (ArrayList<Book>) in.readObject();
            System.out.println("Library state loaded.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading library state.");
        }
    }

    public static void DisplayBooks(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        Palindrome(x);
        System.out.println("Enter length of an array");
        int size = scanner.nextInt();
        System.out.println("Enter array of integers");
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int input = scanner.nextInt();
            list.add(input);
        }
        Duplicates(list);
        ArrayList<Book> books = new ArrayList<>();
                System.out.println("Library Management System");
                    System.out.println();
                    System.out.println("1. Add Book");
                    System.out.println("2. Check Out Book");
                    System.out.println("3. Return Book");
                    System.out.println("4. Save Library State");
                    System.out.println("5. Load Library State");
                    System.out.println("6. Display Books");
                    System.out.println("7. Exit Library System");
                    System.out.print("Choose an option: ");
                    int libraryChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (libraryChoice) {
                        case 1:
                            AddBook(books, scanner);
                            break;
                        case 2:
                            CheckOutBook(books, scanner);
                            break;
                        case 3:
                            ReturnBook(books, scanner);
                            break;
                        case 4:
                            SaveLibraryState(books);
                            break;
                        case 5:
                            LoadLibraryState(books);
                            break;
                        case 6:
                            DisplayBooks(books);
                            break;
                        case 7:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                }
            }
