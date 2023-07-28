/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 84859
 */
public class MyList {
    Node head;
    Node tail;

    public MyList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public MyList() {
    }
    
    //1) void addToHead(int x) - add a node with value x at the head of a list
    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(String x) {
        Node temp = new Node(x);
        if (isEmpty()) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    //2) void addToTail(int x) - add a node with value x at the tail of a list.
    public void addToTail(String x) {
        Node temp = new Node(x);
        if (isEmpty()) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = null;
        }
    }

    //3) void addAfter(Node p, int x) - add a node with value x after the node p.
    public void addAfter(Node p, String x) {
        Node add = new Node(x);
        Node current = head;
        while(current != p){
            current = current.next;
        }
        current = current.next;
        p.next = add;
        add.next = current;
    }

    //4) void traverse() - traverse from head to tail and dislay info of all nodes in the list
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    //5) int count() - count and return number of nodes in the list
    public int count(){
        int count  = 0;
        Node temp = head;
        while(temp != null) {
            ++count;
            temp = temp.next;
        }
        return count;
    }
    //6) int deleteFromHead() - delete the head and return its info.
    public String deleteFromHead(){
        Node temp = head;
        if(temp.next == null){
            temp = null;
        } else {
            head = temp.next;
        }
        return temp.data;
    }
    //7) int deleteFromTail() - delete the tail and return its info.
    public String deleteFromLast(){
        Node temp = head;
        Node lastNode = null;
        if (temp.next == null){
            temp = null;
        } else {
            while(temp.next.next != null) {
                temp = temp.next;
            }
            lastNode = temp.next;
            tail = temp;
            temp.next = null;
        }
        return lastNode.data;
    }

    //8) int deleteAter(Node p) - delete the node after the node p and return its info.
    public String deleteAter(Node p) {
        Node current = head;
        while(current != p){
            current = current.next;
        }
        Node deleteNode = p.next;
        p.next = current.next.next;
        return deleteNode.data;
    }
    //9) void delete Node(int x) - delele the first node whose info is equal to x.
    public void deleteNode(String x){
        Node current= head;
        Node previous = null;
        while (!current.data.equals(x)){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
    }
    //10)Node search(int x) - search and return the reference to the first node having info x.
    public Node search(String x){
        Node temp = head;
        while(!temp.data.equals(x)){
            temp = temp.next;
        }
        return temp;
    }
}
