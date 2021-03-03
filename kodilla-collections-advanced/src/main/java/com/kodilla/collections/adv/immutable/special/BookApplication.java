package com.kodilla.collections.adv.immutable.special;

public class BookApplication {
    public static void main(String[] args) {

        Book harryPotter = BookManager.createBook("Harry Potter", "J.K. Rowling");
        Book ptasiek = BookManager.createBook("Ptasiek", "Wiliam Whorton");
        Book wladcaPierscieni = BookManager.createBook("Wladca Pierscieni","Tolkien");


        System.out.println(harryPotter== ptasiek);
        System.out.println(harryPotter.equals(ptasiek));
        System.out.println(harryPotter.hashCode());
        System.out.println("--------");
        System.out.println(harryPotter==wladcaPierscieni);
        System.out.println(harryPotter.equals(wladcaPierscieni));
        System.out.println(wladcaPierscieni.hashCode());
        System.out.println(ptasiek.hashCode());

    }
}
