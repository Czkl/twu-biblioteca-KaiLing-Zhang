package com.twu.biblioteca.main;

public class Book {
        private String author;
        private Number publicationYear;
        private boolean isBorrowed;

        public Book(String author, Number publicationYear, boolean isBorrowed) {
            this.author = author;
            this.publicationYear = publicationYear;
            this.isBorrowed = isBorrowed;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Number getPublicationYear() {
            return publicationYear;
        }

        public void setPublicationYear(Number publicationYear) {
            this.publicationYear = publicationYear;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }
}
