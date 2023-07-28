/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author 840G3
 */
public class bruteForce {
    // a: text, p: sample string to be searched
    int bruteForceSearch(char [] a, char [] p) { 
        int i,j,m,n;
        n=a.length; m=p.length;
        i=0;j=0;
        while (i<n && j<m) {
            if(a[i]==p[j]) {
                i++;j++;
            } else {
                i=i-j+1;
                j=0;
            }
        }
        //j reaches m-1, it means that p is found in a
        if(j==m) return(i-m);
        else return(-1);
    }
    
    // a: text, p: sample string to be searched
    void testSearching(String a, String p) { 
        char [] a1 = a.toCharArray();
        char [] p1 = p.toCharArray();
        int k;
        k = bruteForceSearch(a1,p1);
        System.out.println(a);
        System.out.println(p);
        if(k==-1)
            System.out.println(p + " is not found in " + a);
        else
            System.out.println(p + " is found at index " + k + " in " + a);
    }
}
