package com.twu.biblioteca.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CmdInput {

    BufferedReader bufferedReader;

    public CmdInput() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public int getOption() {
        try {
            int option = Integer.parseInt(bufferedReader.readLine());
            return option;
        } catch (Exception ex) {
            return -1;
        }
    }

    public String getAuthor() {
        try {
            return bufferedReader.readLine();
        } catch (Exception ex) {
            return null;
        }
    }

    public int getPublicationYear() {
        try {
            int publicationYear = Integer.parseInt(bufferedReader.readLine());
            return publicationYear;
        } catch (Exception ex) {
            return -1;
        }
    }
}
