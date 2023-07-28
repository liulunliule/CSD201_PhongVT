import java.util.LinkedList;

class Student {
    String name;
    int age;
    double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
}

class ChainingHashTable {
    private LinkedList<Student>[] table;
    private static final int TABLE_SIZE = 26;

    public ChainingHashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(String key) {
        char firstLetter = Character.toLowerCase(key.charAt(0));
        return firstLetter - 'a';
    }

    public void insert(Student student) {
        int index = hashFunction(student.name);
        table[index].add(student);
    }

    public void display() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print(i + ": ");
            for (Student student : table[i]) {
                System.out.print("[" + student.name + ", " + student.age + ", " + student.mark + "] -> ");
            }
            System.out.println();
        }
    }
}