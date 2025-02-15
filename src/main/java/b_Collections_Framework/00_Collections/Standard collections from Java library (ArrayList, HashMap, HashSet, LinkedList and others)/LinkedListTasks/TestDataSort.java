package LinkedListTasks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestDataSort {
    public static void main(String[] args) {
        LinkedList<DataStorage> dataStorages = new LinkedList<>();
        dataStorages.add(new DataStorage(new Data("Laptop1",25), 2.05, 2, true ));
        dataStorages.add(new DataStorage(new Data("PC",2), 2.05, 2, true ));
        dataStorages.add(new DataStorage(new Data("Laptop2",25), 2.05, 2, true ));
        dataStorages.add(new DataStorage(new Data("Laptop2",20), 2.05, 2, true ));
        dataStorages.add(new DataStorage(new Data("Laptop2",20), 1.99, 2, true ));

        Collections.sort(dataStorages);
        System.out.println(dataStorages);
    }

}
