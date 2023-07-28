/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q01;

import java.util.LinkedList;

/**
 *
 * @author 840G3
 */
public class MyQueue {
    LinkedList<Integer> t;
    MyQueue() {t = new LinkedList<Integer>();}
    boolean isEmpty() {return(t.isEmpty());}
    void enqueue(int x) {t.add(x);}
    int dequeue() {return(t.removeFirst());}
}
