package home_work_1;

public class MathLibraryPracticeMain {
    public static void main(String[] args) {

        double a = -505.3324324;
        double b = absValue(a);

        System.out.println("Значение числа a по модулю = " + absValue(a));//Returns the absolute value of a double value a.
        System.out.println("Вычисленное значение синуса угла a = " + sinCalculation(a));
        System.out.println("Вычисленное значение синуса угла b = " + sinCalculation(b));/*Вычисление значения
        синуса угла, указанного в радианах. Math.toRadians - перевод градусов в радианы.*/
        System.out.println("Вычисление ulp - дистанции между значением и ближайшим большим значением = " + ulpCalculation(b));

        double c = 12;
        double d = 2;
        System.out.println("Возведение числа c в степень d = " + powMethod(c, d));
        System.out.println("Вычисление минимального из двух значений = " + minMethod(c, d));
        System.out.println("Вычисление минимального из двух значений = " + maxMethod(c, d));

        double e = 5.6;
        System.out.println("Наименьшее целое число, которое >= e = " + ceilMethod(e));
        System.out.println("Наибольшее целое число, которое <= e = " + floorMethod(e));
        System.out.println("Округление в большую сторону до ближайшего целого = " + roundMethod(e));
        System.out.println("Возвращение ближайшего к первому аргументу значения в направлении указанного 2-го аргумента = " + nextAfterMethod(e, 3));
        System.out.println("Возвращение ближайшего к аргументу значения в положительном направлении = " + nextUpMethod(e));
        System.out.println("Возвращение ближайшего к аргументу значения в отрицательном направлении = " + nextDownMethod(e));
        System.out.println("Возвращение ближайшего целого к аргументу = " + rintMethod(e));
        System.out.println("Возвращение рандомного числа, >=0 и <1: " + randomMethod());
        System.out.println("Вычисление квадратного корня числа 9 = " + sqrtMethod(9)); //3.0
        System.out.println("Вычисление квадратного корня числа 144 = " + sqrtMethod(144)); //12.0
    }

    public static double absValue(double a){
        return Math.abs(a);
    }

    public static double sinCalculation(double a){
        return Math.sin(Math.toRadians(a));
    }

    public static double ulpCalculation(double a){
        return Math.ulp(a);
    }

    public static double powMethod(double c, double d){
        return Math.pow(c, d);
    }

    public static double minMethod(double c, double d){
        return Math.min(c, d);
    }

    public static double maxMethod(double c, double d){
        return Math.max(c, d);
    }

    public static double ceilMethod(double e){
        return Math.ceil(e);
    }

    public static double floorMethod(double e){
        return Math.floor(e);
    }

    public static double roundMethod(double e){
        return Math.round(e);
    }

    public static double nextAfterMethod(double e, double direction){
        return Math.nextAfter(e, direction);
    }

    public static double nextUpMethod(double e){
        return Math.nextUp(e);
    }

    public static double nextDownMethod(double e){
        return Math.nextDown(e);
    }

    public static double rintMethod(double e){
        return Math.rint(e);
    }

    public static double randomMethod(){
        return Math.random();
    }

    public static double sqrtMethod(double e){
        return Math.sqrt(e);
    }
}
