package dz10;

public interface Callable<T> {

    void receiveCall(T name) throws NameException;

}
