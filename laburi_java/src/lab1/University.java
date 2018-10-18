package lab1;

import java.util.*;

public class University {
    private String name;
    private List<Student> students;
    University(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getStudentsCount() {
        return students.size();
    }

    public float getStudentsAverage() {
        return getStudentsMarkSum() * 1.0f / getStudentsCount();
    }

    private int getStudentsMarkSum() {
        int sum = 0;
        for (Student student : students) {
            sum += student.getMark();
        }
        return sum;
    }
}
