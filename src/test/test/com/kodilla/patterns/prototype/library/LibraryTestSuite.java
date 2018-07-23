package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {
    @Test
    public void testGetBook() throws CloneNotSupportedException {
        //Given
        final Library library = new Library("Main Library");
        final Book book1 = new Book("The Lord of Rings Tom 1", "Tolkien John Ronald Reuel",
                LocalDate.of(2012, 1, 1));
        final Book book2 = new Book("The Lord of Rings Tom 2", "Tolkien John Ronald Reuel",
                LocalDate.of(2013, 1, 1));
        final Book book3 = new Book("The Lord of Rings Tom 3", "Tolkien John Ronald Reuel",
                LocalDate.of(2014, 1, 1));
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        final Library shallowCopyOfLibrary = library.shallowCopy();
        final Library deepCopyOfLibrary = library.deepCopy();
        //When
        deepCopyOfLibrary.getBooks().remove(book1);
        deepCopyOfLibrary.getBooks().remove(book2);
        //Then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, shallowCopyOfLibrary.getBooks().size());
        assertEquals(1, deepCopyOfLibrary.getBooks().size());
    }
}