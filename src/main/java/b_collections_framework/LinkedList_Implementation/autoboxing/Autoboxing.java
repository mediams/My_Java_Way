package b_collections_framework.LinkedList_Implementation.autoboxing;

public class Autoboxing {
    public static void main(String[] args) {
        Integer exampleAutoboxing = Integer.valueOf(15);
//        Integer example2 = Integer(15);
        int unboxedInt = exampleAutoboxing.intValue();

        Integer autoBox = 15;
        int autoUnboxed = autoBox;
        System.out.println(autoBox.getClass().getName());
        System.out.println(autoUnboxed);

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getLiteralDoublePrimitive();


    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static Double getLiteralDoublePrimitive() {
        return 100.00;
    }
}
