package LinkedListTasks;

public class DataStorage implements Comparable<DataStorage> {
    private Data data;
    private Double weight;
    private int version;
    private boolean isActive;

    public DataStorage(Data data, Double weight, int version, boolean isActive) {
        this.data = data;
        this.weight = weight;
        this.version = version;
        this.isActive = isActive;
    }

    public Data getData() {
        return data;
    }

    public Double getWeight() {
        return weight;
    }

    public int getVersion() {
        return version;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "\nDataStorage{" +
                "data=" + data +
                ", weight=" + weight +
                ", version=" + version +
                ", isActive=" + isActive +
                '}';
    }


    @Override
    public int compareTo(DataStorage o) {
        int compare = data.compareTo(o.data);
        if (compare != 0) return compare;

        compare = Double.compare(weight, o.weight);
        if (compare != 0) return compare;

        compare = Integer.compare(version, o.version);
        if (compare != 0) return compare;

        return Boolean.compare(isActive, o.isActive);
    }
}
