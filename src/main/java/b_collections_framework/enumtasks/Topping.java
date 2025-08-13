package b_collections_framework.enumtasks;

public enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice() {
        return switch (this) {
            case BACON -> 1.5;
            case TOMATO -> 1.0;
            default -> 0.0;
        };
    }
}
