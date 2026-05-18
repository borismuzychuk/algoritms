package org.muzychuk.boris;

import java.util.*;

public class ListUniqueWord {

    // слова встречается один раз в строке, возвращаем список,
    // пример:
    // s1 = "this apple is sweet", s2 = "this apple is sour"
    // result: sweet, sour
    public List<String> getListUniqueWords(String first, String second) {
        String string = first + " " + second;
        Map<String, Integer> freqMap = new HashMap<>();
        for (String str :  string.split(" ")) {
            freqMap.merge(str, 1, Integer::sum);
        }
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> pair : freqMap.entrySet()) {
            if (pair.getValue() == 1) {
                result.add(pair.getKey());
            }
        }
        return result;
    }
}
