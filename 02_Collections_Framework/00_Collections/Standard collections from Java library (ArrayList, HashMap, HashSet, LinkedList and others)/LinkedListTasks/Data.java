package LinkedListTasks;

public class Data implements Comparable<Data> {
    private String data;
    private int count;

    public Data(String data, int count) {
        this.data = data;
        this.count = count;
    }

    public String getData() {
        return data;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Data o) {
        if (data.compareTo(o.data)==0) return Integer.compare(count, o.count);
        return  data.compareTo(o.data);
    }
}
