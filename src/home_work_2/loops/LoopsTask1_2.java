package home_work_2.loops;

/*    1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести
ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что
пользователь ввёл некорректные данные.*/

public class LoopsTask1_2 {
    public static void main(String[] args) {

        String strNum = args[0];
        boolean onlyDigits = strNum.matches("\\d+");
        boolean nonIntNumber = strNum.matches("\\d+[.]\\d+");
        boolean notNumber = strNum.matches("\\D+");
        long digitsMultiplication = 1;

        if (onlyDigits) {
            System.out.println("Заданное через аргумент к программе целое число = " + strNum);
            System.out.print("Произведение всех цифр заданного числа = ");

            for (int i = 0; i < strNum.length(); i++) {
                System.out.print(strNum.charAt(i) + " * ");
                digitsMultiplication = digitsMultiplication * Character.getNumericValue(strNum.charAt(i));
            }

            System.out.println("\b\b" + "= " + digitsMultiplication);
        } else if (nonIntNumber) {
            System.out.println("Введено нецелое число.");
        } else if (notNumber) {
            System.out.println("Введено не число, а вообще что-то другое");
        } else {
            System.out.println("Другая ошибка");
        }
    }
}