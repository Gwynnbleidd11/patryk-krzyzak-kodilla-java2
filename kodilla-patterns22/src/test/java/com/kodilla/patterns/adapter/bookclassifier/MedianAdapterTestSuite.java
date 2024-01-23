package com.kodilla.patterns.adapter.bookclassifier;

import com.kodilla.patterns.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author A", "Book A", 1999, "12345"));
        bookSet.add(new Book("Author B", "Book B", 1958, "13456"));
        bookSet.add(new Book("Author C", "Book C", 1939, "14567"));
        bookSet.add(new Book("Author D", "Book D", 2002, "15678"));
        bookSet.add(new Book("Author E", "Book E", 2012, "16789"));
        MedianAdapter adapter = new MedianAdapter();

        //When
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1999, median);
    }
}
