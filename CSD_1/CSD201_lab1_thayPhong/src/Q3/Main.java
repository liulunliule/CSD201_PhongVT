/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author 840G3
 */
public class Main {

    public static void main(String[] args) {
        // Create a DoublyLinkedList object
        DoublyLinkedList dlList = new DoublyLinkedList();
        Node p = new Node();
        // Add nodes to the list  
        dlList.addToHead(3);
        dlList.addToHead(6);
        dlList.addToHead(9);
        // Print the nodes of DoublyLinkedList 
        System.out.print("after add to head *3 : ");
        dlList.traversal();
        dlList.addToTail(1);
        dlList.addToTail(5);
        dlList.addToTail(4);
        // Print the nodes of DoublyLinkedList  
        System.out.print("after add to tail *3 : ");
        dlList.traversal();
        // Delete the first node
        dlList.deleFirst();
        dlList.deleFirst();
        System.out.print("after dele to head *2: ");
        dlList.traversal();
        // Delete the last node
        dlList.deleLast();
        dlList.deleLast();
        System.out.print("after dele to tail *2: ");
        dlList.traversal();

        dlList.addToTail(8);
        dlList.addToTail(7);
        dlList.addToTail(9);
        dlList.addToHead(1);
        dlList.addToHead(6);
        dlList.addToHead(2);
        p = dlList.search(1);
        dlList.addAfter(p, 8);
        dlList.traversal();
        System.out.println("Count size: " + dlList.count());
        dlList.deleteNode(1);
        System.out.println("dele 1: ");
        dlList.traversal();
        p = dlList.search(1);
        dlList.deleteBefore(p);
        System.out.println("dele before 1: ");
        dlList.traversal();
        dlList.deleteAfter(p);
        System.out.println("dele after 1: ");
        dlList.traversal();
        System.out.println("Count size: " + dlList.count());
        dlList.deleteNode2(2);
        System.out.println("dele index 2");
        dlList.traversal();
        System.out.println("Status ACS Sort: " + dlList.sorted());
        dlList.sort();
        System.out.print("List after sort: ");
        dlList.traversal();
        System.out.println("Status ACS Sort: " + dlList.sorted());
        dlList.reverse();
        System.out.print("List after reverse: ");
        dlList.traversal();
        System.out.println("Status ACS Sort: " + dlList.sorted());
        System.out.println("Sum: " + dlList.sum());
        System.out.println("Avg: " + dlList.avg());
        System.out.println("Max: " + dlList.max());
        System.out.println("Min: " + dlList.min());
        dlList.AddToArr();

    }
}
