package home_work_2.loops;

/*
1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.

Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
*/

public class LoopsTask1_1 {
    public static void main(String[] args) {

        String str = args[0];
        int givenValue = Integer.parseInt(str, 10);
        System.out.println("Заданное число=" + givenValue);
        System.out.println(loopsTask1_1(givenValue));
    }

    public static String loopsTask1_1(int givenValue){
        long result = 1;
        String strResult = "";

        for (int i = 1; i <= givenValue ; i++) {
                result = result * i;
                strResult += i;
                if (i < givenValue){
                    strResult += " * ";
                }

            if (result < 0) {
                return "Ошибка. Результат произведения превысил максимальное значения типа long";
            }
        }
        return strResult + " = " + result;
    }
}