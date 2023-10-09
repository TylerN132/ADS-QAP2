package com.keyin;

public class Library {

    // Instance Variables

    // 'books' is an array that holds Book objects, representing the collection of books in the library.
    private Book[] books;

    // Constructors

    // This constructor initializes a new Library object with a predefined set of books.
    public Library() {
        this.books = new Book[] {
                new Book("The Chronicles of Narnia","CS Lewis","234"),
                new Book("The Lord of the Rings","Tolkien","567" ),
                new Book("Twilight","Unimportant","89"),
                new Book("The Catcher and the Rye","History Guy","00" ),
                new Book("Eragon","Chris","1" )
        };
    }

    // Methods

    // This method searches for books in the library that match the provided query (in title, author, or ISBN)
    // and returns an array of all matching Book objects.
    public Book[] searchBook(String query) {
        int foundBook = 0;
        // Count the number of books that match the query.
        for (Book book : books){
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(query.toLowerCase()) ||
                    book.getIsbn().toLowerCase().contains(query.toLowerCase())) {
                foundBook++;
            }
        }

        // Create an array to store the matching books.
        Book[] results = new Book[foundBook];

        int resultIndex = 0;
        // Add the matching books to the results array.
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(query.toLowerCase()) ||
                    book.getIsbn().toLowerCase().contains(query.toLowerCase())) {
                results[resultIndex] = book;
                resultIndex++;
            }
        }

        return results;
    }

    // This method allows a book to be checked out of the library using its ISBN.
    // It returns a message indicating the status of the checkout process.
    public String checkoutBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.getAvailability()) {
                    book.setAvailability(false); // Set the book as checked out
                    return "Book " + book.getTitle() + " checked out! Please return eventually.";
                } else {
                    return "Book not available.";
                }
            }
        }
        return "Book not found.";
    }

    // This method allows a book to be returned to the library using its ISBN.
    // It returns a message indicating the status of the return process.
    public String returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.getAvailability()) {
                    return "Book isn't rented. Please try again or contact administrator.";
                }
                book.setAvailability(true); // Set the book as available
                return "Book " + book.getTitle() + " returned! Thank you.";
            }
        }
        return "Book not found.";
    }
}