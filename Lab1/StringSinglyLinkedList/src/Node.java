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
    String data;
    Node next;

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(String data) {
        this.data = data;
    }
    
}
