package com.kodilla.collections.adv.exercises.dictionary;

import com.kodilla.collections.adv.exercises.Dictionary;
import com.kodilla.collections.adv.exercises.EnglishWord;
import com.kodilla.collections.adv.exercises.PartOfSpeech;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord() {
        //given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");

        // when
        dictionary.addWord(polishWord, englishWord);

        //then
        assertEquals(1, dictionary.size());
    }

    @Test
    public void testFindEnglishWords() {
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.NOUN, "play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWord("gra");
        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));

        assertEquals(2, result.size());
    }

    @Test
    public void testFindEnglishWords_withPartOfSpeech(){
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.NOUN,"Lake"));
        dictionary.addWord("grać",new EnglishWord(PartOfSpeech.NOUN,"play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWord("brać",PartOfSpeech.NOUN);
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"btotherhood"));

    }
}