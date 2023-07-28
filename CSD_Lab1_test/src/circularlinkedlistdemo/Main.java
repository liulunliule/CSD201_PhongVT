/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularlinkedlistdemo;

/**
 *
 * @author 840G3
 */
public class Main {

    public static void main(String[] args) {
        // Create a CircularLinkedList object
        CircularLinkedList c_list = new CircularLinkedList();
        Node p = new Node();
        // Add data
        c_list.addBegin(4);
        c_list.addBegin(5);
        c_list.addBegin(6);
        c_list.addEnd(3);
        c_list.addEnd(2);
        c_list.addEnd(1);
        c_list.addBegin(7);
        c_list.addBegin(8);
        c_list.addBegin(9);
        c_list.addEnd(7);
        c_list.addEnd(7);
        c_list.addEnd(1);
        c_list.displayList();
        // Delete a node
        c_list.deleFirst();
        c_list.deleFirst();
        System.out.println("dele first *2:");
        c_list.displayList();

        c_list.deleLast();
        c_list.deleLast();
        System.out.println("dele last *2");
        c_list.displayList();

        p = c_list.search(3);
        c_list.addAfter(p, 2);
        System.out.println("add 2 after p=3");
        c_list.displayList();
        System.out.println("count: " + c_list.count());

        c_list.addEnd(9);
        c_list.addEnd(7);
        c_list.addEnd(8);
        System.out.println("add end *3");
        c_list.displayList();
        System.out.println("count: " + c_list.count());

        c_list.deleteAfter(p);
        System.out.println("dele after p=3");
        c_list.displayList();
        p = c_list.search(8);
        c_list.deleteAfter(p);
        System.out.println("dele after p=8");
        c_list.displayList();
        c_list.deleteBefore(p);
        System.out.println("dele before p=8");
        c_list.displayList();

        c_list.deleFirst();
        c_list.displayList();
        p = c_list.search(5);
        c_list.deleteBefore(p);
        System.out.println("dele before p=5");
        c_list.displayList();
        c_list.deleFirst();
        c_list.displayList();
        c_list.deleteNode(9);
        System.out.println("delete note 9");
        c_list.displayList();

        p = c_list.search(2);
        c_list.delete(p);
        System.out.println("delete note p");
        c_list.displayList();

        c_list.deleteNode2(1);
        System.out.println("dele node index 1");
        c_list.displayList();
        System.out.println("Size count: " + c_list.count());

        System.out.println("Max: " + c_list.max());
        System.out.println("Min: " + c_list.min());
        System.out.println("Sum: " + c_list.sum());

        c_list.sort();
        System.out.println("sort: ");
        c_list.displayList();
        System.out.println("Status Sort: " + c_list.sorted());
        c_list.reverse();
        System.out.println("reverse: ");
        c_list.displayList();
        System.out.println("Status Sort: " + c_list.sorted());
        System.out.println("Max: " + c_list.max());
        System.out.println("Min: " + c_list.min());
        System.out.println("Sum: " + c_list.sum());
        System.out.println("Size count: " + c_list.count());
        System.out.println("avg: " + c_list.avg());

    }
}
