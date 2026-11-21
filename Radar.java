package org.suitt.pcci.it.oop.models;

public class Radar extends DetectionSource {//клас Radar наслідує батьківський клас DetectionSource
    private int range;//приватне поле для зберігання діапазону радара

    public Radar(int id, String name, String location, String status, int range) {//передача необхідних параметрів від класу Радар
        super(id, name, "Радар", location, status);//сама передача з батьківського класу DetectionSource, куди передає основні параметри, при цьому тип джерела автоматично заповнюється як "Радар"
        this.range = range;
    }

    @Override
    public void activate() {//метод для активації радару
        super.activate();//викликає базовий метод activate з класу DetectionSource, який змінює загальний статус на "Активно"
        System.out.println("Радар активовано. Дальність: " + range + " км");
    }

    @Override
    public String toString() {
        return super.toString() + ", Дальність=" + range + " км";
    }
}