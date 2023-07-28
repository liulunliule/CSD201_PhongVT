
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

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

    public void addToHead(int x) {
        Node temp = new Node(x);
        if (isEmpty()) {
            head = tail = temp;
        } else {
            head.pre = temp;
            temp.next = head;
            head = temp;
        }
    }

    //2) void addToTail(int x) - add a node with value x at the tail of a list.
    public void addToTail(int x) {
        Node temp = new Node(x);
        if (isEmpty()) {
            head = tail = temp;
        } else {
            temp.pre = tail;
            tail.next = temp;
            tail = temp;
            tail.next = null;
        }
    }

    //3) void addAfter(Node p, int x) - add a node with value x after the node p.
    public void addAfter(Node p, int x) {
        Node newNode = new Node(x);
        newNode.next = p.next;
        p.next.pre = newNode;
        p.next = newNode;
        newNode.pre = p;
    }

    //4) void traverse() - traverse from head to tail and dislay info of all nodes in the list
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.number + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    //5) int count() - count and return number of nodes in the list
    public int count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            ++count;
            temp = temp.next;
        }
        return count;
    }

    //6) int deleteFromHead() - delete the head and return its info.
    public int deleteFromHead() {
        Node temp = head;
        if (temp.next == null) {
            temp = null;
        } else {
            head = temp.next;
            head.pre = null;
            temp.next = null;
        }
        return temp.number;
    }

    //7) int deleteFromTail() - delete the tail and return its info.
    public int deleteFromLast() {
        if (tail == null) {
            return -404;
        }
        int info = tail.number;
        if (tail.pre == null) {
            tail = null;
        } else {
            tail = tail.pre;
            tail.next = null;
        }
        return info;
    }

    //8) int deleteAter(Node p) - delete the node after the node p and return its info.
    public int deleteAter(Node p) {
        Node temp = p.next;
        int x = temp.number;
        p.next = temp.next;
        temp.next.pre = p;
        temp = null;
        return x;
    }

    //9) void delete Node(int x) - delele the first node whose info is equal to x.
    public void deleteNode(int x) {
        Node current = head;
        if (current == null) {
            return;
        }
        while (current.number != x) {
            current = current.next;
        }
        if (current.number == x) {
            current.pre.next = current.next;
        }
    }

    //10)Node search(int x) - search and return the reference to the first node having info x.
    public Node search(int x) {
        Node temp = head;
        while (temp != null && temp.number != x) {
            temp = temp.next;
        }
        return temp;
    }

    //11)void delete(Node p) - delete node p if it exists in the list.
    public void delete(Node p) {
        if (p == null) {
            return;
        }
        if (p.pre != null) {
            p.pre.next = p.next;
        } else {
            head = p.next;
        }
        if (p.next != null) {
            p.next.pre = p.pre;
        } else {
            tail = p.pre;
        }

    }

    //12)void delete Node2(int i) - delete an i-th node on the list. Besure that such a node exists
    public void deleteNode2(int i) {
        if (count() < i) {
            return;
        } else {
            Node current = head;
            for (int j = 0; j < (i - 1); j++) {
                current = current.next;
            }
            if (current.pre != null) {
                current.pre.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.pre = current.pre;
            } else {
                tail = current.pre;
            }
        }
    }

    //13)void addBefore(Node p, int x) - add a node with value x before the node p
    public void addBefore(Node p, int x) {
        Node newNode = new Node(x);
        if (p == null) {
            return;
        }
        newNode.next = p;
        newNode.pre = p.pre;
        if (p.pre != null) {
            p.pre.next = newNode;
        } else {
            head = newNode;
        }
        p.pre = newNode;
    }

    //14)void sort() - sort the list by ascending order of info
    public void sortListASC() {
        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.number > index.number) {
                        temp = current.number;
                        current.number = index.number;
                        index.number = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    //15)Reverse a doubly linked list using only one pass through the list.
    public void reverseList() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.pre;
            current.pre = current.next;
            current.next = temp;
            current = current.pre;
        }
        if (temp != null) {
            head = temp.pre;
        }
    }

    //16)int [] toArray() - create and return array containing info of all nodes in the list.
    public int[] toArray() {
        Node current = head;
        int array[] = new int[this.count()];
        int i = 0;
        while (current != null) {
            array[i] = current.number;
            i++;
            current = current.next;
        }
        return array;
    }

    //17)Merge two ordered singly linked lists of integers into one ordered list.
    public void merge(MyList x) {
        this.tail.next = x.head;
        x.head.pre = this.tail;
        
    }

    //18)Attach a singly linked list to the end of another singly linked list.
    public void mergeLastOther(MyList x) {
        x.tail.next = this.head;
        this.head.pre = x.tail;
    }

    //19)int max() - find and return the maximum value in the list
    public int max() {
        Node current = head;
        int result = 0;
        while (current != null) {
            if (result < current.number) {
                result = current.number;
            }
            current = current.next;
        }
        return result;
    }

    //20)int min() - find and return the minimum value in the list.
    public int min() {
        Node current = head;
        int result = current.number;
        while (current != null) {
            if (result > current.number) {
                result = current.number;
            }
            current = current.next;
        }
        return result;
    }

    //21)int sum() - return the sum of all values in the list.
    public int sum() {
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.number;
            current = current.next;
        }
        return sum;
    }

    //22)int avg() - return the average of all values in the list
    public int avg() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return sum() / count;
    }

    //23)boolean sorted() - check and return true if the list is sorted, return false if the list is not sorted
    public boolean isSortedDESC() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.number > current.next.number) {
                current = current.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isSortedASC() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.number < current.next.number) {
                current = current.next;
            } else {
                return false;
            }
        }
        return true;
    }

    // 24)void insert(int x) - insert node with value x into sorted list so that the new list is sorted
    public void insert(int x) {
        this.addToHead(x);
        this.sortListASC();
    }

    //25)Check whether two doubly linked list have the same contents.
    public boolean isSameContent(MyList x) {
        Node current = head;
        Node currentX = x.head;
        while (current != null && currentX != null) {
            if (current.number != currentX.number) {
                return false;
            }
            current = current.next;
            currentX = currentX.next;
        }
        return current == null && currentX == null;
    }
}
