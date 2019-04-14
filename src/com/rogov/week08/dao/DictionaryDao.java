package com.rogov.week08.dao;

import com.rogov.week08.exeption.DaoException;
import com.rogov.week08.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.TreeMap;

public class DictionaryDao {

    private static final DictionaryDao INSTANCE = new DictionaryDao();

    private DictionaryDao() {
    }

    public Map<String, Integer> getFirstDictionary(String queryUtil) {
        Map<String, Integer> dictionary = new TreeMap<>();
        String word;
        Integer referenceId;
        try (Connection connection = ConnectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(queryUtil)) {

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                word = resultSet.getString("word");
                referenceId = resultSet.getInt("reference_id");
                dictionary.put(word, referenceId);
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }

        return dictionary;
    }

    public static DictionaryDao getInstance() {
        return INSTANCE;
    }
}
