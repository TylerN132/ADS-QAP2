package com.keyin;
import java.util.Scanner;

public class menu {

    // Instance Variables

    // 'library' is a static instance of the Library class, used to interact with the library's functionalities.
    private static Library library = new Library();

    // Main Method

    // The entry point of the program. This method is executed when the program starts.
    public static void main(String[] args) {
        // 'scanner' is used to read the user's input from the console.
        Scanner scanner = new Scanner(System.in);

        // Welcome message displayed to the user.
        System.out.println("Welcome to my library. We hope you have a good time and keep quiet or else...");

        // Infinite loop to keep the menu running until the user chooses to exit.
        while (true) {
            // Displaying the menu options to the user.
            System.out.println("\nMenu");
            System.out.println("1. Search for a book");
            System.out.println("2. Checkout a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice");

            // Reading the user's choice from the console.
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            // Switch statement to handle the user's choice.
            switch (choice) {
                case 1:
                    // Search for a book.
                    System.out.print("Enter search query: ");
                    String query = scanner.nextLine();
                    Book[] results = library.searchBook(query);
                    if (results.length > 0) {
                        System.out.println("Search results:");
                        for (Book book : results) {
                            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
                        }
                    } else {
                        System.out.println("No books found matching query: " + query);
                    }
                    break;
                case 2:
                    // Checkout a book.
                    System.out.print("Enter ISBN to checkout: ");
                    String checkoutIsbn = scanner.nextLine();
                    System.out.println(library.checkoutBook(checkoutIsbn));
                    break;
                case 3:
                    // Return a book.
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = scanner.nextLine();
                    System.out.println(library.returnBook(returnIsbn));
                    break;
                case 4:
                    // Exit the program.
                    System.out.println("\nThank you for using the Library Catalog,");
                    System.out.println("Who uses libraries anymore, nerd!");
                    return; // Exit the program
                default:
                    // Handle invalid choices.
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
