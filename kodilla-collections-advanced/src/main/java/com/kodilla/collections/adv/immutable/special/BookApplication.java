package com.kodilla.collections.adv.immutable.special;

public class BookApplication {
    public static void main(String[] args) {

        Book harryPotter = BookManager.createBook("Harry Potter", "J.K. Rowling");
        Book ptasiek = BookManager.createBook("Ptasiek", "Wiliam Whorton");
        Book wladcaPierscieni = BookManager.createBook("Wladca Pierscieni","Tolkien");
        Book wladcaPierscieni1 = BookManager.createBook("Wladca Pierscieni","Tolkien");
        Book ptasiek1 = BookManager.createBook("Ptasiek", "Wiliam Whorton");


        System.out.println("ptasiek1"=="ptasiek");
        System.out.println("ptasiek".equals(ptasiek1));
        System.out.println("wladcaPierscieni"=="wladcaPierscieni1");
        System.out.println("wladcaPierscieni1".equals(wladcaPierscieni));
        System.out.println("ptasiek1".hashCode());
        System.out.println("ptasiek".hashCode());
        System.out.println("wladcaPierscieni1".hashCode());
        System.out.println("wladcaPierscieni".hashCode());


    }
}
