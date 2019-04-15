package com.twu.biblioteca.view;

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
}
