package home_work_1;

public class MathLibraryPracticeMain {
    public static void main(String[] args) {

        double a = -505.3324324;
        double b;
        b = Math.abs(a);
        System.out.println("Значение числа a по модулю = " + a);
        System.out.println("Значение числа b по модулю = " + b);//Returns the absolute value of a double value a.
        System.out.println("Вычисленное значение синуса угла a = " + Math.sin(Math.toRadians(a)));
        System.out.println("Вычисленное значение синуса угла b = " + Math.sin(Math.toRadians(b)));/*Вычисление значения
        синуса угла, указанного в радианах. Math.toRadians - перевод градусов в радианы.*/
        System.out.println("Вычисление ulp - дистанции между значением и ближайшим большим значением = " + Math.ulp(b));

        double c = 12;
        double d = 2;
        System.out.println("Возведение числа c в степень d = " + Math.pow(c, d));
        System.out.println("Вычисление минимального из двух значений = " + Math.min(c, d));
        System.out.println("Вычисление минимального из двух значений = " + Math.max(c, d));

        double e = 5.6;
        System.out.println("Наименьшее целое число, которое >= e = " + Math.ceil(e));
        System.out.println("Наибольшее целое число, которое <= e = " + Math.floor(e));
        System.out.println("Округление в большую сторону до ближайшего целого = " + Math.round(e));
        System.out.println("Возвращение ближайшего к первому аргументу значения в направлении указанного 2-го аргумента = " + Math.nextAfter(e, 3));
        System.out.println("Возвращение ближайшего к аргументу значения в положительном направлении = " + Math.nextUp(e));
        System.out.println("Возвращение ближайшего к аргументу значения в отрицательном направлении = " + Math.nextDown(e));
        System.out.println("Возвращение ближайшего целого к аргументу = " + Math.rint(e));
        System.out.println("Возвращение рандомного числа, >=0 и <1: " + Math.random());
        System.out.println("Вычисление квадратного корня числа 9 = " + Math.sqrt(9)); //3.0
        System.out.println("Вычисление квадратного корня числа 144 = " + Math.sqrt(144)); //12.0

    }

}
