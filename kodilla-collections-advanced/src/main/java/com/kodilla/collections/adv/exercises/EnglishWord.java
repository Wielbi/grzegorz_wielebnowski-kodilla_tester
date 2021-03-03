package com.kodilla.collections.adv.exercises;

import java.util.Objects;

public class EnglishWord {
    private PartOfSpeech partOfSpeech;
    private String word;

    public EnglishWord(PartOfSpeech partOfSpeech, String word){
        this.partOfSpeech = partOfSpeech;
        this.word = word;

    }
    private PartOfSpeech getPartOfSpeech(){
        return partOfSpeech;

    }
    private String getWord(){
        return word;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return partOfSpeech == that.partOfSpeech &&
                Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partOfSpeech, word);
    }
}
