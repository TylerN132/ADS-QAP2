package com.keyin;
import java.util.Scanner;
public class menu {

    private static Library library = new Library();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my libary we hope you have a good time and kept quiet or else...");



        while (true) {
            System.out.println("\nmenu");
            System.out.println("1. Search for a book");
            System.out.println("2. Checkout a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
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
                    System.out.print("Enter ISBN to checkout: ");
                    String checkoutIsbn = scanner.nextLine();
                    System.out.println(library.checkoutBook(checkoutIsbn));
                    break;
                case 3:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = scanner.nextLine();
                    System.out.println(library.returnBook(returnIsbn));
                    break;


                case 4:
                    System.out.println("\nThank you for using the Library Catalog,");
                    System.out.println("Who uses library's anymore nerd!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }

}
