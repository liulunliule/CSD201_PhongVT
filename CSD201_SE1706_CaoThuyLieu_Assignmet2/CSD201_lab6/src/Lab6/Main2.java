/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author 840G3
 */
public class Main2 {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("A05", "Tran Quang", 7),
            new Employee("A03", "Nguyen An", 7),
            new Employee("A01", "Truong Phung", 5),
            new Employee("A04", "Pham Thi Lam", 2),
            new Employee("A02", "Do Trung Ton", 5)
        };
        // Sort in ascending order using Quick Sort
        Employee.quickSort(employees, 0, employees.length - 1);

        System.out.println("Ascending Order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sort in descending order using Quick Sort
        Employee.quickSort(employees, 0, employees.length - 1);
        reverseArray(employees);

        System.out.println("\nDescending Order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void reverseArray(Employee[] emp) {
        int start = 0;
        int end = emp.length - 1;
        while (start < end) {
            Employee temp = emp[start];
            emp[start] = emp[end];
            emp[end] = temp;
            start++;
            end--;
        }
    }
}
