package home_work_2.loops;

public class LoopsTask1_1 {
    public static void main(String[] args) {

        String str = args[0];
        int givenValue = Integer.parseInt(str, 10);
        System.out.println("Заданное число=" + givenValue);
        long result = 1;

        for (int i = 1; i <= givenValue ; i++) {
            result = result * i;
            if (result < 0) {
                System.out.println("Ошибка. Результат произведения превысил максимальное значения типа long");
                return;
            }
        }
        System.out.println("Результат умножения всех чисел от 1 до заданного числа " + givenValue + " = " + result);
    }
}
