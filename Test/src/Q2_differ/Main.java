/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2_differ;

import static Q2_differ.LZWEncoding.compressString;
import static Q2_differ.LZWEncoding.createDictionary;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 840G3
 */
public class Main {
    public static void main(String[] args) {
        String input = "ABABABA";

        //1
        System.out.println("Q2.1");
        Map<String, Integer> dictionary = createDictionary(input);
        System.out.println(dictionary);
        System.out.println("\nQ2.2");
        List<Integer> compressedOutput = compressString(input);
        System.out.println(compressedOutput);
    }
}
