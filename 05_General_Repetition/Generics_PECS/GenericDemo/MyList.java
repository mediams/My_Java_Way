package GenericDemo;

public interface MyList<T> {
    void add(T t);

    T getT(int index);

    int getSize();

    boolean remove(T t);// Удалить элемент
}
