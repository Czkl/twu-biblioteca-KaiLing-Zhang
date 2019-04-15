package com.twu.biblioteca;

import com.twu.biblioteca.main.Cmd;

public class BibliotecaApp {

    public static void main(String[] args) {
        Cmd cmdEntry = new Cmd();
        cmdEntry.showWelcomeMessage();
        while (true) {
            cmdEntry.showMenuOptions();
            int option = cmdEntry.getOption();
            if (option == 4) break;
            cmdEntry.execute(option);
        }
    }
}
