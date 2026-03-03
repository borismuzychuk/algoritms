package org.muzychuk.boris;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for(String str : strs) {
            int[] count = new int[26];
            for(char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }
            String freqArray = Arrays.toString(count);
            anagramsMap.putIfAbsent(freqArray, new ArrayList<>());
            anagramsMap.get(freqArray).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }

    public List<List<String>> groupAnagrams_(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = new String(chars);
            anagramsMap.putIfAbsent(sortStr, new ArrayList<>());
            anagramsMap.get(sortStr).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }

    public static void main(String[] args) {
        int[] count = new int[26];
        for (char c : "pots".toCharArray()) {
            count[c - 'a']++;
        }
        System.out.println(Arrays.toString(count));
    }

}
