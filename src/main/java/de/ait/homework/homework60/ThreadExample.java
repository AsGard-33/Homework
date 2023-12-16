package de.ait.homework.homework60;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.logging.Level;


/*Задание 1: Простая реализация Runnable
Задача: Создайте класс Task, который реализует интерфейс Runnable. В методе run() следует вывести сообщение "Задача выполнена".

Задание 2: Запуск и Исполнение Потока
Задача: выполните класс Task из области задания, создайте и запустите поток.

Задание 3: Поток с Параметрами
Задача: Модифицируйте класс Task, чтобы он использовал строковый параметр в конструкторе и вывел этот код в методе run() .

Задание 4: Создание Множества Потоков
Задача: Создайте и запустите три потока, используя класс Task, каждый с разными сообщениями.

Задание 5: Исполнение Множества Задач
Задача: Создайте класс MyTask, который реализует интерфейс Runnable и выполняет эту задачу: в методе run(), вы вводите на экране цифры от 1 до 5 с задержкой 500 миллисекунд между цифрами.

Задание 6: Запуск Нескольких Задач
Задача: выполните класс MyTask из определения задания, создайте и запустите два потока, чтобы оба выполнить эту задачу параллельно.*/
public class ThreadExample{
    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadExample.class);

    public static void main(String[] args) {
        // Задание 2: Запуск и исполнение потока
        Thread thread = new Thread(new Task("Задача выполнена"));
        thread.start();

        // Задание 4: Создание множества потоков
        Thread thread1 = new Thread(new Task("Сообщение 1"));
        Thread thread2 = new Thread(new Task("Сообщение 2"));
        Thread thread3 = new Thread(new Task("Сообщение 3"));

        thread1.start();
        thread2.start();
        thread3.start();

        // Задание 6: Запуск нескольких задач
        Thread myTaskThread1 = new Thread(new MyTask());
        Thread myTaskThread2 = new Thread(new MyTask());

        myTaskThread1.start();
        myTaskThread2.start();
    }

    static class Task implements Runnable {
        private String message;
        private static final Logger LOGGER = LoggerFactory.getLogger(Task.class);

        public Task(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            LOGGER.info(message);
        }
    }

    static class MyTask implements Runnable {
        private static final Logger LOGGER = LoggerFactory.getLogger(MyTask.class);

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                LOGGER.info("{}", i);
                try {
                    Thread.sleep(500); // Задержка 500 мс
                } catch (InterruptedException e) {
                    LOGGER.error("Thread interrupted", e);
                }
            }
        }
    }
}