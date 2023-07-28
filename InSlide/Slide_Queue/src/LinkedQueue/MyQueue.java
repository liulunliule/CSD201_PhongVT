/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedQueue;

/**
 *
 * @author 840G3
 */
class MyQueue {

    protected Node head, tail;

    public MyQueue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return (head.info);
    }

    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        Object x = head.info;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return (x);
    }

    void enqueue(Object x) {
        if (isEmpty()) {
            head = tail = new Node(x);
        } else {
            tail.next = new Node(x);
            tail = tail.next;
        }
    }
}
