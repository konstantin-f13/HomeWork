package test.home_work_2;

import home_work_2.arrays.ArrayRandomMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayRandomMainTest {
    @Test
    public void testArrayPrint(){
        int[] container = {1, 2, 3, 5};
        Assertions.assertEquals("1 2 3 5 ", ArrayRandomMain.arrayPrint(container));
    }

    @Test
    public void testArrayPrint2(){
        int[] container = {};
        Assertions.assertEquals("", ArrayRandomMain.arrayPrint(container));
    }
}
