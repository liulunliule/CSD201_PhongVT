/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.ArrayList;

public class BSTree {

    Node root;

    public BSTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void visit(Node p) {
        if (p == null) {
            return;
        }
        System.out.print(p.info + "  ");
    }

    //return a Node which has key = given key in the tree p
    public Node search(Node p, int key) {
        if (p == null) {
            return null;
        }
        if (p.info == key) {
            return p;
        } else if (p.info > key) {
            return search(p.left, key);
        } else {
            return search(p.right, key);
        }
    }

    //insert a key x to the tree
    public void insert(int x) {
        Node p = new Node(x);
        Node f = null, q = root;
        while (q != null) {
            if (q.info == x) {
                System.out.println("Key cannot be duplicated...");
                return;
            }
            if (q.info < x) {
                f = q;
                q = q.right;
            } else {
                f = q;
                q = q.left;
            }
        }
        if (f == null) {
            root = p;
        } else if (p.info > f.info) {
            f.right = p;
        } else {
            f.left = p;
        }
    }

    //preorder a tree
    public void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    //postorder a tree
    public void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    //inorder a tree
    public void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    //bft
    public void BFT(Node p) {
        if (p == null) {
            return;
        }
        MyQueue m = new MyQueue();
        m.enqueue(p);
        while (!m.isEmpty()) {
            Node q = (Node) m.dequeue();
            visit(q);
            if (q.left != null) {
                m.enqueue(q.left);
            }
            if (q.right != null) {
                m.enqueue(q.right);
            }
        }
    }

    //height of tree
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

    int size() {
        return size(root);
    }

    int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return (size(node.left) + 1 + size(node.right));
        }
    }

