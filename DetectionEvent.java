package org.suitt.pcci.it.oop.models;

public class DetectionEvent {
    protected int id;
    private String detection_time;
    private String location;
    private String status;
    public static int totalEventsCount = 0;//статистичний лічильник який рахує усі події виявлення

    public DetectionEvent(int id, String detection_time, String location, String status) {
        this.id = id;
        this.detection_time = detection_time;
        this.location = location;
        this.status = status;
        totalEventsCount++;
    }
    public static int getTotalEventsCount() {//ст метод для для читання кількості зареєстрованих подій
        return totalEventsCount;//збільшення лічильника подій
    }

    public int getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }

    public void registerEvent() {
        System.out.println("Подію зареєстровано: " + id);
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Статус події оновлено: " + status);
    }

    public String toString() {
        return "Подія виявлення: " +
                "id=" + id +
                ",Час виявлення='" + detection_time + '\'' +
                ",Локація='" + location + '\'' +
                ",Статус='" + status + '\'';
    }
}