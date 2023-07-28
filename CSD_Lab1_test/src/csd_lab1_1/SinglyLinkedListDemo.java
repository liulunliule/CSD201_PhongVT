/*
 *  Step 3: Build a class with main() method to use existing classes 
 *  to complete the program.
 */
package csd_lab1_1;

public class SinglyLinkedListDemo {

    public void Main(String[] args) {        
        MyList mylist = new MyList();        //Inserting a new 3node at the beginning of a list.
        
        mylist.addAfter((new Node(30)), 20);
        
        mylist.addFirst(40);//40
        mylist.addFirst(50);//50 40 
        mylist.addFirst(60);//60 50 40
        //Display the nodes in singly linked list 
        mylist.traversal();//60 50 40
        //Inserting a new node at the end of a list
        mylist.addLast(30);//60 50 40 30
        mylist.addLast(20);//60 50 40 30 20
        mylist.addLast(10);//60 50 40 30 20 10
        //Display the nodes in singly linked list 
        mylist.traversal();//60 50 40 30 20 10
        //Deleting a node from the beginning of a list
        mylist.deleteFromHead();
        mylist.deleteFromHead();
//        mylist.deleFirst();//50 40 30 20 10
//        mylist.deleFirst();//40 30 20 10
        //Display the nodes in singly linked list 
        mylist.traversal();//40 30 20 10
        //Deleting element from the end of a list
        mylist.deleteFromTail();//40 30 20
        mylist.deleteFromTail();//40 30
        //Display the nodes in singly linked list 
        mylist.traversal();//40 30
        
        mylist.addFirst(50);//50 40 30
        mylist.addFirst(40);//40 50 40 30
        mylist.addFirst(60);//60 40 50 40 30
        mylist.traversal();
        mylist.addAfter((new Node(30)), 20);//60  40  50  40  30  20 
        mylist.traversal();//60  40  50  40  30  20 
        mylist.deleteNode(40);//60  50  40  30  20 
        mylist.traversal();//60  50  40  30  20 
        mylist.deleteFromHead();//50  40  30  20  
        mylist.traversal();//50  40  30  20  
        mylist.delete(new Node(30));//50  40  20 
        mylist.traversal();//50  40  20 
        mylist.addFirst(70);//70 50  40  20
        mylist.addFirst(30);//30 70  50  40  20
        mylist.addFirst(60);//60 30  70  50  40  20
        mylist.traversal();
        mylist.deleteAfter(new Node(40));
        mylist.traversal();//
        mylist.count();
//        mylist.search(30);
//        mylist.deleteNode2(3);
//        mylist.delete(new Node(40));
        mylist.traversal();//50  30  20
        
    }
}
