package Q3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 840G3
 */
public class Node {

    String info;
    Node next;

    Node(String x, Node p) {
        info = x;
        next = p;
    }
    
    Node(String x) {
        this(x, null);
    }
}
