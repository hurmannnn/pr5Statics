package org.suitt.pcci.it.oop.models;

public class AerialObject extends UnknownObject {//клас AerialObject наслідує UnknownObject
    protected String aircraftType;//захищене поле для типу літаючий апарат

    public AerialObject(int id, String detection_time, String coordinates, int height, int speed, String direction, String status, String detection_source, String aircraftType) {
        super(id, detection_time, coordinates, height, speed, direction, status, detection_source);
        this.aircraftType = aircraftType;//ініціалізує унікальне поле типу літального апарату
    }

    @Override
    public void registerObject() {
        System.out.println("Повітряний об'єкт зареєстровано: " + id);
        System.out.println("Тип об'єкта: " + aircraftType);
    }//перевизначення методу реєстрації об'єкта

    @Override
    public String toString() {
        return super.toString() + ", Тип повітряного об'єкта='" + aircraftType + '\'';
    }
}