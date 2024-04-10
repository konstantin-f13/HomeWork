package test.home_work_2;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class ArraysUtilsTest {

    @DisplayName("arrayRandom test - array size, maxValue")
    @Test
    public void testArrayRandom(){
        int[] array = ArraysUtils.arrayRandom(2,100);
        Assertions.assertEquals(2, array.length);
        for (int i = 0; i < array.length; i++) {
            Assertions.assertTrue(array[i] <= 100);
        }
    }
}
