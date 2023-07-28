/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionsolution;

public class Main {

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    static int findMin(int a[], int n) {
        if (n == 1) {
            return a[0];
        }
        if (a[0] > a[n - 1]) {
            a[0] = a[n - 1];
        }
        return findMin(a, n - 1);
    }

    static int findSum(int a[], int n) {
        if (n <= 0) {
            return 0;
        }
        return a[n - 1] + findSum(a, n - 1);
    }

    static int bSearch(int a[], int target, int left, int right) {
        int mid = (left + right) / 2;
        if (right < left) {
            return -1;
        } // not found
        if (target == a[mid]) {
            return mid;
        }
        if (target < a[mid]) {
            return bSearch(a, target, left, mid - 1);
        }
        if (target > a[mid]) {
            return bSearch(a, target, mid + 1, right);
        }
        return -1;
    }

    static boolean isPalindrome(char a[], int n) {
        if (n == 1) {
            return true;
        }
        int m = a.length;
        if (a[m - n] != a[n - 1]) {
            return false;
        } else {
            return isPalindrome(a, n - 1);
        }
    }

    static float addReciprocals(int n) {
        if (n <= 1) {
            return 1;
        }
        return (float) 1 / n + addReciprocals(n - 1);
    }

    public static int GCD(int m, int n) {
        if (n != 0) {
            return GCD(n, m % n);
        } else {
            return m;
        }
    }

    public static int power(int x, int n) {

        // If x^0 return 1
        if (n == 0) {
            return 1;
        }

        // If we need to find of 0^y
        if (x == 0) {
            return 0;
        }

        // For all other cases
        return x * power(x, n - 1);
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Sum 1 to n=8: " + sum(8)); //36

        int[] a = {15, 12, 13, 8, 10, 21};
        System.out.println("Min of arr a = {15, 12, 13, 8, 10, 21}: " + findMin(a, a.length)); //8

        int[] b = {1, 2, 3, 4, 5, 6};
        System.out.println("Sum arr b = {1, 2, 3, 4, 5, 6}: " + findSum(b, b.length)); //21

        char[] c = "madam".toCharArray();
        System.out.println("Palindrome c = madam: " + isPalindrome(c, c.length)); //1

        System.out.println("Search target x=5:" + bSearch(b, 5, 0, b.length)); //4

        int m = 366;
        int n = 60;
        System.out.println("GCD(366,60): " + GCD(m, n));

        int x = 2;
        n = 3;
        System.out.println("power(2,3) " + power(x, n));
        
        
        System.out.println("fib(3): "+ fib(n));

        System.out.println("addReciprocals(3): "+addReciprocals(3)); //1.8333334
    }
}
