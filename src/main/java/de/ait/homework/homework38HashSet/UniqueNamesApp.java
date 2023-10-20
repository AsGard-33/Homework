package de.ait.homework.homework38HashSet;

import java.util.HashSet;
import java.util.Scanner;
/*Задание: Программа для сбора и вывода уникальных имен

Цель: Написать программу на Java, которая будет считывать строки (предполагаемые имена) с консоли,
сохранять только уникальные имена и затем выводить их. Для хранения имен следует использовать HashSet
 из-за его способности обеспечивать уникальность и предотвращать дублирование.

Инструкции:
1.Создание основного класса программы:
Создайте новый класс Java, например, UniqueNamesApp.
В этом классе определите метод main.
2.Считывание ввода пользователя:
Внутри метода main, используйте класс Scanner для считывания ввода пользователя с консоли.
Приглашайте пользователя ввести имена до тех пор, пока он не введет ключевое слово для остановки (например, "стоп").
3.Хранение уникальных имен:
Создайте экземпляр HashSet для хранения имен. Когда пользователь вводит имя, добавляйте его в набор.
Если пользователь пытается ввести имя, которое уже есть в наборе, HashSet автоматически предотвратит дублирование.
4.Вывод уникальных имен:
После того, как пользователь введет ключевое слово "стоп", переберите HashSet и напечатайте уникальные имена, введенные пользователем.
Пример вывода:
Введите имена (или введите 'стоп' для завершения):
Анна
Мария
Анна
стоп
Уникальные имена:
Анна
Мария
Критерии оценки:
Корректность работы программы: программа должна успешно считывать ввод, хранить только уникальные имена и корректно их выводить.
Чистота и читаемость кода: код должен быть хорошо организован, с четкими именами переменных и комментариями, где это необходимо.
Обработка ошибок: программа должна корректно обрабатывать неверный ввод пользователя и другие потенциальные ошибки.*/
public class UniqueNamesApp {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names (or enter 'stop' to complete):");

        while (true) {
            String input = scanner.nextLine().trim(); // Removing leading and trailing spaces

            if (input.equalsIgnoreCase("stop")) {
                break;
            } else if (input.isEmpty()) {
                System.out.println("Error: Empty input. Please enter a valid name.");
                continue;
            } else if (!input.matches("[a-zA-Z]+")) {
                System.out.println("Error: The entered value is not a valid name. Please enter a valid name.");
                continue;
            }

            // Adding a name to the HashSet
            uniqueNames.add(input);
        }

        // Displaying unique names
        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}