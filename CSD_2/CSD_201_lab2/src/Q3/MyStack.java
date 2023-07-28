/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author 840G3
 */
public class MyStack {

    Node head;

    MyStack() {
        head = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void push(String x) {
        Node q = new Node(x, head);
        head = q;
    }

    String pop() {
        String x = head.info;
        head = head.next;
        return (x);
    }

    public void decToBin(int k) {
        System.out.print(k + " in binary system is: ");
        while (k > 0) {
            int x = (int)(k % 2);
            push(""+x);
            k = k / 2;
        }
        while (!isEmpty()) {
            System.out.print(pop());
        }
        System.out.println();
    }
}
