/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

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

    void push(char x) {
        Node q = new Node(x, head);
        head = q;
    }

    char pop() {
        char x = head.info;
        head = head.next;
        return (x);
    }

    public void decToBin(int k) {
        System.out.print(k + " in binary system is: ");
        while (k > 0) {
            int x = (k % 2);
            String X= x+"";
            push(X.charAt(0));
            k = k / 2;
        }
        while (!isEmpty()) {
            System.out.print(pop());
        }
        System.out.println();
    }
}
