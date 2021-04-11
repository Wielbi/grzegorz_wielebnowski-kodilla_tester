package com.kodilla.collections.adv.exercises;

import java.util.*;

public class Dictionary {

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);

    }

    public List<EnglishWord> findEnglishWord(String polishWord, PartOfSpeech noun) {
        List<EnglishWord>result = new ArrayList<>();
        for (EnglishWord englishWord: dictionary.getOrDefault(polishWord,Collections.emptyList())){

            if (englishWord.getPartOfSpeech().equals(polishWord))
                result.add(englishWord);
        }
        return result;


    }



    public int size() {
        return dictionary.size();
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord,
                Collections.emptyList());

    }
}
