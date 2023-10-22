package de.ait.homework.homework39;

import java.util.HashSet;
import java.util.Set;

public class StudentDatabase {
    public boolean containsStudent;
    private HashSet<Student>students;

    public StudentDatabase() {
        this.students = new HashSet<>();
    }
    void addStudent(Student student){
        students.add(student);
    }

    void removeStudent(Student student) {
        students.remove(student);
    }

     boolean containsStudent(Student student) {
        return students.contains(student);
    }
     void printAllStudents() {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
    public Set<Student> findStudentsByName(String name) {
        Set<Student> result = new HashSet<>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public Set<Student> getStudentsInAgeRange(int startAge, int endAge) {
        Set<Student> result = new HashSet<>();
        for (Student student : students) {
            if (student.getAge() >= startAge && student.getAge() <= endAge) {
                result.add(student);
            }
        }
        return result;
    }
}
