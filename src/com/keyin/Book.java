package com.keyin;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private Boolean availability;

    public Book (String title, String author, String isbn) {
        this.title =title;
        this.author =author;
        this.isbn =isbn;
        this.availability = true;
    }

    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getIsbn(){return  isbn;}
    public boolean getAvailability(){return availability;}

    public void setTitle(String newtitle){this.title = newtitle;}
    public void setAuthor(String newauthor){this.author = newauthor;}
    public void setIsbn(String newisbn){this.isbn = newisbn;}
    public void setAvailability(Boolean newavailaility){this.availability = newavailaility;}

}
