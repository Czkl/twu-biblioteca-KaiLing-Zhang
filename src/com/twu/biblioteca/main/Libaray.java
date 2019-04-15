package com.twu.biblioteca.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Libaray {
    private List<Book> books;

    public Libaray(){
        initBooks();
    }

    public void initBooks() {
        books = new ArrayList<>();
        books.add(new Book("jieren", 1992, false));
        books.add(new Book("xiaohong", 1997, false));
        books.add(new Book("xiaoqiang", 2226, false));
    }

    public List<Book> getBooks() {
        return books;
    }
    public boolean checkoutBook(String author, Number publicationYear) {
        Optional<Book> targetBook = books.stream().filter(book -> !book.isBorrowed() && book.getAuthor().equals(author) && book.getPublicationYear().equals(publicationYear)).findFirst();
        if(targetBook.isPresent()) {
            targetBook.get().setBorrowed(true);
            return true;
        }
        return false;
    }

    public boolean returnBook(String author, Number publicationYear) {
        Optional<Book> targetBook = books.stream().filter(book -> book.isBorrowed() && book.getAuthor().equals(author) && book.getPublicationYear().equals(publicationYear)).findFirst();
        if(targetBook.isPresent()) {
            targetBook.get().setBorrowed(false);
            return true;
        }
        return false;
    }
}
