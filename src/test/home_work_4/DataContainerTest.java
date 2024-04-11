package test.home_work_4;

import home_work_4.ComparatorIntegerBySize;
import home_work_4.ComparatorStringByLength;
import home_work_4.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DataContainerTest {
    @DisplayName("Проверка add на правильный вывод индекса при добавлении элемента")
    @Test
    public void addTest1(){
        Integer[] integerArr = new Integer[]{1, 2, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertEquals(3, container.add(777));
    }

    @DisplayName("Проверка add на ввод null")
    @Test
    public void addTest2(){
        Integer[] integerArr = new Integer[]{1, 2, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertEquals(-1, container.add(null));
    }

    @DisplayName("Проверка add на ввод null")
    @Test
    public void addTest3(){
        Integer[] integerArr = new Integer[]{1, null, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertEquals(1, container.add(777));
    }

    @DisplayName("Проверка add при добавлении элемента в пустой массив")
    @Test
    public void addTest4(){
        Integer[] integerArr = new Integer[]{};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertEquals(0, container.add(777));
    }

    @DisplayName("Проверка get при добавлении элемента в пустой массив")
    @Test
    public void getTest1(){
        Integer[] integerArr = new Integer[]{};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertEquals(0, container.add(9999));
        Assertions.assertEquals(9999,container.get(0));
    }

    @DisplayName("Проверка get на вывод несуществующего элемента")
    @Test
    public void getTest2(){
        Integer[] integerArr = new Integer[]{};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        container.add(9999);
        Assertions.assertEquals(null,container.get(1));
    }

    @DisplayName("Проверка getItems")
    @Test
    public void getItemsTest1(){
        Integer[] integerArr = new Integer[]{1, null, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertEquals("[1, null, 3, null, null, null]", Arrays.toString(container.getItems()));
    }

    @DisplayName("Проверка работы метода delete(int index) при удалении последнего элемента")
    @Test
    public void deleteByIndexTest1(){
        Integer[] integerArr = new Integer[]{1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertTrue(container.delete(3));
        Assertions.assertEquals("[1, 2, 3]", Arrays.toString(container.getItems()));

    }

    @DisplayName("Проверка работы метода delete(int index) при удалении несуществуюшщего элемента")
    @Test
    public void deleteByIndexTest2(){
        Integer[] integerArr = new Integer[]{1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertFalse(container.delete(9));
        Assertions.assertEquals("[1, 2, 3, 777]", Arrays.toString(container.getItems()));
    }

    @DisplayName("Проверка работы метода delete(int index) при удалении непоследнего элемента")
    @Test
    public void deleteByIndexTest3(){
        Integer[] integerArr = new Integer[]{1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertTrue(container.delete(2));
        Assertions.assertEquals("[1, 2, 777]", Arrays.toString(container.getItems()));
    }

    @DisplayName("Проверка работы метода delete(T item) на удаление null элемента, которого нет в массиве")
    @Test
    public void deleteByItemTest1(){
        Integer[] integerArr = new Integer[]{1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertFalse(container.delete(null));
        Assertions.assertEquals("[1, 2, 3, 777]", Arrays.toString(container.getItems()));
    }

    @DisplayName("Проверка работы метода delete(T item) на удаление null, присутствующего в массиве")
    @Test
    public void deleteByItemTest2(){
        Integer[] integerArr = new Integer[]{1, 2, 3, 777, null};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertFalse(container.delete(null));
        Assertions.assertEquals("[1, 2, 3, 777, null]", Arrays.toString(container.getItems()));
    }

    @DisplayName("Проверка работы метода delete(T item) на удаление элемента, присутствующего в массиве и не null")
    @Test
    public void deleteByItemTest3(){
        Integer[] integerArr = new Integer[]{1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertTrue(container.delete((Integer) 777));
        Assertions.assertEquals("[1, 2, 3]", Arrays.toString(container.getItems()));
    }

    @DisplayName("Проверка работы метода delete(T item) на удаление не-null элемента, отсутствующего в массиве")
    @Test
    public void deleteByItemTest4(){
        Integer[] integerArr = new Integer[]{1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertFalse(container.delete((Integer) 1111));
        Assertions.assertEquals("[1, 2, 3, 777]", Arrays.toString(container.getItems()));
    }

    @DisplayName("Проверка работы метода delete(T item) на удаление не-null элемента, встречающегося несколько раз в массиве")
    @Test
    public void deleteByItemTest5(){
        Integer[] integerArr = new Integer[]{1, 2, 3, 777, 3};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertTrue(container.delete((Integer) 3));
        Assertions.assertEquals("[1, 2, 777, 3]", Arrays.toString(container.getItems()));
    }

    @DisplayName("Проверка работы метода sort с компаратором чисел")
    @Test
    public void sortBySizeTest1(){
        Integer[] integerArr = new Integer[]{3, 1, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        container.sort(new ComparatorIntegerBySize());
        Assertions.assertEquals("[1, 3, 3, 777]", Arrays.toString(container.getItems()));
    }

    @DisplayName("Проверка работы метода sort с компаратором чисел")
    @Test
    public void sortStringByLength1(){
        String[] stringArr;
        stringArr = new String[]{"i", "hello", "1", "Как домашка"};
        DataContainer<String> containerStr = new DataContainer<>(stringArr);
        containerStr.sort(new ComparatorStringByLength());
        Assertions.assertEquals("[i, 1, hello, Как домашка]", Arrays.toString(containerStr.getItems()));
    }

    @DisplayName("Проверка работы метода toString")
    @Test
    public void toString1(){
        Integer[] integerArr = new Integer[]{1, 2, 3, 777, 3};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertEquals("[1, 2, 3, 777, 3]", container.toString());
    }

    @DisplayName("Проверка работы метода toString с пропуском null")
    @Test
    public void toString2(){
        Integer[] integerArr = new Integer[]{1, 2, 3, null};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertEquals("[1, 2, 3]", container.toString());
    }

    @DisplayName("Проверка работы метода toString для пустого массива")
    @Test
    public void toString3(){
        Integer[] integerArr = new Integer[]{};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        Assertions.assertEquals("[]", container.toString());
    }

    @DisplayName("Проверка метода sort(container) c Integer")
    @Test
    public void sortIntTest(){
        Integer[] integerArr = new Integer[]{1, 555, 3, 777, 3};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        DataContainer.sort(container);
        Assertions.assertEquals("[1, 3, 3, 555, 777]", container.toString());
    }

    @DisplayName("Проверка метода sort(container) c String")
    @Test
    public void sortStringTest(){
        String[] stringArr = new String[]{"i", "hello", "1", "Как домашка"};
        DataContainer<String> containerStr = new DataContainer<>(stringArr);
        DataContainer.sort(containerStr);
        Assertions.assertEquals("[i, 1, hello, Как домашка]", containerStr.toString());
    }

    @DisplayName("Проверка метода sort(container, comparator) c Integer")
    @Test
    public void sortWithContainerWithComparatorInt(){
        Integer[] integerArr = new Integer[]{1, 555, 3, 777, 3, 0};
        DataContainer<Integer> container = new DataContainer<>(integerArr);
        DataContainer.sort(container, new ComparatorIntegerBySize());
        Assertions.assertEquals("[0, 1, 3, 3, 555, 777]", container.toString());
    }

    @DisplayName("Проверка метода sort(container, comparator) c String")
    @Test
    public void sortWithContainerWithComparatorString(){
        String[] stringArr = new String[]{"i", "hello", "1", "Как домашка"};
        DataContainer<String> containerStr = new DataContainer<>(stringArr);
        DataContainer.sort(containerStr, new ComparatorStringByLength());
        Assertions.assertEquals("[i, 1, hello, Как домашка]", containerStr.toString());
    }
}
