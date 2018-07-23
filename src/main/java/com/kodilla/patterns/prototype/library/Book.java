package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {
    private final String title;
    private final String author;
    private final LocalDate publicationDate;

    Book(final String title, final String author, final LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
