package com.twu.biblioteca.view;

import com.twu.biblioteca.main.Book;

import java.util.List;

public class BibliotecaView {

    public void showWelcomeMessage() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    public void showMenu(){
        System.out.println("1. List of books");
        System.out.println("2. Checkout a book");
        System.out.println("2. Return a book");
        System.out.println("3. Quit");
        System.out.println("Select（1～4）：");
    }

    public void showInvalidOptionTip() {
        System.out.println("Please select a valid option!");
    }

    public void showInputAuthorTip() {
        System.out.print("Author: ");
    }

    public void showInputPublicationYearTip() {
        System.out.print("publication Year: ");
    }

    public void showAllBooks(List<Book> books) {
        System.out.println("Author\tPublication Year");
        books.stream().forEach(book -> System.out.println(String.format("%s\t%s", book.getAuthor(), book.getPublicationYear())));
    }

    public void showCheckoutResult(boolean isSuccess) {
        System.out.println(isSuccess ? "Thank you! Enjoy the book" : "Sorry, that book is not available");
    }

    public void showReturnResult(boolean isSuccess) {
        System.out.println(isSuccess ? "Thank you for returning the book" : "That is not a valid book to return");
    }
}
