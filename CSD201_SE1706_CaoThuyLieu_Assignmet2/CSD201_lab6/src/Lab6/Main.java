/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

import java.util.Arrays;

/**
 *
 * @author 840G3
 */
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("A05", "Tran Quang", 7),
            new Employee("A03", "Nguyen An", 7),
            new Employee("A01", "Truong Phung", 5),
            new Employee("A04", "Pham Thi Lam", 2),
            new Employee("A02", "Do Trung Ton", 5)
        };

        // Sort in ascending order by ID using different algorithms
        Arrays.sort(employees); // Uses Merge Sort by default (advanced algorithm)

        System.out.println("Ascending Order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sort in descending order by ID using different algorithms
        Arrays.sort(employees, (e1, e2) -> e2.compareTo(e1)); // Reverse order comparator

        System.out.println("\nDescending Order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
