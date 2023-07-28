/*
 * Doubly Linked List In Java.
 * The program below shows Java implementation of a doubly-linked list with the 
 * addition and removal of nodes at the end of the list.
 */
package Q3;

class DoublyLinkedList {

    // Initially, heade and tail is set to null
    Node head, tail = null;

    // Add a new node at the beginning of a list
    public void addToHead(int item) {
        //Create a new node  
        Node newNode = new Node(item);
        //if list is empty, head and tail points to newNode  
        if (head == null) {
            head = tail = newNode;
            //head's previous will be null  
            head.previous = null;
            //tail's next will be null  
            tail.next = null;
        } else {
            newNode.next = head;
            head = newNode;
            head.previous = null;
        }
    }

    // Add a new node at the end of the list  
    public void addToTail(int item) {
        //Create a new node  
        Node newNode = new Node(item);
        //if list is empty, head and tail points to newNode  
        if (head == null) {
            head = tail = newNode;
            //head's previous will be null  
            head.previous = null;
            //tail's next will be null  
            tail.next = null;
        } else {
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;
            //newNode->previous set to tail  
            newNode.previous = tail;
            //newNode becomes new tail  
            tail = newNode;
            //tail's next point to null  
            tail.next = null;
        }
    }

    // edited
    void addAfter(Node prev_node, int new_data) {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        if (prev_node.next == null) {
            addToTail(new_data);
        } else {
            /* 2. Allocate the Node & 3. Put in the data*/
            Node new_node = new Node(new_data);
            /* 4. Make next of new Node as next of prev_node */
            new_node.next = prev_node.next;
            prev_node.next.previous = new_node;
            /* 5. make next of prev_node as new_node */
            prev_node.next = new_node;
            new_node.previous = prev_node;
        }
    }

    // Deleting a node from the beginning of a list
    public void deleFirst() {
        Node p = head;
        if (p == null) {
            return;
        }
        //if head in not null and next of head is null, delete the head
        if (p.next == null) {
            p = null;
        } else {
            head = p.next;
            head.previous = null;
        }
    }

    // Delete a node from the end of the list 
    //edited
    public void deleLast() {
        if (this.head != null) {
            //if head in not null and next of head is null, release the head
            if (this.head.next == null) {
                this.head = null;
            } else {
                //Else, traverse to the second last element of the list
                Node temp = new Node();
                temp = this.head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                //Change the next of the second last node to null and delete the last node
                Node lastNode = temp.next;
                temp.next = null;
                lastNode = null;
                tail = temp;
            }
        }
    }

    // Print all the nodes of doubly linked list  
    public void traversal() {
        //Node current will point to head  
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        while (current != null) {
            //Print each node and then go to next.  
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int count() {
        Node p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    Node search(int x) {
        Node p = head;
        while (p != null && p.item != x) {
            p = p.next;
        }
        return p;
    }

    //edited
    void deleteAfter(Node p) {
        Node prev = p, temp = p.next;
        if (temp == null) {
            return;
        }
        if (prev.next.next != null) {
            // Unlink the node from linked list
            prev.next = temp.next;
            temp.next.previous = prev;
        } else {
            deleLast();
        }
    }

    void deleteBefore(Node p) {
        if (p == null || p == head) {
            return;
        }
        Node tmp = null;
        Node n = head;
        while (n != null && n.next != p) {
            tmp = n;
            n = n.next;
        }
        if (n == null) {
            return;
        } else if (n == head) {
            head = p;
        } else {
            tmp.next = p;
        }
    }

    public void deleteNode(int x) {
        // Store head node
        Node temp = head, prev = null;
        // If head node itself holds the key to be deleted
        if (temp != null && temp.item == x) {
            deleFirst();
        }
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.item != x) {
            prev = temp;
            temp = temp.next;
        }
        // If key was not present in linked list
        if (temp == null) {
            return;
        }
        // Unlink the node from linked list
        prev.next = temp.next;
        temp.next.previous = prev;
    }

    void delete(Node p) {
        if (p == null) {
            return;
        }
        // find prev where prev.next = p
        Node f = head, prev = null;
        while (f != null && f != p) {
            prev = f;
            f = f.next;
        }
        if (prev == null) { // remove head
            head = f.next;
            head.previous = null;
            if (head == null) {
                tail = null;
            }
        } else {
            prev.next = p.next;
            if (p == tail) {
                tail = prev;
            } else {
                prev.next.previous = prev;
            }
        }
        p.next = null;
    }

    public void deleteNode2(int i) {
        Node p = head;
        int count = 0;
        while (p != null && count < i) {
            count++;
            p = p.next;
        }
        delete(p);
    }

    // Return a node at position i
    Node get(int i) {
        Node p = head;
        int count = 0;
        while (p != null && count < i) {
            count++;
            p = p.next;
        }
        return p;
    }

    public void sort() {
        int n = count();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Node pi = get(i), pj = get(j);
                if (pi.item > pj.item) {
                    int temp = pi.item;
                    pi.item = pj.item;
                    pj.item = temp;
                }
            }
        }
    }
    public void reverse() {
        int n = count();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            Node pi = get(i), pj = get(j);
            int temp = pi.item;
            pi.item = pj.item;
            pj.item = temp;
        }
    }
    
    public int max() {
        Node p = head;
        int max = head.item;
        while (p != null) {
            if (max < p.item) {
                max = p.item;
            }
            p = p.next;
        }
        return max;
    }
    
    public int min() {
        Node p = head;
        int min = head.item;
        while (p != null) {
            if (min > p.item) {
                min = p.item;
            }
            p = p.next;
        }
        return min;
    }
    public int sum(){
        Node p = head;
        int sum = 0;
        while (p!=null){
            sum +=p.item;
            p = p.next;
        }
        return sum;
    }
    
    public int avg(){
        Node p = head;
        int avg = sum()/count();
        return avg;
    }
    
    public boolean sorted(){
        Node p = head;
        boolean checkSort=true;
        while (p.next!=null){
            if (p.item>p.next.item){
                checkSort=false;
            }
            p=p.next;
        }
        return checkSort;
    }
    
    public void AddToArr() {
        int a[] = new int[count()];
        Node p = head;
        for (int i = 0; i < count(); i++) {
            a[i] = p.item;
            p = p.next;
        }

        System.out.print("Print arr:");
        for (int i : a) {
            System.out.print(i + " " );
        }
        System.out.println("");
    }
    
}
