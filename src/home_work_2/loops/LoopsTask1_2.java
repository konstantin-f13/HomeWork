package home_work_2.loops;

/*    1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести
ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что
пользователь ввёл некорректные данные.*/

public class LoopsTask1_2 {
    public static void main(String[] args) {
        String strNum = args[0];
        System.out.println(loopsTask1_2(strNum));
    }

    public static String loopsTask1_2(String strNum){
        boolean onlyDigits = strNum.matches("\\d+");
        boolean nonIntNumber = strNum.matches("\\d+[.]\\d+");
        boolean notNumber = strNum.matches("\\D+");
        long digitsMultiplication = 1;

        if (onlyDigits) {
            String strResult = "Заданное через аргумент к программе целое число = " + strNum;
            strResult += "\n" + "Произведение всех цифр заданного числа: " + "\n";

            for (int i = 0; i < strNum.length(); i++) {
                strResult += strNum.charAt(i);
                digitsMultiplication = digitsMultiplication * Character.getNumericValue(strNum.charAt(i));

                if (i != (strNum.length() - 1)){
                    strResult += " * ";
                }
            }

            strResult += " = " + digitsMultiplication;
            return strResult;
        } else if (nonIntNumber) {
            return "Введено нецелое число.";
        } else if (notNumber) {
            return "Введено не число, а вообще что-то другое";
        } else {
            return "Другая ошибка";
        }
    }
}