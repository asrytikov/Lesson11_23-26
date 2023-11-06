package dz9;

public interface Informable<T> {

    default void infoD(){
        System.out.println("Информации о телефоне на данном этапе нет");
    }

    void inform(T mes);
}
