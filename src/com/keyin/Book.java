package com.keyin;

public class Book {

    // Instance Variables

    // 'title' holds the name of the book.
    private String title;

    // 'author' stores the name of the individual or entity that wrote the book.
    private String author;

    // 'isbn' is a unique identifier for the book, typically a 10 or 13 digit number.
    private String isbn;

    // 'availability' indicates whether the book is currently available.
    // True means it is available, false means it is not.
    private Boolean availability;

    // Constructors

    // This constructor initializes a new Book object with a title, author, and ISBN.
    // Availability is set to true by default, assuming a new book is available.
    public Book (String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = true;
    }

    // Methods

    // Returns the title of the book.
    public String getTitle(){
        return title;
    }

    // Returns the author of the book.
    public String getAuthor(){
        return author;
    }

    // Returns the ISBN of the book.
    public String getIsbn(){
        return isbn;
    }

    // Returns the availability status of the book.
    public boolean getAvailability(){
        return availability;
    }

    // Updates the title of the book.
    public void setTitle(String newtitle){
        this.title = newtitle;
    }

    // Updates the author of the book.
    public void setAuthor(String newauthor){
        this.author = newauthor;
    }

    // Updates the ISBN of the book.
    public void setIsbn(String newisbn){
        this.isbn = newisbn;
    }

    // Updates the availability status of the book.
    public void setAvailability(Boolean newavailaility){
        this.availability = newavailaility;
    }
}