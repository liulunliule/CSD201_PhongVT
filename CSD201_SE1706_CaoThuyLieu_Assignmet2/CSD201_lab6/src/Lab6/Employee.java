/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author 840G3
 */
public class Employee implements Comparable<Employee> {

    private String id;
    private String name;
    private int level;

    public Employee(String id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    @Override
    public int compareTo(Employee other) {
        return this.id.compareTo(other.id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Level: " + level;
    }
    
    //Q2

    public static void quickSort(Employee[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(Employee[] arr, int low, int high) {
        String pivot = arr[high].getId();
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j].getId().compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(Employee[] arr, int i, int j) {
        Employee temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
