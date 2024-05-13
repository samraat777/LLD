package com.sam.java.IteratorDesignPattern;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book(100,"Maths"),
                new Book(200,"Science"),
                new Book(300,"Drawing")
        );

        Library lib = new Library(bookList);
        Iterator iterator = lib.createIterator();

        while(iterator.hasNext())
        {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
