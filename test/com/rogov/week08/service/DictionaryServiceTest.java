package com.rogov.week08.service;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class DictionaryServiceTest {

    private DictionaryService dictionaryService = DictionaryService.getInstance();

    @Test
    public void testFirstMethodOfDictionaryService() {
        Map<String, Integer> actualDictionary;
        actualDictionary = dictionaryService.getDictionaryUsingTheFirstMethod();

        Assert.assertNotNull(actualDictionary);
    }

    @Test
    public void testSecondMethodOfDictionaryService() {
        Map<String, Integer> actualDictionary;
        actualDictionary = dictionaryService.getDictionaryUsingTheSecondMethod();

        Assert.assertNotNull(actualDictionary);
    }

    @Test
    public void testCorrectDataFromDictionaries() {
        Map<String, Integer> firstDictionary;
        Map<String, Integer> secondDictionary;
        firstDictionary = dictionaryService.getDictionaryUsingTheFirstMethod();
        secondDictionary = dictionaryService.getDictionaryUsingTheSecondMethod();

        Assert.assertEquals(firstDictionary, secondDictionary);
    }
}
