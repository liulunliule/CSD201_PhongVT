/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2_dijkstra;

import java.util.LinkedList;

/**
 *
 * @author 840G3
 */
public class MyStack {

    LinkedList a;

    MyStack() {
        a = new LinkedList();
    }

    boolean isEmpty() {
        return (a.isEmpty());
    }

    void push(int x) {
        a.add(x);
    }

    int pop() {
        return ((Integer) a.removeLast());
    }
}
