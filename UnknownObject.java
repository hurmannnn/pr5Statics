package org.suitt.pcci.it.oop.models;

public class UnknownObject {
    protected int id;
    protected String detection_time;
    protected String coordinates;
    protected int height;
    protected int speed;
    protected String direction;
    protected String status;
    protected String detection_source;

    public static int totalObjectsCount = 0;

    static {
        System.out.println("[Static Init] Ініціалізація системи обліку невідомих об'єктів.");
    }

    public UnknownObject(int id, String detection_time,
                         String coordinates, int height, int speed,
                         String direction, String status,
                         String detection_source) {
        this.id = id;
        this.detection_time = detection_time;
        this.coordinates = coordinates;
        this.height = height;
        this.speed = speed;
        this.direction = direction;
        this.status = status;
        this.detection_source = detection_source;
        totalObjectsCount++;
    }
    public static int getTotalObjectsCount() {
        return totalObjectsCount;
    }
    public int getId() {
        return id;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public String getStatus() {
        return status;
    }

    public void changeStatus(String newStatus) {
        status = newStatus;
    }

    public void updateObject(String newCoordinates, int newHeight, int newSpeed) {
        coordinates = newCoordinates;
        height = newHeight;
        speed = newSpeed;
    }

    public void registerObject() {
        System.out.println("Об'єкт зареєстровано: " + id);
    }

    public void showInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Невідомий об'єкт: " + "id=" + id + ", Час виявлення='" + detection_time + '\'' + ", Координати='" + coordinates + '\'' + ", Висота=" + height + ", Швидкість=" + speed + ", Напрямок='" + direction + '\'' + ", Статус='" + status + '\'' + ", Джерело='" + detection_source + '\'';
    }
}