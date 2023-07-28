/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 84859
 */
public class Main {
    public static void main(String[] args) {
        Node x = new Node(3);
        MyList list = new MyList(x, x);
        list.addToTail(1);
        list.addToTail(4);


        MyList list2 = new MyList();
        list2.addToTail(11);
        list2.addToTail(41);

        
        //1
//        System.out.println(list.isEmpty()); //success
//        list.addToHead(12); //success
        //3
//        list.addAfter(x, 100); //sucess nếu bt dc reference của Node
//        list.traverse();
        //5
//        System.out.println(list.count()); //sucess
//        list.traverse();
        //6
//        System.out.println(list.deleteFromHead());
//        System.out.println();
//        list.traverse();
        //7
//        System.out.println(list.deleteFromLast());
        //8
//        System.out.println(list.deleteAter(x)); //sucess
        //9
//        list.deleteNode(10);
//        list.traverse();
        //10
//        System.out.println(list.search(10));
        //11
//        list.delete(x); //success
//        list.traverse();
        //12
//        list.deleteNode2(2); //success
//        list.traverse();
        //13
//        list.addAfter(x, 100); //sucess nếu bt dc reference của Node
//        list.traverse();
        //14
//        list.sortListASC(); //success
//        list.traverse();
//        System.out.println(list.isSortedASC()); //sucess
        //15
//            list.reverseList();
//            list.traverse();
        //16
        //success
//        int temp[] = list.toArray();
//        for (int i = 0; i < list.count(); i++){
//            System.out.print(temp[i] + " ");
//        }

        //17
//        list2.addToHead(3);
//        list2.traverse();
//        list.traverse();
//        System.out.println("merge");
//        list.merge(list2);
//        list.traverse(); //success
        //18
        list2.addToHead(3);
        list2.traverse();
        list.traverse();
        list.mergeLastOther(list2);
        list2.traverse();
        //19
//        System.out.println(list.max());
        //20
//        System.out.println(list.min());
        //21
//        System.out.println(list.sum());
        //22
//        System.out.println(list.avg());
        //24
//        list.insert(0);
//        list.traverse();
        //25
//        System.out.println(list.isSameContent(list2));

    }
}
