package org.suitt.pcci.it.oop.models;

public class Administrator extends Operator {//клас адміністратор наслідує клас оператор, оператор це його батьківський клас
    private int accessLevel; //закритий поле для збережння рівня доступу адміністратора

    public Administrator(int id, String fullName, String login, String status, int accessLevel) {
        super(id, fullName, "Адміністратор", login, status);
        this.accessLevel = accessLevel;//виклик батьківського класу куди передаються базові дані, а роль прописана як Адміністратор
    }

    @Override//анотація яка вказує клмпілятору що далі буде змінено метод батьківского класу
    public void changeStatus(String newStatus) {//метод для зміни статусу адміністратора
        super.changeStatus(newStatus);//викликає оргінальний метод для зміни
        System.out.println("Адміністратор змінив статус: " + status);
    }

    @Override
    public String toString() {
        return
                super.toString() + ", Рівень доступу=" + accessLevel;// до основного рядка додається рівень доступу
    }
}