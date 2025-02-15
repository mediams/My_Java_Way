import java.lang.reflect.Array;
import java.util.Arrays;

public class DefaultMyListParameterized<T> implements MyList<T> {
    Object[] objects;
    int size;

    public DefaultMyListParameterized() {
        objects = new Object[10];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size <= objects.length) {
            resize();
        }
        objects[size++] = o;
    }

    @Override
    public T getT(int index) {
        return (T)objects[index];
    }

    @Override
    public int getSize() {
        return objects.length;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    public void resize() {
        objects = Arrays.copyOf(objects, objects.length * 2);
    }
}
