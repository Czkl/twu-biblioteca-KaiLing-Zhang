package com.twu.biblioteca.main;

import com.twu.biblioteca.view.BibliotecaView;

import java.util.List;

public class Cmd {
    private final BibliotecaView view;
    private final Libaray libaray;
    private final CmdInput input;

    public Cmd() {
        view = new BibliotecaView();
        libaray = new Libaray();
        input = new CmdInput();
    }

    public void showWelcomeMessage() {
        view.showWelcomeMessage();
    }

    public void showMenuOptions() {
        view.showMenu();
    }

    public int getOption() {
        return input.getOption();
    }

    private boolean isValidOption(int option) {
        return option >= 1 && option <= 3;
    }

    public void execute(int option) {
        if(!isValidOption(option)) {
            view.showInvalidOptionTip();
            return;
        }
        switch (option) {
            case 1:
                List<Book> books = libaray.getBooks();
                view.showAllBooks(books);
                break;
            case 2:
            case 3:
                view.showInputAuthorTip();
                String author = input.getAuthor();
                view.showInputPublicationYearTip();
                int publicationYear = input.getPublicationYear();
                boolean isCheckout = option == 2;
                boolean isSuccess = isCheckout
                        ? libaray.checkoutBook(author, publicationYear)
                        : libaray.returnBook(author, publicationYear);
                if(isCheckout) {
                    view.showCheckoutResult(isSuccess);
                } else {
                    view.showReturnResult(isSuccess);
                }
                break;
        }
    }
}
