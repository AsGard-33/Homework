package de.ait.homework.homework39;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentDatabaseTest {
    private StudentDatabase database;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        database = new StudentDatabase();
        System.setOut(new PrintStream(outContent));
        outContent.reset();
    }
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
     void testAddStudentSuccessfully() {
        Student student = new Student(1, "Oleksii Nazarov", 37);
        database.addStudent(student);
        assertEquals(true, database.containsStudent(student));
    }

    @Test
     void testAddStudentNoDuplicates() {
        Student student = new Student(1, "Oleksii Nazarov", 37);
        database.addStudent(student);
        database.addStudent(student);
        assertEquals(1, database.findStudentsByName("Oleksii Nazarov").size());
    }

    @Test
     void testRemoveStudentSuccessfully() {
        Student student = new Student(1, "Oleksii Nazarov", 37);
        database.addStudent(student);
        database.removeStudent(student);
        assertFalse(database.containsStudent(student));
    }

    @Test
    void testRemoveStudentDoesNothingIfNotExists() {
        Student student = new Student(1, "Oleksii Nazarov", 37);
        assertFalse(database.containsStudent(student));
        assertDoesNotThrow(() -> database.removeStudent(student));
    }

    @Test
     void testContainsStudentReturnsTrueForExistingStudent() {
        Student student = new Student(1, "Oleksii Nazarov", 37);
        database.addStudent(student);
        assertTrue(database.containsStudent(student));
    }
    @Test
    public void testContainsStudentReturnsFalseForNonExistingStudent() {
        Student student = new Student(1, "Oleksii Nazarov", 37);
        assertFalse(database.containsStudent(student));
    }
    @Test
    public void testGetStudentsInAgeRange() {
        Student student1 = new Student(1, "Kristina Kolobkova", 23);
        Student student2 = new Student(2, "Valerija Morozova", 33);
        Student student3 = new Student(3, "Oleksii Nazarov", 37);
        database.addStudent(student1);
        database.addStudent(student2);
        database.addStudent(student3);
        Set<Student> studentsInAgeRange = database.getStudentsInAgeRange(23, 33);
        assertTrue(studentsInAgeRange.contains(student1));
        assertTrue(studentsInAgeRange.contains(student2));
        assertFalse(studentsInAgeRange.contains(student3));
    }
    @Test
    void testPrintAllStudents() {
        Student student1 = new Student(1, "Kristina Kolobkova", 23);
        Student student2 = new Student(2, "Valerija Morozova", 33);
        database.addStudent(student1);
        database.addStudent(student2);
        database.printAllStudents();
        String expectedOutput = "ID: 1, Name: Kristina Kolobkova, Age: 23" + System.lineSeparator()
                + "ID: 2, Name: Valerija Morozova, Age: 33" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

}
