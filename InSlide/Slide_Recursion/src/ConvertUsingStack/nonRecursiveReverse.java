/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertUsingStack;

/**
 *
 * @author 840G3
 */
public class nonRecursiveReverse {

    public static void nonRecursiveReverse() throws Exception {
        MyStack t = new MyStack();
        char ch;
        while (true) {
            ch = (char) System.in.read();
            if (ch == '\n') {
                break;
            }
            t.push(ch);
        }
        while (!t.isEmpty()) {
            System.out.print(t.pop());
        }

    }
}
