/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 84859
 */
public class main {
    public static void main(String[] args) {
         Node x = new Node("Nguyễn");
        MyList list = new MyList(x, x);
        list.addToTail("Lê");
        list.addToTail("Ân");


        MyList list2 = new MyList();
        list2.addToTail("Trần");
        list2.addToTail("Thị");

        //1
//        System.out.println(list.isEmpty()); //success
//        list.addToHead("Huỳnh"); //success
//        list.traverse();
        //3
//        list.addAfter(x, "Thiên"); //sucess nếu bt dc reference của Node
//        list.traverse();
        //5
//        System.out.println(list.count()); //sucess
//        list.traverse();
        //6
//        System.out.println(list.deleteFromHead());
//        System.out.println();
//        list.traverse();
        //7
//        System.out.println(list.deleteFromLast()); //success
//        System.out.println("");
//        list.traverse();
        //8
//        System.out.println(list.deleteAter(x)); //sucess
//        System.out.println("");
//        list.traverse();
        //9
//        list.deleteNode("Lê"); //success
//        list.traverse();
        //10
//        System.out.println(list.search("Ân")); //success
    }
}
