package com.rogov.week08.util;

public final class QueryUtil {

    public static final String GET_ALL_DICTIONARY_FROM_BOTH_TABLE = "SELECT *\n" +
            "FROM dictionaries.dictionary_1\n" +
            "UNION\n" +
            "SELECT *\n" +
            "FROM dictionary_2 a\n" +
            "WHERE a.word NOT IN (SELECT dictionary_1.word FROM dictionaries.dictionary_1)\n" +
            "ORDER BY 1";

    public static final String GET_ALL_DICTIONARY_FROM_FIRST_TABLE = "SELECT * FROM dictionaries.dictionary_1;";

    public static final String GET_ALL_DICTIONARY_FROM_SECOND_TABLE = "SELECT * FROM dictionaries.dictionary_2;";

    private QueryUtil() {
    }
}
