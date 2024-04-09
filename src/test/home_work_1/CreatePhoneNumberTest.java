package test.home_work_1;

import home_work_1.CreatePhoneNumberMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreatePhoneNumberTest {
    @DisplayName("CreatePhoneNumberTest 10 digits")
    @Test
    public void createPhoneNumber1(){
        int[] myArray = {5, 4, 7, 6, 1, 0, 3, 2, 5, 9};
        Assertions.assertEquals("(547) 610-329", CreatePhoneNumberMain.createPhoneNumber(myArray));
    }

}
