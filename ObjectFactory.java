package org.suitt.pcci.it.oop.models;

//клас, що складається зі статичних методів для створення сутностей
public class ObjectFactory {
    //статичний метод для створення Дрона
    public static Drone createDrone(int id, String time, String coords, int height, int speed, String direction, boolean isDangerous) {
        System.out.println("[ObjectFactory] Створення об'єкта Drone...");
        return new Drone(id, time, coords, height, speed, direction, "Активно", "Радар", isDangerous);
    }
    //статичний метод для створення Радара
    public static Radar createRadar(int id, String name, String location, int range) {
        System.out.println("[ObjectFactory] Створення об'єкта Radar...");
        return new Radar(id, name, location, "Активно", range);
    }
    //статичний метод для створення Адміністратора
    public static Administrator createAdministrator(int id, String fullName, String login, int accessLevel) {
        System.out.println("[ObjectFactory] Створення об'єкта Administrator...");
        return new Administrator(id, fullName, login, "Активно", accessLevel);
    }
    //статичний метод для створення Події виявлення
    public static ObjectDetectionEvent createEvent(int id, String time, String location, int objectId) {
        System.out.println("[ObjectFactory] Створення об'єкта ObjectDetectionEvent...");
        return new ObjectDetectionEvent(id, time, location, "Активно", objectId);
    }
}