package de.ait.homework.review;
/*Задание на отработку code review в Java
Цель: Отработать навыки проведения code review, научиться выявлять и корректировать
ошибки, улучшать структуру и читаемость кода, давать обратную связь коллегам.
Задача: Провести code review для предоставленного кода на Java.
Инструкции:
1.  Ознакомьтесь с кодом.
2.  Обратите внимание на стиль кодирования, именование переменных и методов, структуру
кода, принципы ООП.
3.  Выпишите все замечания, которые у вас возникли по коду, и предложите свои
корректировки.
4.  Объясните причины ваших предложений.*/

import java.util.ArrayList;
import java.util.List;

public class User {
    //TODO: 1. Отсутствуют комментарии
    // 2. Неправильное наименование переменных
    // 3. Неправильное наименование методов
    // 4. Не безопасный возврат списка друзей
    // 5. Неправильная инициализация конструкторв
    // 6. Неправиьный модификатор доступа списка друзей
    // 7. Использование ArrayList вместо List
    private List<String> friendsList = new ArrayList<>();
    private String userName;
    private int age;

    public User(String name, int age) {
        this.userName = name;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
            return age;
        }
        public void addFriend(String friendName) {
            friendsList.add(friendName);
        }
        public void removeFriend(String friendName) {
            friendsList.remove(friendName);
        }
        //GetFriends oshibka, peremennaja s malenkoj bukvi getFriends
        public List<String> getFriends() {
            return new ArrayList<>(friendsList);
        }
}
