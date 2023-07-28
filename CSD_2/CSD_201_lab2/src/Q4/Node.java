package Q4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 840G3
 */
public class Node {

    char info;
    Node next;

    Node(char x, Node p) {
        info = x;
        next = p;
    }
    
    Node(char x) {
        this(x, null);
    }
}
