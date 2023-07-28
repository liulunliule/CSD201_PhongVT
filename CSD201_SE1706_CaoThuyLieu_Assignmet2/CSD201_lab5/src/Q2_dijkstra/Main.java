package Q2_dijkstra;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String [] args) {
        String filename;
        filename="matrix.txt";
        /*  
                    2               - The shortest path from A to  F:
                B ----- D           A -> B -> D -> C -> E -> F (15)
                /     /  \
             4 /   3 /    \ 20
           A  /     /      \  F
              \    /       /
            20 \  /       / 5
                \/       /
                C ----- E
                    1
        */
        Graph g =new Graph();
        try {g.setWeights(filename);} catch (IOException e) {}
        g.displayWeights();
        // Duong di ngan nhat tu dinh 1 den dinh 6
        g.dijkstra(0,5); 
        System.out.println("\n ");
    }
}
