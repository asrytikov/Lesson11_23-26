package dz9;
/*
 * Д/з изменить в проекте с Phone интерфейсы Callable и Informable на использование generic,
 * применить интерфейсы к абстрактному классу Phone и классам-наследникам.
 * */

public class Main {
    public static void main(String[] args) {
        ApplePhone phone = new ApplePhone("999-999-999","Samsung S55", 100.123);
        phone.receiveCall("Misha");
        phone.info();
        //phone.receiveCall();
        phone.infoD();

        phone.inform("Test");
    }
}