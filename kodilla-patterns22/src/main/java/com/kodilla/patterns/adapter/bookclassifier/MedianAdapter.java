package com.kodilla.patterns.adapter.bookclassifier;

import com.kodilla.patterns.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns.adapter.bookclassifier.libraryb.*;
import com.kodilla.patterns.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends  MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns.adapter.bookclassifier.libraryb.Book> booksMap = new HashMap<>();
        for (Book book : bookSet) {
            booksMap.put(
                    new BookSignature(book.getSignature()),
                    new com.kodilla.patterns.adapter.bookclassifier.libraryb.Book(
                            book.getAuthor(),
                            book.getTitle(),
                            book.getPublicationYear()
                    )
            );
        }
        return medianPublicationYear(booksMap);
    }

    public int publicationYearAverage(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns.adapter.bookclassifier.libraryb.Book> booksMap = new HashMap<>();
        for (Book book : bookSet) {
            booksMap.put(
                    new BookSignature(book.getSignature()),
                    new com.kodilla.patterns.adapter.bookclassifier.libraryb.Book(
                            book.getAuthor(),
                            book.getTitle(),
                            book.getPublicationYear()
                    )
            );
        }
        return averagePublicationYear(booksMap);
    }
}
