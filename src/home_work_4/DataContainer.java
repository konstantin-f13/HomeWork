package home_work_4;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;

    }

    public int add(T item){
        if (item == null){
            return -1;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    return i;
                }
            }
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = item;
            return data.length - 1;
        }
    }

    public T get(int index){
        if (index >= data.length ){
            return null;
        } else {
            return data[index];
        }
    }

}
