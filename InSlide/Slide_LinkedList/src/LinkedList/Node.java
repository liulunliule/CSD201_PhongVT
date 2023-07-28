package LinkedList;


import java.util.*;

class Node {

    String name;
    int age;

    Node() {
    }

    Node(String name1, int age1) {
        name = name1;
        age = age1;
    }

    void set(String name1, int age1) {
        name = name1;
        age = age1;
    }

    public String toString() {
        String s = name + "  " + age;
        return (s);
    }
}


