package hashset_hashmap;

public class Pizza {
    private String name;
    private int size;
    private String cookName;
    private boolean isPresent;

    public Pizza(String name, int size, String cookName, boolean isPresent) {
        this.name = name;
        this.size = size;
        this.cookName = cookName;
        this.isPresent = isPresent;
    }


    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getCookName() {
        return cookName;
    }

    public boolean isPresent() {
        return isPresent;
    }
}
