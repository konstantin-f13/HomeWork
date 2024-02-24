package home_work_2.loops;

import java.util.Scanner;

public class LoopsTask1_3 {
    public static void main(String[] args) {
        String strNum;
        String strPower;
        float num;
        long power;
        Scanner console = new Scanner(System.in);

        System.out.println("Введите возводимое в степень число (целое или дробное, положительное или отрицательное)");
        strNum = console.next();
        boolean ifPosNegIntNonInt = strNum.matches("-?\\d+(\\.\\d+)?");//matches to positive, negative, integral and non-integral numbers

        if (ifPosNegIntNonInt){
            num = Float.parseFloat(strNum);
            System.out.println("Введите положительное и целое число степени");
            strPower = console.next();
            boolean ifPosIntegral = strPower.matches("\\d+");//matches only to positive integral numbers

            if (ifPosIntegral) {
                power = Long.parseLong(strPower);
                float result = 1;
                int count = 1;
                while (count <= power){
                    result = result * num;
                    count++;
                }
                System.out.println("Результат: " + num + " ^ " + power + " = " + result);

            } else {
                System.out.println("Вы ввели значение степени, не соответствующее запрошенным параметрам");
                return;
            }
        } else {
            System.out.println("Вы ввели значение, не соответствующее запрошенным параметрам");
            return;
        }
    }
}
