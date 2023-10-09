package com.keyin;

public class Library {

    private Book[] books;
    public Library() {this.books = new Book[] {
            new Book("The Chronicles of Narnia","CS lewis","234"),
            new Book("The Lord of the rings","Tolkin","567" ),
            new Book("Twilight","Unimportant","89"),
            new Book("The catcher and the rye","History Guy","00" ),
            new Book("Eragon","Chris","1" )
    };
    }

    public Book[]searchBook(String query) {
        int foundbook = 0;
        for (Book book : books){
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) || book.getAuthor().toLowerCase().contains(query.toLowerCase()) || book.getIsbn().toLowerCase().contains(query.toLowerCase())) {
                foundbook++;
            }
        }


        Book[] results = new Book[foundbook];


       int resultindex = 0;

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) || book.getAuthor().toLowerCase().contains(query.toLowerCase()) || book.getIsbn().toLowerCase().contains(query.toLowerCase())) {
                results[resultindex] = book;
                resultindex++;
            }
        }

        return results;

    }

    public String checkoutBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn));
            if (book.getAvailability()) {
                book.setAvailability(false); // Set the book as checked out
                return "Book " + book.getTitle() + " checked out! Please return eventually.";
            } else if (!book.getAvailability()) {
                return "Book not available.";
            }
        }
        return "Book not found.";
    }

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