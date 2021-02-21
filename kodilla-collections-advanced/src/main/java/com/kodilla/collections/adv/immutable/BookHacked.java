package com.kodilla.collections.adv.immutable;

public class BookHacked extends Book{
    public BookHacked(String author, String title) {
        super(author, title);

    }
    public BookHacked(String author, String title) {
        super(author, title);
        realTitle = title;
    }

    public void modifyTitle(String newTitle) { realTitle = newTitle; }

    @Override
    public String getTitle() {
        return realTitle;
    }
}
