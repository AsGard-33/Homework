package de.ait.homework.homework40;
/*Задание: Учет напитков в баре
Цель: Создать программу для учета напитков в баре с использованием HashMap.

Описание:
Класс Напиток: Создайте класс Drink со следующими полями:

String name (название)
String type (тип напитка: алкогольный, безалкогольный и т.д.)
double volume (объем в мл)
Класс Бар: Создайте класс Bar:

Внутри этого класса создайте HashMap, где ключом будет являться String (ID напитка), а значением — объект класса Drink.
Методы:
addDrink(String id, Drink drink): добавляет напиток в коллекцию.
getDrink(String id): возвращает напиток по ID.
Задание: Написание Unit-тестов для учета напитков в баре
Цель: Написать unit-тесты для проверки корректности работы методов класса Bar и Drink.

Описание:
Тестирование класса Drink:

Проверьте, корректно ли создается объект класса Drink.
Проверьте, корректно ли возвращаются значения полей объекта.
Тестирование класса Bar:

Добавление напитка:
Проверьте, добавляется ли напиток в HashMap корректно.
Проверьте, что происходит при попытке добавить напиток с уже существующим ID (если у вас есть такая проверка).
Получение напитка по ID:
Проверьте, корректно ли возвращается напиток по его ID.
Проверьте обработку ситуации, когда напиток с указанным ID отсутствует.*/
public class Drink {
    private String name;
    private String type;
    private double volume;

    public Drink(String name, String type, double volume) {
        this.name = name;
        this.type = type;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }
}
