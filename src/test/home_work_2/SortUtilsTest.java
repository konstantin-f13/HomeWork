package test.home_work_2;

import home_work_2.utils.SortUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortUtilsTest {

    @DisplayName("Метод sort. Массив {1,2,3,4,5,6}")
    @Test
    public void sort1(){
        int[] array1 = {1,2,3,4,5,6};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortUtils.sort(array1)));
    }

    @DisplayName("Метод shake. Массив {1,2,3,4,5,6}")
    @Test
    public void sort2(){
        int[] array1 = {1,2,3,4,5,6};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortUtils.shake(array1)));
    }

    @DisplayName("Метод sort. Массив {1,1,1,1}")
    @Test
    public void sort3(){
        int[] array1 = {1, 1, 1, 1};
        Assertions.assertEquals("[1, 1, 1, 1]", Arrays.toString(SortUtils.sort(array1)));
    }

    @DisplayName("Метод shake. Массив {1,1,1,1}")
    @Test
    public void sort4(){
        int[] array1 = {1, 1, 1, 1};
        Assertions.assertEquals("[1, 1, 1, 1]", Arrays.toString(SortUtils.shake(array1)));
    }

    @DisplayName("Метод sort. Массив {9,1,5,99,9,9}")
    @Test
    public void sort5(){
        int[] array1 = {9,1,5,99,9,9};
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", Arrays.toString(SortUtils.sort(array1)));
    }

    @DisplayName("Метод shake. Массив {9,1,5,99,9,9}")
    @Test
    public void sort6(){
        int[] array1 = {9,1,5,99,9,9};
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", Arrays.toString(SortUtils.shake(array1)));
    }

    @DisplayName("Метод sort. Массив {}")
    @Test
    public void sort7(){
        int[] array1 = {};
        Assertions.assertEquals("[]", Arrays.toString(SortUtils.sort(array1)));
    }

    @DisplayName("Метод shake. Массив {}")
    @Test
    public void sort8(){
        int[] array1 = {};
        Assertions.assertEquals("[]", Arrays.toString(SortUtils.shake(array1)));
    }

    @DisplayName("Метод sort. Массив {6,5,4,3,2,1}")
    @Test
    public void sort9(){
        int[] array1 = {6,5,4,3,2,1};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortUtils.sort(array1)));
    }

    @DisplayName("Метод shake. Массив {6,5,4,3,2,1}")
    @Test
    public void sort10(){
        int[] array1 = {6,5,4,3,2,1};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortUtils.shake(array1)));
    }
}
