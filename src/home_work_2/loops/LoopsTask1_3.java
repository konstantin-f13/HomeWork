package home_work_2.loops;

/*
1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
        1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
        1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
*/


import java.util.Scanner;

public class LoopsTask1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите возводимое в степень число (целое или дробное, положительное или отрицательное)");
        String strNum;
        strNum = console.next();
        System.out.println("Введите положительное и целое число степени");
        String strPower;
        strPower = console.next();
        System.out.println(loopsTask1_3(strNum, strPower));
    }

    public static String loopsTask1_3(String strNum, String strPower){
        float num;
        long power;
        boolean ifPosNegIntNonInt = strNum.matches("-?\\d+(\\.\\d+)?");//matches to positive, negative, integral and non-integral numbers
        boolean ifPosIntegral = strPower.matches("\\d+");//matches only to positive integral numbers

        if (ifPosNegIntNonInt){
            num = Float.parseFloat(strNum);

            if (ifPosIntegral) {
                power = Long.parseLong(strPower);
                float result = 1;
                int count = 1;
                while (count <= power){
                    result = result * num;
                    count++;
                }
                return "Результат: " + num + " ^ " + power + " = " + result;

            } else {
                return "Вы ввели значение степени, не соответствующее запрошенным параметрам";
            }
        } else {
            return "Вы ввели значение, не соответствующее запрошенным параметрам";
        }
    }
}