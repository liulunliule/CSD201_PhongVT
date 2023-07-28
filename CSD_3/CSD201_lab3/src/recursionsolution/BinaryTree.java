/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursionsolution;

/**
 *
 * @author 840G3
 */
// A recursive Java program to calculate the size of the
// tree

/* Class containing left and right child of current
node and key value*/
class Node {
    
    int data;
    Node left, right;

    public Node() {
    }
    
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

/* Class to find size of Binary Tree */
class BinaryTree {
    
    Node root;

    // Function to return the size of binary tree
    int size() {
        return size(root);
    }

    /* computes number of nodes in tree */
    int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return (size(node.left) + 1 + size(node.right));
        }
    }
    
    int height(Node p) {
        if (p == null) {
            return 0;
        } else {
            int lDepth = height(p.left);//compute the depth of each subtree
            int rDepth = height(p.right);
            if (lDepth > rDepth) {
                return (lDepth + 1);//use the larger one
            } else {
                return (rDepth + 1);
            }
        }
    }
    
    public static void main(String args[]) {
        /* creating a binary tree and entering the nodes */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("The size of binary tree is: "
                + tree.size());
        Node p = tree.root;
        System.out.println("The height of Node p(root) binary tree is: " 
                + tree.height(p));
    }
}
