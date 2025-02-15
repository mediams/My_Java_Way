package oopprinciples;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionEx {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Library> constructorLibrary = Library.class.getConstructor();
        Library library = constructorLibrary.newInstance();

        Method[] declaredMethods = Library.class.getDeclaredMethods();
        for (Method m : declaredMethods) {
            m.setAccessible(true);
            System.out.println(m.getName());
        }
        Field[] declaredFields = Library.class.getDeclaredFields();
        for (Field f : declaredFields) {
            f.setAccessible(true);
            System.out.println("Field: " + f.getName() + " " + f.getType() + " " + Modifier.toString(f.getModifiers()));
        }
        Arrays.stream(declaredFields).forEach(field -> {
            System.out.println(field.getGenericType().getTypeName());
        });
        Method findBookByIsbn = Library.class.getDeclaredMethod("findBookByIsbn", String.class);
        System.out.println(library);

        System.out.println(findBookByIsbn.invoke(library, "559-46"));

    }
}
