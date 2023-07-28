package Q1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 840G3
 */
public class Node {

    int info;
    Node next;

    Node(int x, Node p) {
        info = x;
        next = p;
    }
    
    Node(int x) {
        this(x, null);
    }
}
