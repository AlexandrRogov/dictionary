package com.rogov.week08.service;

import com.rogov.week08.dao.DictionaryDao;
import com.rogov.week08.util.QueryUtil;

import java.util.Map;
import java.util.TreeMap;

public class DictionaryService {

    private static final DictionaryService INSTANCE = new DictionaryService();
    private DictionaryDao dictionaryDao = DictionaryDao.getInstance();
    private Map<String, Integer> resulDictionary = new TreeMap<>();

    private DictionaryService() {
    }

    public Map<String, Integer> getDictionaryUsingTheFirstMethod() {
        resulDictionary = dictionaryDao.getFirstDictionary(QueryUtil.GET_ALL_DICTIONARY_FROM_SECOND_TABLE);
        resulDictionary.putAll(dictionaryDao.getFirstDictionary(QueryUtil.GET_ALL_DICTIONARY_FROM_FIRST_TABLE));

        return resulDictionary;
    }

    public Map<String, Integer> getDictionaryUsingTheSecondMethod() {
        resulDictionary = dictionaryDao.getFirstDictionary(QueryUtil.GET_ALL_DICTIONARY_FROM_BOTH_TABLE);

        return resulDictionary;
    }

    public static DictionaryService getInstance() {
        return INSTANCE;
    }
}
