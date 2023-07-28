/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecToBin;

/**
 *
 * @author 840G3
 */
public class Dec_Bin {
    public static void DecToBin(int n)
   { int q = n/2;	// One step
     int  r = n%2;	// One step
     if (q > 0)
       {DecToBin(q); // smaller problem
       }
     System.out.print(r); // after all recursive calls have been
                                                  // made last remainder printed first
   }

}
