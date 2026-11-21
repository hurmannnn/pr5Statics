package org.suitt.pcci.it.oop.models;

public class ObjectDetectionEvent extends DetectionEvent {//
    protected int objectId;
    protected int id;

    public ObjectDetectionEvent(int id, String detection_time, String location, String status, int objectId) {
        super(id, detection_time, location, status);
        this.objectId = objectId;
    }

    @Override
    public void registerEvent() {
        System.out.println("Подію виявлення об'єкта зареєстровано: " + id);
        System.out.println("ID виявленого об'єкта: " + objectId);
    }

    @Override
    public String toString() {
        return
                super.toString() + ", ID об'єкта=" + objectId;
    }
}