//Q62. Create a package named com.school.students containing a class Student with fields id and name. Write another class in a different package that imports and uses the Student class

package com.school.students;
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

package com.school.main;
import com.school.students.Student;
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
    }
}
