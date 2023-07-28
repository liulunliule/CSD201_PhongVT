package csd_lab1_1;

public class MyList {

    Node head, tail;

    public MyList() {
        head = tail = null;
    }

    //return true if Mylist is empty otherwise return false
    public boolean isEmpty() {
        return head == null;
    }

    //Inserting a new node at the beginning of a list
    public void addFirst(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    //Inserting a new node at the end of a list
    public void addLast(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    //  add a node with value x after the node p.
    public void addAfter(Node p, int x) {
        Node q = head;
        Node N = new Node(x);

        while (q != null) {
            if (q.info == p.info) {
                N.next = q.next;
                q.next = N;
            }
            q = q.next;
        }

    }
    //traverse from head to tail and dislay info of all nodes in the list.

    public void traversal() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info + "  ");
            p = p.next;
        }
        System.out.println("");
    }

    //count and return number of nodes in the list.
    public int count() {
        int count = 0;
        Node p = head;
        while (p != null) {
            p = p.next;
            count++;
        }
        System.out.println(count);
        return count;
    }

    //6. delete the head and return its info.
    public int deleteFromHead() {
        Node p = head;
        if (p == null) {
            System.out.println("Empty list");
        }
        //if head in not null and next of head is null, delete the head
        if (p.next == null) {
            p = null;
        } else {
            head = p.next;
        }
        return p.info;
    }

    //7. delete the tail and return its info
    public int deleteFromTail() {
        Node p = head;
        if (p == null) {
            System.out.println("Empty list");
        }
        //if head in not null and next of head is null, delete the head
        if (p.next == null) {
            p = null;
        } else { //else, traverse to the second last element of the list
            Node temp = new Node();
            temp = p;
            while (temp.next.next != null) {
                temp = temp.next; // temp is the second last node 
            }            //change the next of temp to null and delete the last node
            Node lastNode = temp.next;
            temp.next = null;
            lastNode = null;
        }
        return p.info;
    }

    //8. delete the node after the node p and return its info.
    public int deleteAfter(Node p) {
        Node q = head;
        if (q == null) {
            System.out.println("Empty list");
        }
        while (q.next != null) {
            if (q.info == p.info) {
                if (q.next.next != null) {
                    q.next = q.next.next;
                } else {
                    q.next = null;
                    q = tail;
                }
            }
            q = q.next;
        }
        return 0;
    }

    //9.  delele the first node whose info is equal to x.
    public void deleteNode(int x) {
        int count = 1;
        Node p = head;
        while (p.next != null) {
            if (p.next.info == x && count == 1) {
                p.next = p.next.next;
                count++;
            }
            p = p.next;

        }
    }

    //10. search and return the reference to the first node having info x.
    public Node search(int x) {
        int index = 0;
        int indexX = 0;

        Node q = head;
        Node p = new Node(x);
        while (q != null) {
            if (q.info == x) {
                p = q;
                indexX = index;
            }
            index++;
            q = q.next;
        }
        if (indexX == 0) {
            System.out.println("don't have any " + x);
        } else {
            System.out.println(p.info + " --> " + p.next.info + "\n Index of " + x + " is: " + indexX);
        }
        return p;

    }

    //11. delete node p if it exists in the list.
    void delete(Node p) {
        int count = 1;
        Node q = head;
        while (q.next != null) {
            if (q.next.info == p.info && count == 1) {
                q.next = q.next.next;
                count++;
            }
            q = q.next;
        }
    }

    //12. delete an i-th node on the list. Besure that such a node exists.
    void deleteNode2(int i) {
        int count = 1;
        Node p = head;
        if (i == 1) {
            deleteFromHead();
        } else if (i == count()) {
            deleteFromTail();
        } else {
            while (p.next != null) {
                if (count == i - 1) {
                    p.next = p.next.next;
                }
                count++;
                p = p.next;

            }
        }
    }

    //13. add a node with value x before the node p
    void addBefore(Node p, int x) {
        Node q = head;
        Node N = new Node(x);

        while (q != null) {
            if (q.next.info == p.info) {
                N.next = q.next;
                q.next = N;
            }
            q = q.next;
        }
    }
}
