/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q01;

import java.io.File;
import java.io.RandomAccessFile;

/**
 *
 * @author 840G3
 */
public class Lib {
//Read and display on the screen the content of  the file fname

    static void viewFile(String fname) throws Exception {
        File g = new File(fname);
        if (!g.exists()) {
            System.out.println(" The file " + fname + " does not exist!");
            return;
        }
        RandomAccessFile f;
        String s;
        f = new RandomAccessFile(fname, "r");
        System.out.println(" Content of the file " + fname + ":");
        while ((s = f.readLine()) != null) {
            System.out.println("  " + s);
        }
        f.close();
    }
}
