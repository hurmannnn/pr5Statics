package org.suitt.pcci.it.oop.models;

public class Drone extends AerialObject {//клас Drone насліду батьківський клас AerialObject
    private boolean isDangerous;//визначення небезпеки через буліан

    public Drone(int id, String detection_time, String coordinates, int height, int speed, String direction, String status, String detection_source, boolean isDangerous) {
        super(id, detection_time, coordinates, height, speed, direction, status, detection_source, "Безпілотник");
        this.isDangerous = isDangerous;
    }

    @Override
    public void registerObject() {
        super.registerObject();
        System.out.println("Зареєстровано безпілотник: " + id);
        System.out.println("Небезпечний: " + isDangerous);
    }

    @Override
    public String toString() {
        return super.toString() + ", Небезпечний=" + isDangerous;
    }
}