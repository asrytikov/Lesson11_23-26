package dz10;
/*
 * Д/з добавить в проект Phone свой класс NameException,
 * исправим метод receiveCall получаем имя от пользователя и получаем исключение,
 * если длина имени меньше 4 символов.
 * */

public class Main {
    public static void main(String[] args) throws NameException{
        ApplePhone phone = new ApplePhone("999-999-999","Samsung S55", 100.123);
        phone.receiveCall("Mis");
        phone.info();
        //phone.receiveCall();
        phone.infoD();

        phone.inform("Test");
    }
}