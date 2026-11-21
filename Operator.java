package org.suitt.pcci.it.oop.models;

public class Operator {
    protected int id;
    protected String fullName;
    protected String role;
    protected String login;
    protected String status;

    // Вкладений статичний клас (Nested Static Class) за вимогами завдання
    public static class Credentials {//вкладений статичний клас, який використовується для групування даних облікового запису
        private String userLogin;
        private int accessLevel;

        public Credentials(String userLogin, int accessLevel) {
            this.userLogin = userLogin;
            this.accessLevel = accessLevel;
        }

        public void printCredentials() {
            System.out.println("Логін: " + userLogin + ", Рівень доступу: " + accessLevel);
        }
    }

    public static int totalOperatorsCount = 0;//статичний лічильник кількості зареєстрованих операторів

    public Operator(int id, String fullName, String role, String login, String status) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.login = login;
        this.status = status;
        totalOperatorsCount++;
    }

    public static int getTotalOperatorsCount() {
        return totalOperatorsCount;//статичний метод для отримання підсумкової кількості операторів
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public void changeStatus(String newStatus) {
        status = newStatus;
    }

    public void updateRole(String newRole) {
        role = newRole;
    }

    void deactivateOperator() {
        status = "Неактивно";
    }

    public void showInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Оператор: " + "id=" + id + ", Ім'я='" + fullName + '\'' + ", Роль='" + role + '\'' + ", Логін='" + login + '\'' + ", Статус='" + status + '\'';
    }
}