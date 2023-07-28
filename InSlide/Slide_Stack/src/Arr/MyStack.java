/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arr;

/**
 *
 * @author 840G3
 */
import java.util.*;

class MyStack {

    ArrayList h;

    MyStack() {
        h = new ArrayList();
    }

    boolean isEmpty() {
        return (h.isEmpty());
    }

    void push(Object x) {
        h.add(x);
    }

    Object pop() {
        if (isEmpty()) {
            return (null);
        }
        return (h.remove(h.size() - 1));
    }
}
