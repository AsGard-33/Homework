package de.ait.homework.homework45;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class SafelyRetrievingElementsFromAnArray {
    private static final Logger logger = LoggerFactory.getLogger(SafelyRetrievingElementsFromAnArray.class);

    // Метод для безопасного извлечения элемента из массива
    public static String safeRetrieve(String[] array, int index) throws ArrayIndexOutOfBoundsException {
        return array[index];
    }
    public static void main(String[] args) {
        String[] stringArray = {"Grape", "Banana", "Cherry", "Apple", "Elderberry"};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.info("Введите индекс элемента для извлечения: ");
            try {
                int index = Integer.parseInt(scanner.nextLine());
                String result = safeRetrieve(stringArray, index);
                logger.info("Извлеченный элемент: {}", result);
                // Завершаем цикл после успешного извлечения
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error("Ошибка: Индекс за пределами границ массива.");
            } catch (NumberFormatException e) {
                logger.error("Ошибка: Введено не число.");
            } finally {
                logger.info("Операция поиска завершена.");
            }
        }
        scanner.close();
    }
}


