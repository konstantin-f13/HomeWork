package home_work_1;


public class CreatePhoneNumberMain {
    public static void main(String[] args) {
        int[] myArray = {5, 4, 7, 6, 1, 0, 3, 2, 5, 9};
        System.out.println("Массив в первоначальном виде:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Номер телефона в отформатированном виде:");
        System.out.println(createPhoneNumber(myArray));
    }
    static String createPhoneNumber(int[] phoneNumber){
        return "(" + phoneNumber[0] + phoneNumber[1] + phoneNumber[2] + ") " + phoneNumber[3] + phoneNumber[4] + phoneNumber[5] + "-" + phoneNumber[6] + phoneNumber[7] + phoneNumber[9];
    }
}
