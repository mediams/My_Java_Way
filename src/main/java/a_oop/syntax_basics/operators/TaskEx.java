package a_oop.syntax_basics.operators;

public class TaskEx {
    public static void main(String[] args) {
        System.out.printf("Calculate position: %d", calculateHIghScopePosition(499));
    }

    private static int calculateHIghScopePosition(int scope) {
        if (scope >= 1000) {
            return 1;
        } else if (scope >= 500) {
            return 2;
        } else if (scope >= 100) {
            return 3;
        }
        return 4;
    }
}
