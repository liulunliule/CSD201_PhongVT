package DoublyLinkedLists;


class Node {

    int info;
    Node prev, next;

    Node() {
    }

    Node(int x, Node p, Node q) {
        info = x;
        prev = p;
        next = q;
    }
}


