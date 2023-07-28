/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 84859
 */
public class Node {
    int number;
    Node pre;
    Node next;

    public Node(int number, Node pre, Node next) {
        this.number = number;
        this.pre = pre;
        this.next = next;
    }

    public Node(int number) {
        this.number = number;
    }
    
    
}
