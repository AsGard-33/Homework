package de.ait.homework.homework38HashSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueNamesAppTest {

    public String simulateUserInput(String[] inputs) {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream(String.join(System.lineSeparator(), inputs).getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        UniqueNamesApp.main(new String[0]);
        System.setIn(sysInBackup);
        return out.toString();
    }
    @Test
    public void testUniqueNames() {
        String[] inputs = {"Anna", "Maria", "Anna", "John", "George", "Maria", "stop"};
        String expectedOutput = "Уникальные имена:\r\n" +
                "Anna\r\n" +
                "Maria\r\n" +
                "John\r\n" +
                "George\r\n" +
                "\r\n"; // добавьте символ новой строки для соответствия выводу
        assertEquals(expectedOutput, simulateUserInput(inputs));
    }

    @Test
    public void testEmptyInput() {
        String[] inputs = {"", "", "stop"};
        String expectedOutput = "Уникальные имена:\n";
        assertEquals(expectedOutput, simulateUserInput(inputs));
    }

    @Test
    public void testSingleName() {
        String[] inputs = {"Alice", "stop"};
        String expectedOutput = "Уникальные имена:\n" +
                "Alice\n";
        assertEquals(expectedOutput, simulateUserInput(inputs));
    }

    @Test
    public void testSingleDuplicate() {
        String[] inputs = {"Bob", "Bob", "stop"};
        String expectedOutput = "Уникальные имена:\n" +
                "Bob\n";
        assertEquals(expectedOutput, simulateUserInput(inputs));
    }

    @Test
    public void testIntegerInput() {
        String[] inputs = {"Alice", "123", "Bob", "stop"};
        String expectedOutput = "Ошибка: Введенное значение не является допустимым именем. Пожалуйста, введите действительное имя.\n" +
                "Уникальные имена:\n" +
                "Bob\n" +
                "Alice\n";
        assertEquals(expectedOutput, simulateUserInput(inputs));
    }



}