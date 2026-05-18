package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListUniqueWordTest {

    @Test
    void getListUniqueWords() {

        ListUniqueWord listUniqueWord = new ListUniqueWord();
        List<String> result = listUniqueWord.getListUniqueWords("this apple is sweet", "this apple is sour");
        assertEquals(2, result.size());
        assertTrue(result.containsAll(List.of("sweet", "sour")));

    }
}