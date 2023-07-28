/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import Q1.List;
import Q1.Node;

/**
 *
 * @author 840G3
 */
public class Q2 {

    public static void main(String[] args) {
        Node p = new Node();
        Node h1 = new Node();
        Node h2 = new Node();
        List list = new List();
        List M = new List();
        List alist = new List();
        List blist = new List();
        List clist = new List();

        list.addToHead(6);
        list.addToTail(4);
        list.addToTail(5);
        list.addToHead(7);
        list.addToHead(3);
        list.addToHead(1);
        list.addToHead(3);
        list.addToHead(5);
        System.out.print("Created list: ");
        list.traversal();

        int count = list.count();
        System.out.println("Number of nodes in the list: " + count);

        list.deleteNode(3); // delete node with data 3
//        list.deleFirst();
//        list.deleLast();
        System.out.print("List after delete 3: ");
        list.traversal();

        p = list.search(3);
        list.addAfter(p, 2);
        System.out.print("List after insert 2 after 3: ");
        list.traversal();
        p = list.search(6);
        list.addBefore(p, 9);
        System.out.print("List after insert 9 before 6: ");
        list.traversal();

//        list.deleFirst();
//        list.deleLast();
        p = list.search(1);
        list.deleteAter(p);
        System.out.print("List after delete node after 1: ");
        list.traversal();
        p = list.search(1);
        list.deleteBefore(p);
        System.out.print("List after delete node before 1: ");
        list.traversal();

        list.deleteNode2(3);
        System.out.print("List after delete the 3rd node: ");
        list.traversal();

        list.sort();
        System.out.print("List after sort: ");
        list.traversal();
        System.out.println("Status Sort: " + list.sorted());

        list.reverse();
        System.out.print("List after reverse: ");
        list.traversal();
        System.out.println("Count num of list: " + list.count());
        System.out.println("Sum: " + list.sum());
        System.out.println("Avg: " + list.avg());
        System.out.println("Max: " + list.max());
        System.out.println("Min: " + list.min());
//        list.sorted();
        System.out.println("Status Sort: " + list.sorted());
        list.AddToArr();

        System.out.print("Create alist: ");
        alist.addToHead(6);
        alist.addToTail(4);
        alist.addToTail(5);
        alist.addToHead(7);
        alist.addToHead(3);
        alist.addToHead(1);
        alist.addToHead(3);
        alist.addToHead(5);
        alist.traversal();

        System.out.print("Create blist: ");
        blist.addToHead(6);
        blist.addToTail(4);
        blist.addToTail(5);
        blist.addToHead(7);
        blist.addToHead(3);
        blist.addToHead(1);
        blist.addToHead(3);
        blist.addToHead(5);
        blist.traversal();

//        h1 = alist.search(5);
//        h2 = blist.search(5);
        System.out.println("Check content: " + alist.CheckContent(alist, blist));

        System.out.print("Create M list: ");
        M.addToHead(6);
        M.addToTail(4);
        M.addToTail(5);
        M.addToHead(7);
        M.addToHead(3);
        M.addToHead(1);
        M.addToHead(3);
        M.addToHead(5);
        M.traversal();
        System.out.print("list:");
        list.traversal();
        System.out.print("Merge list to M: ");
        M.Merge(list);
        M.traversal();
        System.out.println("Attach blist to alist");
        alist.Attach(blist);
        alist.traversal();

    }
}
