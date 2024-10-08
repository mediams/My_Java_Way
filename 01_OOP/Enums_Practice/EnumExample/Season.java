public enum Season {
    WINTER("Cold"),
    SPRING("Warm"),
    SUMMER("Hieß"),
    FALL("Regnet");

    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
