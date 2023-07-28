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
public class MyStack {
    LinkedList<Integer> t;
    MyStack() {t = new LinkedList<Integer>();}
    boolean isEmpty() {return(t.isEmpty());}
    void push(int x) {t.add(x);}
    int pop() {return(t.removeLast());}
}
