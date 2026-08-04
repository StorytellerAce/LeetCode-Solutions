package Java;

//“Given 2 arrays of Student, find the student with the second highest mark”

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Student[] arr1 = {
            new Student("Alice", 85),
            new Student("Bob", 92),
            new Student("Charlie", 78)
        };

        Student[] arr2 = {
            new Student("David", 88),
            new Student("Eva", 95),
            new Student("Frank", 91)
        };

        List<Student> combined = new ArrayList<>();
        combined.addAll(Arrays.asList(arr1));
        combined.addAll(Arrays.asList(arr2));

        for (int i = 0; i < combined.size() - 1; i ++){
            for (int j = 0; j < combined.size()-i - 1; j++){
                if (combined.get(j).mark < combined.get(j + 1).mark){
                    Student temp = combined.get(j);
                    combined.set(j, combined.get(j + 1));
                    combined.set(j + 1, temp);
                }
            }
        }

        System.out.println(combined);
        System.out.println(combined.get(1).name);

    }
}

public class Student {
    public String name;
    public int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', mark=" + mark + '}';
    }
}