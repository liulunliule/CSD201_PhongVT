/*
 * Circular Linked List In Java.
 * A circular linked list is a list that has its tail or last node connected 
 * back to the head or the first node.
 * The below program implements a circular linked list wherein we have to 
 * manipulate individual nodes of the linked list.
 */
package Q4;

class CircularLinkedList {

    // Initially head and tail pointers point to null  
    public Node head = null;
    public Node tail = null;

    // Add new node at the front of the circular linked list   
    public void addBegin(int data) {
        //Create new node  
        Node newNode = new Node(data);
        //check if list is empty  
        if (head == null) {
            //head and tail point to same node if list is empty  
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            //tail points to new node if list is not empty
            newNode.next = head;
            //New node becomes new tail.  
            head = newNode;
            //tail points back to head  
            tail.next = head;
        }
    }

    // Add new node at the end of the circular linked list   
    public void addEnd(int data) {
        //Create new node  
        Node newNode = new Node(data);
        //check if list is empty  
        if (head == null) {
            //head and tail point to same node if list is empty  
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            //tail points to new node if list is not empty
            tail.next = newNode;
            //New node becomes new tail.  
            tail = newNode;
            //tail points back to head  
            tail.next = head;
        }
    }

    // Inserts a new node after the given prev_node
    public void addAfter(Node prev_node, int new_data) {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        if (prev_node == tail) {
            addEnd(new_data);
        } else {
            Node new_node = new Node(new_data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;
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
            tail.next = head;
        }
    }

    // Deleting element from the end of a list
    public void deleLast() {
        Node p = head;
        if (p == null) {
            return;
        }
        //if head in not null and next of head is null, delete the head
        if (p == tail) {
            head = tail = null;
        } else { //else, traverse to the second last element of the list
            Node temp = new Node();
            temp = p;
            while (temp.next.next != head) {
                temp = temp.next; // temp is the second last node 
            }            //change the next of temp to null and delete the last node
            tail = temp;
            tail.next = head;
        }
    }

    public Node search(int x) {
        Node p = head;
        while (p != null && p.data != x) {
            p = p.next;
        }
        return p;
    }

    // Display the nodes in circular linked list 
    public void displayList() {
        Node current = head;
        if (head == null) {
            System.out.println("The List is empty");
        } else {
            System.out.print("Circular linked list nodes: ");
            do {
                //Print each node of the linked list  
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }

    }

    public int count() {
        Node p = head;
        int count = 0;
        if (head != null) {
            count++;
            while (p.next != head) {
                count++;
                p = p.next;
            }
        }

        return count;
    }

    public void deleteAfter(Node p) {
        Node prev = p, temp = p.next;
        if (prev == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        // Unlink the node from linked list
        if (prev == tail) {
            deleFirst();
        } else {
            prev.next = temp.next;
        }
    }

    public void deleteBefore(Node p) {
        if (p == null || (p == head && head==tail)) {
            return;
        }
        if (p == head) {
            
        } else {
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
    }

    public void deleteNode(int x) {
        // Store head node
        Node temp = head, prev = null;
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == x) {
            tail.next = head.next;
            head = temp.next;
            return;
        }
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != x) {
            prev = temp;
            temp = temp.next;
        }
        // If key was not present in linked list
        if (temp == null) {
            return;
        }
        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void delete(Node p) {
        if (p == null) {
            return;
        }
  
        Node f = head, prev = null;
        while (f != null && f != p) {
            prev = f;
            f = f.next;
        }
        if (prev == null) { // remove head
            if(head.next==null)
                head=null;
            else{
                head=head.next;
                tail.next=head;
            }
        } else {
            prev.next = p.next;
            if (p == tail) {
                tail = prev;
                tail.next = head;
            }
        }
        p.next = null;
    }
    
    public void deleteNode2(int i) {
        Node p = head;
        int count = 0;
        while (p != null && count < i ) {
            count++;
            p = p.next;
        }
        delete(p);
    }
    
    public Node get(int i) {
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
                if (pi.data > pj.data) {
                    int temp = pi.data;
                    pi.data = pj.data;
                    pj.data = temp;
                }
            }
        }
    }
    
    public void reverse() {
        int n = count();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            Node pi = get(i), pj = get(j);
            int temp = pi.data;
            pi.data = pj.data;
            pj.data = temp;
        }
    }

    public int max() {
        int count=0;
        Node p = head;
        int max = head.data;
        while (count < count()) {
            if (max < p.data) {
                max = p.data;
            }
            count++;
            p = p.next;
        }
        return max;
    }
    public int min() {
        int count=0;
        Node p = head;
        int min = head.data;
        while (count < count()) {
            if (min > p.data) {
                min = p.data;
            }
            count++;
            p = p.next;
        }
        return min;
    }
    
    public int sum(){
        Node p = head;
        int sum = 0;
        int count=0;
        while (count < count()){
            sum +=p.data;
            p = p.next;
            count++;
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
        while (p.next!=head){
            if (p.data>p.next.data){
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
            a[i] = p.data;
            p = p.next;
        }

        System.out.print("Print arr:");
        for (int i : a) {
            System.out.print(i + " " );
        }
        System.out.println("");
    }
}
