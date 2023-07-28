/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2_differ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 840G3
 */
public class LZWEncoding {
    public static Map<String, Integer> createDictionary(String input) {
        Map<String, Integer> dictionary = new HashMap<>();
        int index = 0;

        for (char c : input.toCharArray()) {
            String current = String.valueOf(c);

            if (!dictionary.containsKey(current)) {
                dictionary.put(current, index++);
            }
        }

        return dictionary;
        }
    
     public static List<Integer> compressString(String input) {
        Map<String, Integer> dictionary = createDictionary(input);
        List<Integer> compressedOutput = new ArrayList<>();

        String current = "";
        for (char c : input.toCharArray()) {
            String next = current + c;
            if (dictionary.containsKey(next)) {
                current = next;
            } else {
                compressedOutput.add(dictionary.get(current));
 dictionary.put(next, dictionary.size());
 current = String.valueOf(c);
            }
        }

        compressedOutput.add(dictionary.get(current));

        return compressedOutput;
    }
}
