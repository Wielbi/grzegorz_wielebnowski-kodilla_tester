package com.kodilla.collections.adv.immutable.special;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    static List<Book> bookList = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book result = new Book(title, author);
        if (!bookList.contains(result)) {
            bookList.add(result);
            System.out.println("Dodaje ksiazke do listy ");
        }

        return result;


    }


}
