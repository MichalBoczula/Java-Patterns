package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

final class Library<T> implements Cloneable {
    final private String name;
    private Set<T> books = new HashSet<>();

    @Override
    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }

    Library(final String name) {
        this.name = name;
    }

    Set<T> getBooks() {
        return books;
    }

    String getName() {
        return name;
    }

    void addBook(T book) {
        books.add(book);
    }

    Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library) super.clone();
        cloneLibrary.books = new HashSet<>();
        for (T book : books) {
            cloneLibrary.addBook(book);
        }
        return cloneLibrary;
    }
}
