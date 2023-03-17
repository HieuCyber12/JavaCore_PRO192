/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment6;
import java.util.*;
import java.io.*;

public class Bookstore {
    private ArrayList<Book> books;
    private ArrayList<Invoice> invoices;
    
    public Bookstore() {
        books = new ArrayList<Book>();
        invoices = new ArrayList<Invoice>();
        
        // Create default 4 books with their information (invoices optional)
        books.add(new Book("C001", "Week 1: Introduction to Java", 100, 20));
        books.add(new Book("D002", "A story of ducks", 30, 10));
        books.add(new Book("A003", "Gonne with the wind", 300, 55));
        books.add(new Book("B004", "Dances with Wolfs", 150, 86));
        invoices.add(new Invoice("V01", "A003", 3,3685));
//        invoices.add(new Invoice("V01", [D002, 5]- [A003, 10]- [C001, 2],3685));
//        invoices.add(new Invoice("V01", [A003, 3]- [B004, 4],3685));
    }
    public boolean isValidCode(String code){
        if(code.matches("[A-Z]\\d{3}")){
            return true;
        }
        else{
            throw new IllegalArgumentException("Invalid Book code format. Book code should contain exactly 4 characters, starting with an uppercase letter (A-Z) and followed by three digits (0-9).");        
        }
    }
    
    private Book findBook(String code) {
    for (Book book : books) {
        if (book.getCode().equals(code)) {
            return book;
        }
    }
    return null;
}

    
    public void addBook() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book code: ");
        String code = input.nextLine();
//        if (!isValidCode(code)) {
//            System.out.println("Invalid book code!");
//            return;
//        }
//        if (findBook(code) != null) {
//            System.out.println("Book already exists!");
//            return;
//        }
        System.out.print("Enter book name: ");
        String name = input.nextLine();
        System.out.print("Enter unit price: ");
        double price = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        Book book = new Book(code, name, price, quantity);
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void deleteBook() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book code: ");
        String code = input.nextLine();
        Book book = findBook(code);
        if (book != null) {
            books.remove(book);
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found!");
        }
    }

    public void updateBook() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book code: ");
        String code = input.nextLine();
        Book book = findBook(code);
        if (book != null) {
            System.out.print("Enter book name: ");
            String name = input.nextLine();
            System.out.print("Enter unit price: ");
            double price = input.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            book.setName(name);
            book.setUnitPrice(price);
            book.setQuantity(quantity);
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("Book not found!");
        }
    }

    public void searchBookByName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String name = input.nextLine();
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                results.add(book);
            }
        }
        if (results.isEmpty()) {
            System.out.println("Book not found!");
        } else {
            System.out.println("Search results:");
            for (Book book : results) {
                System.out.println(book);
            }
        }
    }

    public void listAllBooks() {
        System.out.println("All books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
//    public static void main(String[] args) {
//        Bookstore bs = new Bookstore();
//        System.out.println(bs.books.get(0));
//    }
}
//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//        boolean running = true;
//        
//        while (running) {
//            System.out.println("\n===== BOOKSTORE MANAGEMENT SYSTEM =====");
//            System.out.println("0. Create default 4 books with their information (invoices optional)");
//            System.out.println("1. Add / Delete/ Update a book");
//            System.out.println("2. Search book by name");
//            System.out.println("3. List all books");
//            System.out.println("4. List all books after sorting by book name, code, or price based on the user’s request.");
//            System.out.println("5. Let user to choose some books to buy and compute the total price.");
//            System.out.println("6. List all invoices or one invoice in detail.");
//            System.out.println("7. Show the top 3 best seller books, top 3 book in revenue?");
//            System.out.println("8. Load books & invoices from files (book.txt & invoice.txt)");
//            System.out.println("9. Automatically update the changes of books and invoices’ information to their files");
//            System.out.println("10. Quit");
//            
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            
//            switch (choice) {
//                case 0:
//                    System.out.println("\nDefault books created:");
//                    for (Book book : books) {
//                        System.out.println(book);
//                    }
//                    break;
//                case 1:
//                    System.out.println("\n1. Add / Delete/ Update a book");
//                    System.out.println("a. Add a book");
//                    System.out.println("b. Delete a book");
//                    System.out.println("c. Update a book");
//                    String subChoice1 = scanner.nextLine();
//                    switch (subChoice1) {
//                        case "a":
//                            addBook();
//                            break;
//                        case "b":
//                            deleteBook();
//                            break;
//                        case "c":
//                            updateBook();
//                            break;
//                        default:
//                            System.out.println("Invalid choice");
//                            break;
//                    }
//                    break;
//                case 2:
//                    System.out.println("\n2. Search book by name");
//                    System.out.print("Enter book name: ");
//                    String bookName = scanner.nextLine();
//                    ArrayList<Book> matchingBooks = searchBookByName(bookName);
//                    if (matchingBooks.isEmpty()) {
//                        System.out.println("No matching book found");
//                    } else {
//                        System.out.println("Matching books:");
//                        for (Book book : matchingBooks) {
//                            System.out.println(book);
//                        }
//                    }
//                    break;
//                case 3:
//                    System.out.println("\n3. List all books");
//                    listAllBooks();
//                    break;
//                case 4:
//                    System.out.println("\n4. List all books after sorting by book name, code, or price based on the user’s request.");
//                    System.out.println("a. Sort by book name");
////                    System.out.println("b. Sort

