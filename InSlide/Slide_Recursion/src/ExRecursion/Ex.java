/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExRecursion;

/**
 *
 * @author 840G3
 */
public class Ex {

    static long fibo(long n) {
        if (n < 2) {
            return n;
        } else {
            return (fibo(n - 1) + fibo(n - 2));
        }
    }

}
