package org.suitt.pcci.it.oop.models;

public class DetectionSource {
    protected int id;
    protected String name;
    protected String type;
    protected String location;
    protected String status;
    public static int totalSourcesCount = 0;//

    public DetectionSource(int id, String name, String type, String location, String status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.status = status;
        totalSourcesCount++;
    }

    public static int getTotalSourcesCount() {
        return totalSourcesCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public void activate() {
        status = "Активно";
    }

    public void deactivate() {
        status = "Неактивно";
    }

    void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Статус джерела оновлено: " + status);
    }

    public void updateStatusPublic(String newStatus) {
        updateStatus(newStatus);
    }

    public void showSource() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Джерело виявлення: " + "id=" + id + ", Назва='" + name + '\'' + ", Тип='" + type + '\'' + ", Локація='" + location + '\'' + ", Статус='" + status + '\'';
    }
}