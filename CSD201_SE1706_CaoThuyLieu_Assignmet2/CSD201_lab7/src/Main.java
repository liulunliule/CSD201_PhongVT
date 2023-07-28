/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 840G3
 */
public class Main {
    public static void main(String[] args) {
        ChainingHashTable hashTable = new ChainingHashTable();

        // Inserting sample students into the hash table
        hashTable.insert(new Student("Alice", 20, 85.5));
        hashTable.insert(new Student("Bob", 19, 90.0));
        hashTable.insert(new Student("Kiet", 22, 78.5));
        hashTable.insert(new Student("Zen", 21, 97.0));
        hashTable.insert(new Student("David", 21, 95.0));
        hashTable.insert(new Student("Don", 21, 95.0));

        // Displaying the hash table
        hashTable.display();
    }
}
