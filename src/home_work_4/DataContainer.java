package home_work_4;

import home_work_4.utils.ArraySorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

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

    public T[] getItems(){
        return data;
    }

    public boolean delete(int index){
        if (index >= data.length ){
            return false;
        } else {
            if (index == data.length - 1){
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            } else if (index == 0){
                data = Arrays.copyOfRange(data, 1, data.length - 1);
                return true;
            } else {
                T[] arrDestination;
                arrDestination = Arrays.copyOf(data, data.length - 1);
                System.arraycopy(data, index + 1, arrDestination, index, data.length - 1 - index);
                data = arrDestination;
                return true;
            }
        }
    }

    public boolean delete (T item){
        if (item == null){
            return false;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (Objects.equals(item, data[i])){
                    if (i == data.length - 1) {
                        data = Arrays.copyOf(data, data.length - 1);
                        return true;
                    } else if (i == 0){
                        data = Arrays.copyOfRange(data, 1, data.length - 1);
                        return true;
                    } else {
                        T[] arrDestination;
                        arrDestination = Arrays.copyOf(data, data.length - 1);
                        System.arraycopy(data, i + 1, arrDestination, i, data.length - 1 - i);
                        data = arrDestination;
                        return true;
                    }
                    }
            }
        return false;
        }
    }

    public void sort(Comparator<T> comparator){
        ArraySorting.sort(comparator, data);
    }

    public String toString(){
        StringBuilder result = new StringBuilder("[");
        boolean extraSymb = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                if (extraSymb) {
                    result.append(", ");
                }
                result.append(data[i]);
                extraSymb = true;
            }
        }
        result.append("]");
        return result.toString();
    }

    public static <T extends Comparable<T>> void sort(DataContainer<T> container){
        ArraySorting.sort(container.data);
        }

    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator){
        ArraySorting.sort(comparator, container.data);
    }

}