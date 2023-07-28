/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author 840G3
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Brute Force:");
        bruteForce t = new bruteForce();    
        String a = "0123456789";
        String p = "567";
        t.testSearching(a,p); 
        
        //2
        System.out.println("\nKnuth-Morris-Pratt:");
        knuthmorrispratt k = new knuthmorrispratt();    
        String a1 = "9876543210";
        String p1 = "765";
        k.testSearch(a1,p1);
    }
}
