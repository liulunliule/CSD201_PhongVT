
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 84859
 */
public class MyList1 {

    Node head;
    Node tail;

    public MyList1(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    //1)* void addToHead(int x) - add a node with value x at the head of a list
    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(int x) {
        Node newNode = new Node(x);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    //2)* void addToTail(int x) - add a node with value x at the tail of a list.
    public void addToTail(int x) {
        Node newNode = new Node(x);
        if (tail == null) {
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
           
        }
    }

    //3) void addAfter(Node p, int x) - add a node with value x after the node p.
    public void addAfter(Node p, int x) {
        if (p == null) {
            return;
        }
        Node newNode = new Node(x);
        newNode.next = p.next;
        p.next = newNode;
    }

    //4) void traverse() - traverse from head to tail and dislay info of all nodes in the list
    public void traverse() {
        Node temp = head;
        System.out.println(temp.number + " ");
        temp = temp.next;
        while (temp != null) {
            System.out.println(temp.number + " ");
            temp = temp.next;
            if (temp == head) {
                break;
            }
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
            if (temp == head) {
                break;
            }
        }
        return count;
    }

    //6) int deleteFromHead() - delete the head and return its info.
    public int deleteFromHead() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int value = head.number;

        if (head.next == head) {
            head = null;
        } else {
            value = head.number;
            tail.next = head.next;
            head = head.next;
        }

        return value;
    }

    //7) int deleteFromTail() - delete the tail and return its info.
    public int deleteFromLast() {

        if (tail == null) {
            return -1;
        }
        int value = tail.number;
        if (tail == tail.next) {
            tail = null;
        } else {
            Node p = head;
            while (p.next != tail) {
                p = p.next;
            }
            p.next = tail.next;
            tail = p;
        }
        return value;

    }

    //8) int deleteAter(Node p) - delete the node after the node p and return its info.
    public int deleteAter(Node p) {
        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int value;

        if (head.next == head) {
            value = head.number;
            head = null;
        } else {
            Node temp = head;
            while (temp != p) {
                temp = temp.next;
            }
            value = temp.next.number;
            temp.next = temp.next.next;
        }

        return value;
    }

    //9) void delete Node(int x) - delele the first node whose info is equal to x.
    public void deleteNode(int x) {
        if (head == null) {
            return;
        }

        if (head.number == x) {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
        } else {
            Node prev = head;
            Node curr = head.next;

            while (curr != head) {
                if (curr.number == x) {
                    prev.next = curr.next;
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
        }
    }

    //10)*Node search(int x) - search and return the reference to the first node having info x.
    public Node search(int x) {
        if (head == null) {
            return null;
        }

        if (head.number == x) {
            return head;
        }

        Node temp = head.next;

        while (temp != head) {
            if (temp.number == x) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    //11)void delete(Node p) - delete node p if it exists in the list.
    public void delete(Node p) {
        if (head == null) {
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current != p) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (current == head) {
            head = head.next;
            tail.next = head;
        } else if (current == tail) {
            previous.next = head;
            tail = previous;
        } else {
            previous.next = current.next;
        }

    }

    //12)void delete Node2(int i) - delete an i-th node on the list. Besure that such a node exists
    public void deleteNode2(int i) {
        if (head == null) {
            return;
        }

        if (i == 1) {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
        } else {
            Node prev = head;
            Node curr = head.next;

            int count = 2;

            while (curr != head) {
                if (count == i) {
                    prev.next = curr.next;
                    return;
                }
                prev = curr;
                curr = curr.next;
                count++;
            }
        }
    }

    //13)void addBefore(Node p, int x) - add a node with value x before the node p
    public void addBefore(Node p, int x) {
        if (head == null) {
            return;
        }
        if (head == p) {
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head;
        } else {
            Node prev = head;
            Node curr = head.next;
            while (curr != head) {
                if (curr == p) {
                    Node newNode = new Node(x);
                    prev.next = newNode;
                    newNode.next = curr;
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
        }
    }

    //14)void sort() - sort the list by ascending order of info
    public void sort() {
    if (head == null) {
        return;
    }

    Node current = head;

    do {
        Node min = current;
        Node temp = current.next;

        while (temp != head) {
            if (temp.number < min.number) {
                min = temp;
            }

            temp = temp.next;
        }

        int x = current.number;
        current.number = min.number;
        min.number = x;

        current = current.next;
    } while (current != head);
}

    //15)*Reverse a singly linked list using only one pass through the list.
    public Node reverseList() {
        Node prev = null;
        Node current = head;
        Node next = null;
        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);
        head.next = prev;
        head = prev;
        return head;
    }

    //16)*int [] toArray() - create and return array containing info of all nodes in the list.
    public int[] toArray() {
        int[] arr = new int[count()];
        Node current = head;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = current.number;
            current = current.next;
        }
        return arr;
    }

    //17)Merge two ordered circular linked lists of integers into one ordered list.
    public Node mergeLists(MyList1 list1) {

        if (head == null) {
            return list1.head;
        }
        if (list1 == null) {
            return head;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        Node temp2 = list1.head;
        while (temp2.next != list1.head) {
            temp2 = temp2.next;
        }
        temp.next = list1.head;
        temp2.next = head;
        return head;
    }

    //18)Attach a circular linked list to the end of another circular linked list.
    public Node attachLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node last1 = head1;
        while (last1.next != head1) {
            last1 = last1.next;
        }
        Node last2 = head2;
        while (last2.next != head2) {
            last2 = last2.next;
        }
        last1.next = head2;
        last2.next = head1;
        return head1;
    }

//*****************************************************************************
    //19)int max() - find and return the maximum value in the list
    public int max() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        int max = head.number;
        Node current = head.next;
        while (current != head) {
            if (current.number > max) {
                max = current.number;
            }
            current = current.next;
        }
        return max;
    }

    //20)int min() - find and return the minimum value in the list.
    public int min() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        int min = head.number;
        Node current = head.next;
        while (current != head) {
            if (current.number < min) {
                min = current.number;
            }
            current = current.next;
        }
        return min;
    }

    //21)int sum() - return the sum of all values in the list.
    public int sum() {
        if (head == null) {
            return 0;
        }
        int sum = head.number;
        Node current = head.next;
        while (current != head) {
            sum += current.number;
            current = current.next;
        }
        return sum;
    }

    //22)int avg() - return the average of all values in the list
    public int avg() {
        return sum() / count();
    }

    //23)boolean sorted() - check and return true if the list is sorted, return false if the list is not sorted
    public boolean isSortedDESC() {
        if (head == null) {
            return true;
        }
        Node current = head;
        while (current.next != head) {
            if (current.number < current.next.number) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    public boolean isSortedASC() {
        if (head == null) {
            return true;
        }
        Node current = head;
        while (current.next != head) {
            if (current.number > current.next.number) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    // 24)void insert(int x) - insert node with value x into sorted list so that the new list is sorted
    public void insert(int x) {
        this.addToHead(x);
        this.sort();
    }

    //25)Check whether two circular linked list have the same contents.
    public boolean isSameContent(MyList1 head2) {
        if (head == null && head2 == null) {
            return true;
        }
        if (head == null || head2 == null) {
            return false;
        }
        Node current1 = head.next;
        Node current2 = head2.head.next;
        while(current1 != head && current2 != head2.head) {
            if (current1.number != current2.number) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1 == head && current2 == head2.head;
    }
}
