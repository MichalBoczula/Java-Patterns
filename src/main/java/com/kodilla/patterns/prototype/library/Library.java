package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

final class Library extends Prototype {
    final private String name;
    private Set<Book> books = new HashSet<>();

    Library(final String name) {
        this.name = name;
    }

    Set<Book> getBooks() {
        return books;
    }

    String getName() {
        return name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library) super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book book : books) {
            cloneLibrary.addBook(book);
        }
        return cloneLibrary;
    }
}
