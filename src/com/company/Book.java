package com.company;

public class Book {
    private String author;
    private int length;
    public Book(String author, int length){
        this.length=length;
        this.author=author;
    }
    public Book(){
        length=300;
        author="Pushkin";
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", length=" + length +
                '}';
    }
}
