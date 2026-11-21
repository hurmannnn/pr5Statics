
package org.suitt.pcci.it.oop.models;

public class Main {
    public static void main(String args[]) {
        String studentName = "Гурман Вікторія";

        System.out.println("Виконав студент: " + "Гурман Вікторія");

        System.out.println("Створення сутностей через ObjectFactory");
        Drone drone1 = ObjectFactory.createDrone(2347, "08:15", "33.50,32.80", 500, 100, "Схід", true);
        Radar radar1 = ObjectFactory.createRadar(5971, "Головний радар", "Київ", 300);
        Administrator admin1 = ObjectFactory.createAdministrator(1561, "Василь", "admin14-90", 5);
        ObjectDetectionEvent event2 = ObjectFactory.createEvent(8946, "08:15", "33.50,32.80", 2347);

        UnknownObject object1 = new UnknownObject(2345, "08:00", "33.30,32.72", 1000, 200, "Північ", "Невідомий об'єкт", "Радар");
        AerialObject aerialObject1 = new AerialObject(2346, "08:10", "33.45,12.89", 2000, 300, "Південь", "Активно", "Радар", "Літак");
        DetectionEvent event1 = new DetectionEvent(8945, "08:00", "33.45,12.89", "Активно");
        DetectionSource source1 = new DetectionSource(5970, "Перше джерело", "Радар", "Жашків", "Активно");
        Operator operator1 = new Operator(1560, "Тетяна Глухота", "Оператор", "tanyaVSC156", "Активно");

        //збереження обʼєктів в статистичне сховище
        DataRepository.saveObject(object1);
        DataRepository.saveObject(aerialObject1);
        DataRepository.saveObject(drone1);

        DataRepository.saveEvent(event1);
        DataRepository.saveEvent(event2);

        DataRepository.saveSource(source1);
        DataRepository.saveSource(radar1);

        DataRepository.saveOperator(operator1);
        DataRepository.saveOperator(admin1);

        //демонстрація роботи класу
        System.out.println("Демонстрація вкладеного статичного класу");
        Operator.Credentials creds = new Operator.Credentials(admin1.getRole(), 5);
        creds.printCredentials();

        //вивід статистики
        System.out.println("Загальна статистика");
        System.out.println("Всього об'єктів у системі: " + UnknownObject.getTotalObjectsCount());
        System.out.println("Всього подій: " + DetectionEvent.getTotalEventsCount());
        System.out.println("Всього джерел: " + DetectionSource.getTotalSourcesCount());
        System.out.println("Всього операторів: " + Operator.getTotalOperatorsCount());

        //виведення даних зі сховища
        DataRepository.printAllStoredData();
    }
}