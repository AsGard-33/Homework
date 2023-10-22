package de.ait.homework.homework39;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        Student kirilMatvienko = new Student(1, "Kiril Matvienko", 25);
        Student kristinaKolobkova = new Student(2, "Kristina Kolobkova", 23);
        Student aleksejNazarov = new Student(3, "Aleksej Nazarov", 37);
        Student valerijaMorozova = new Student(3, "Valerija Morozova", 33);

        database.addStudent(kirilMatvienko);
        database.addStudent(kristinaKolobkova);
        database.addStudent(aleksejNazarov);
        database.addStudent(valerijaMorozova);
        System.out.println("All students:");
        database.printAllStudents();

        database.removeStudent(kirilMatvienko);
        System.out.println("All students after removing one:");
        database.printAllStudents();

        System.out.println("\nSearching for students with the name 'Kristina Kolobkova':");
        Set<Student> studentsByName = database.findStudentsByName("Kristina Kolobkova");
        for (Student student : studentsByName) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }

        System.out.println("\nSearching for students in the age range 23 to 37:");
        Set<Student> studentsInAgeRange = database.getStudentsInAgeRange(23, 37);
        for (Student student : studentsInAgeRange) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
