/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 84859
 */
public class Main1 {
    public static void main(String[] args) {
        Node x = new Node(3);
        MyList1 list = new MyList1(x, x);
        list.addToTail(1);
        list.addToTail(4);

        Node x2 = new Node(4);
        MyList1 list2 = new MyList1(x2,x2);
        list2.addToTail(11);
        list2.addToTail(41);

        //1
//        System.out.println(list.isEmpty()); //success
//        list.addToHead(12); //success
//        list.traverse();
        //3
//        list.addAfter(x, 100); //sucess nếu bt dc reference của Node
//        list.traverse();
        //5
//        System.out.println(list.count()); //sucess
//        list.traverse();
        //6
//        list.addToHead(10);
//        System.out.println(list.deleteFromHead());
//        System.out.println();
//        list.traverse();
        //7
//        list.addToTail(50);
//        System.out.println(list.deleteFromLast()); //success
//        System.out.println("");
//        list.traverse();
        //8
//        System.out.println(list.deleteAter(x)); //sucess
        //9
//        list.addAfter(x, 10); //nếu ko có xuất hiện thì bị lỗi null pointer
//        list.deleteNode(10);
//        list.traverse();
        //10
//        list.addAfter(x, 10); //nếu ko có xuất hiện thì bị lỗi null pointer
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
//        list.sort(); //success
//        list.traverse();
//        System.out.println(list.isSortedASC()); 
        //15
//            list.reverseList();
//            list.traverse();
        //16
//        success
//        int temp[] = list.toArray();
//        for (int i = 0; i < list.count(); i++){
//            System.out.print(temp[i] + " ");
//        }

        //17
//        list.mergeLists(list2); //success nếu head, tial khác null
//        list.traverse(); //success
        //19
//        System.out.println(list.max()); //success
        //20
//        System.out.println(list.min()); //success
        //21
//        System.out.println(list.sum()); //success
        //22
//        System.out.println(list.avg()); //success
        //24
//        list.insert(0);   //success
//        list.traverse();
        //25
//        System.out.println(list.isSameContent(list2)); //success
    }
}
