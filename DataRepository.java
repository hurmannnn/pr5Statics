package org.suitt.pcci.it.oop.models;

import java.util.ArrayList;
import java.util.List;
public class DataRepository {//клас, що відповідає за збереження всієї інформації через статичні поля
    //статичні колекції для збереження об'єктів проєкту
    public static List<UnknownObject> objectsList = new ArrayList<>();
    public static List<DetectionEvent> eventsList = new ArrayList<>();
    public static List<DetectionSource> sourcesList = new ArrayList<>();
    public static List<Operator> operatorsList = new ArrayList<>();
    //статичні методи для додавання елементів
    public static void saveObject(UnknownObject obj) {
        objectsList.add(obj);
    }

    public static void saveEvent(DetectionEvent event) {
        eventsList.add(event);
    }

    public static void saveSource(DetectionSource source) {
        sourcesList.add(source);
    }

    public static void saveOperator(Operator op) {
        operatorsList.add(op);
    }

    //статичний метод для виведення даних
    public static void printAllStoredData() {
        System.out.println("Центральне сховище даних");

        System.out.println("\nЗбережені об'єкти (" + objectsList.size() + ")");
        for (UnknownObject obj : objectsList) {
            System.out.println(obj);
        }

        System.out.println("\nЗбережені події (" + eventsList.size() + ")");
        for (DetectionEvent ev : eventsList) {
            System.out.println(ev);
        }

        System.out.println("\nЗбережені джерела (" + sourcesList.size() + ")");
        for (DetectionSource ds : sourcesList) {
            System.out.println(ds);
        }

        System.out.println("\nЗбережені оператори (" + operatorsList.size() + ")");
        for (Operator op : operatorsList) {
            System.out.println(op);
        }
    }
}