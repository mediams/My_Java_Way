package priority;

public enum MessageType {
    A(Priority.HIGH),
    B(Priority.MEDIUM),
    C(Priority.LOW);

    private final Priority priority;

    MessageType(Priority priority) {
        this.priority = priority;
    }
    public Priority getPriority() {
        return priority;
    }
}