//    public int count() {
//        Node p = new Node();
//        p = root;
//        int count = 0;
//        if (p == null) {
//            return count;
//        }
//        MyQueue m = new MyQueue();
//        m.enqueue(p);
//        while (!m.isEmpty()) {
//            Node q = (Node) m.dequeue();
////            visit(q);
//            count++;
//            if (q.left != null) {
//                m.enqueue(q.left);
//            }
//            if (q.right != null) {
//                m.enqueue(q.right);
//            }
//        }
//        return count;
//    }

    /*Part 2___________________________________________________________________*/
    //delete a node on BST
    public void deleteByCopy(int x) {
        Node p = search(root, x);
        if (p == null) {
            System.out.println("Key " + x + " does not exists, deletion failed");
            return;
        }
        //find f is father of p
        Node f = null, q = root;
        while (q != p) {
            f = q;
            if (q.info > p.info) {
                q = q.left;
            } else {
                q = q.right;
            }
        }
        //1.p has no child
        if (p.left == null && p.right == null) {
            if (f == null) {
                root = null;
            } else if (f.left == p) {
                f.left = null;
            } else {
                f.right = null;
            }
        } //2.p has left child only
        else if (p.left != null && p.right == null) {
            if (f == null) {
                root = p.left;
            } else if (f.left == p) {
                f.left = p.left;
            } else {
                f.right = p.left;
            }
        } //3.p has right child only
        else if (p.left == null && p.right != null) {
            if (f == null) {
                root = p.right;
            } else if (f.left == p) {
                f.left = p.right;
            } else {
                f.right = p.right;
            }
        } //4.p has both child
        else if (p.left != null && p.right != null) {
            //tim q la node lon nhat ben con trai cua p -> q la con phai nhat
            //cua con trai cua p
            q = p.left;
            f = null;
            while (q.right != null) {
                f = q;
                q = q.right;
            }
            p.info = q.info;
            //delete q
            if (f == null) {
                p.left = q.left;
            } else {
                f.right = q.left;
            }
        }
    }

    public void deleteByMerging(int x) {
        Node p = search(root, x);
        if (p == null) {
            System.out.println("Key " + x + " does not exists, deletion failed");
            return;
        }
        //find f is father of p
        Node f = null, q = root;
        while (q != p) {
            f = q;
            if (q.info > p.info) {
                q = q.left;
            } else {
                q = q.right;
            }
        }
        //1.p has no child
        if (p.left == null && p.right == null) {
            if (f == null) {
                root = null;
            } else if (f.left == p) {
                f.left = null;
            } else {
                f.right = null;
            }
        } //2.p has left child only
        else if (p.left != null && p.right == null) {
            if (f == null) {
                root = p.left;
            } else if (f.left == p) {
                f.left = p.left;
            } else {
                f.right = p.left;
            }
        } //3.p has right child only
        else if (p.left == null && p.right != null) {
            if (f == null) {
                root = p.right;
            } else if (f.left == p) {
                f.left = p.right;
            } else {
                f.right = p.right;
            }
        } //4.p has both child
        else if (p.left != null && p.right != null) {
            //tim q la node lon nhat ben con trai cua p -> q la con phai nhat
            //cua con trai cua p
            q = p.left;
            Node t = null;
            while (q.right != null) {
                t = q;
                q = q.right;
            }
            Node rp = p.right;
            q.right = rp;
            if (f == null) {
                root = p.left;
            } else if (f.left == p) {
                f.left = p.left;
            } else {
                f.right = p.left;
            }
        }
    }

    public int minValue(Node node) {
        Node current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.info);
    }

    public int maxValue(Node node) {
        // loop to find the rightmost node of BST
        Node current = node;
        while (current.right != null) {
            current = current.right;
        }

        return current.info;
    }

    public int Sum() {
        Node p = new Node();
        p = root;
        int sum = 0;
//        if (p == null) {
//            return 0;
//        }
        MyQueue m = new MyQueue();
        m.enqueue(p);
        while (!m.isEmpty()) {
            Node q = (Node) m.dequeue();
//            visit(q);
            sum += sum;
            if (q.left != null) {
                m.enqueue(q.left);
            }
            if (q.right != null) {
                m.enqueue(q.right);
            }
        }
        return sum;
    }

    public int avg() {
        int avg = Sum() / size();
        return avg;
    }

    static int maxLen;
    static int maxSum;

    static void sumOfLongRootToLeafPath(Node root, int sum,
            int len) {

        // if true, then we have traversed a
        // root to leaf path
        if (root == null) {

            // update maximum length and maximum sum
            // according to the given conditions
            if (maxLen < len) {
                maxLen = len;
                maxSum = sum;
            } else if (maxLen == len && maxSum < sum) {
                maxSum = sum;
            }
            return;
        }

        // recur for left subtree
        sumOfLongRootToLeafPath(root.left, sum + root.info,
                len + 1);

        sumOfLongRootToLeafPath(root.right, sum + root.info,
                len + 1);

    }

    //balancing a BST
    //inorder a BST and save all items to an array
    public void buildArray(ArrayList a, Node p) {
        if (p == null) {
            return;
        }
        buildArray(a, p.left);
        a.add(p);
        buildArray(a, p.right);
    }

    //insert all items from an array to a new BST
    public void balance(ArrayList a, int f, int l) {
        if (f > l) {
            return;
        }
        int m = (f + l) / 2;
        Node p = (Node) a.get(m);
        insert(p.info);
        balance(a, f, m - 1);
        balance(a, m + 1, l);
    }

    public void balance(Node p) {
        ArrayList a = new ArrayList();
        buildArray(a, p);
        int l = a.size(), f = 0;
        //create a new tree and insert all items from a to the BST
        BSTree t = new BSTree();
        t.balance(a, f, l - 1);
        root = t.root;
    }

    /*Part 3___________________________________________________________________*/
    public Node rotateLeft(Node p) {
        if (p.right == null) {
            return p;
        }
        Node p1 = p.right;
        p.right = p1.left;
        p1.left = p;
        return p1;
    }

    public Node rotateRight(Node p) {
        if (p.left == null) {
            return p;
        }
        Node p1 = p.left;
        p.left = p1.right;
        p1.right = p;
        return p1;
    }

//    int mystery(Node x) {
//        if (x == null) {
//            return 0;
//        } else {
//            return max(mystery(x.left), mystery(x.right));
//        }
//    }

    int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            /* use the larger one */
            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
        }
    }
    
    
    boolean isHeap(Node tree)
    {
 
        boolean result = true;
 
        // check if child is greater than parent
 
        if (tree != null
                && (tree.left != null
                    && tree.left.info > tree.info)
            || (tree.right != null
                && tree.right.info > tree.info)) {
            return false;
        }
 
        // check if left subtree has children but right is
        // null
 
        if (tree.left != null) {
            if ((tree.left.left != null
                 || tree.left.right != null)
                && tree.right == null) {
                return false;
            }
        }
 
        // check if right subtree has children and left is
        // null
 
        if (tree.right != null) {
            if ((tree.right.left != null
                 || tree.right.right != null)
                && tree.left == null) {
                return false;
            }
        }
 
        // check if right subtre has children but not left
        // subtree
 
        if (tree.left != null) {
            if (tree.left.left == null
                && tree.left.right == null) {
                if (tree.right != null) {
                    if (tree.right.left != null
                        || tree.right.right != null) {
                        return false;
                    }
                }
            }
        }
 
        // recursively call for left and right subtree
 
        if (tree != null && tree.left != null) {
            boolean l = isHeap(tree.left);
            result = result & l;
        }
        if (tree != null && tree.right != null) {
            boolean r = isHeap(tree.right);
            result = result & r;
        }
 
        return result;
    }
}
