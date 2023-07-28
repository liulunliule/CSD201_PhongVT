/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author 840G3
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        Graph g = new Graph();
        int[][] b = {
           //a, b, c, d, e, f, g, h, i
            {0, 1, 1, 1, 0, 0, 0, 0, 0},//a
            {1, 0, 1, 1, 0, 0, 0, 0, 0},//b
            {1, 1, 0, 1, 0, 0, 0, 0, 0},//c
            {1, 1, 1, 0, 0, 1, 0, 0, 0},//d
            {0, 0, 0, 0, 0, 1, 0, 0, 0},//e
            {0, 0, 0, 1, 1, 0, 0, 0, 0},//f
            {0, 0, 0, 0, 0, 0, 0, 1, 1},//g
            {0, 0, 0, 0, 0, 0, 1, 0, 0},//h
            {0, 0, 0, 0, 0, 0, 1, 0, 0} //i
        };
        g.setData(b);

        try {
            String fname = "Lab5_Q1.txt";
            File file = new File(fname);
            if (file.exists()) {
                file.delete();
            }
            FileWriter fw = new FileWriter(file, true);
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
//                    System.out.print(b[i][j]+ ' ')
                    fw.write(b[i][j]+ ' ');
                }
            }
            BufferedReader bufferedReader = null;
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        Lib.viewFile("Lab5_Q1.txt");
    }
}
