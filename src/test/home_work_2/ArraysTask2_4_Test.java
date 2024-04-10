package test.home_work_2;

import home_work_2.arrays.ArraysTask2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraysTask2_4_Test {

    @DisplayName("sumEvenPositiveElements")
    @Test
    public void sumEvenPositiveElements(){
        int[] array = {-22, 44, -94, 55, -89, 35, 65, 62, 9, -58, -58, 92, -64, 74, 24, -8, -15, -84, -13, 54, -10, 48, -17, 66, 86, -89, -11, 88, 52, 57, -88, -28, -12, 45, -66, 90, -65, 98, -2, 18, -60, 7, -3, -7, 20, 31, 74, -19, 85, 70};
        Assertions.assertEquals("Чётные положительные элементы:44 62 92 74 24 54 48 66 86 88 52 90 98 18 20 74 70 \n" +
                "Сумма чётных положительных элементов= 1060\n", ArraysTask2_4.sumEvenPositiveElements(array));
    }

    @DisplayName("maxElWithEvenArrayIndex")
    @Test
    public void maxElWithEvenArrayIndex(){
        int[] array = {22, 44, 94, 55, 89, 35, 65, 62, 9, 58, 58, 92, 64, 74, 24, 8, 15, 84, 13, 54, 10, 48, 17, 66, 86, 89, 11, 88, 52, 57, 88, 28, 12, 45, 66, 90, 65, 98, 2, 18, 60, 7, 3, 7, 20, 31, 74, 19, 85, 70};
        Assertions.assertEquals(94, ArraysTask2_4.maxElWithEvenArrayIndex(array));
    }

    @DisplayName("elemLessThanAverage")
    @Test
    public void elemLessThanAverage(){
        int[] array = {22, 44, 94, 55, 89, 35, 65, 62, 9, 58, 58, 92, 64, 74, 24, 8, 15, 84, 13, 54, 10, 48, 17, 66, 86, 89, 11, 88, 52, 57, 88, 28, 12, 45, 66, 90, 65, 98, 2, 18, 60, 7, 3, 7, 20, 31, 74, 19, 85, 70};
        Assertions.assertEquals("22 44 35 9 24 8 15 13 10 17 11 28 12 45 2 18 7 3 7 20 31 19 ", ArraysTask2_4.elemLessThanAverage(array));
    }

    @DisplayName("twoMinElements")
    @Test
    public void twoMinElements(){
        int[] array = {22, 44, 94, 55, 89, 35, 65, 62, 9, 58, 58, 92, 64, 74, 24, 8, 15, 84, 13, 54, 10, 48, 17, 66, 86, 89, 11, 88, 52, 57, 88, 28, 12, 45, 66, 90, 65, 98, 2, 18, 60, 7, 3, 7, 20, 31, 74, 19, 85, 70};
        Assertions.assertEquals("\n" +
                "Two found minimal elements are: \n" +
                "3 and 2\n", ArraysTask2_4.twoMinElements(array));
    }

    @DisplayName("arrayCompressionByDeletionOfElements")
    @Test
    public void arrayCompressionByDeletionOfElements(){
        int[] array = {22, 44, 94, 55, 89, 35, 65, 62, 9, 58, 58, 92, 64, 74, 24, 8, 15, 84, 13, 54, 10, 48, 17, 66, 86, 89, 11, 88, 52, 57, 88, 28, 12, 45, 66, 90, 65, 98, 2, 18, 60, 7, 3, 7, 20, 31, 74, 19, 85, 70};
        Assertions.assertEquals("Compressed array:94 55 89 65 62 9 58 58 92 64 74 8 84 54 66 86 89 88 52 57 88 66 90 65 98 2 60 7 3 7 74 85 70 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ", ArraysTask2_4.arrayCompressionByDeletionOfElements(array, 10, 50));
    }

    @DisplayName("sumOfDigitsOfTheWholeArray")
    @Test
    public void sumOfDigitsOfTheWholeArray() {
        int[] array = {22, 44, 94, 55, 89, 35, 65, 62, 9, 58, 58, 92, 64, 74, 24, 8, 15, 84, 13, 54, 10, 48, 17, 66, 86, 89, 11, 88, 52, 57, 88, 28, 12, 45, 66, 90, 65, 98, 2, 18, 60, 7, 3, 7, 20, 31, 74, 19, 85, 70};
        Assertions.assertEquals(460, ArraysTask2_4.sumOfDigitsOfTheWholeArray(array));
    }

}
