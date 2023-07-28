/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.LinkedList;

/**
 *
 * @author 840G3
 */
class Main {

    public static void main(String[] args) {
        LinkedList t = new LinkedList();
        Node x;
        int n, i;
        x = new Node("A01", 25);
        t.add(x);
        x = new Node("A02", 23);
        t.add(x);
        x = new Node("A03", 21);
        t.add(x);
        for (i = 0; i < t.size(); i++) {
            System.out.println(t.get(i));
        }
    }
}
