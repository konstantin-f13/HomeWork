package home_work_1;

public class OperatorsPriorityMain {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int result;
        result = a + b / c;
        System.out.println("Выражение 2.1 \n" + "Результат вычисления '5 + 2 / 8'= " + result);
        /*Результат вычисления равен 5, так как бинарный оператор сложения ниже по приоритету,
        чем оператор умножения.
        * */

        result = (a + b) / c;
        System.out.println("Выражение 2.2 \n" + "Результат вычисления '(5 + 2) / 8'= " + result);
        /*Результат вычисления равен 0, так как parentheses () имеет наивысший приоритет, а далее
        выполняется оператор деления. Отображается 0, так как реальный результат 0.875 при записи
        в переменную типа int, число округляется до целого в меньшую сторону.
        * */

        result = (a + b++) / c;
        System.out.println("Выражение 2.3 \n" + "Результат вычисления '(5 + 2) / 8'= " + result);
        /*Результат вычисления равен 0, так как parentheses () имеет наивысший приоритет, далее
        отрабатывает пост-инкремент - к переменной a = 5 прибавляется значение переменной b = 2.
        После этого значение операнда b увеличивается на 1. В заключение, выполняется оператор
        деления. Результат в консоли отображается как 0, так как реальный результат 0.875 при
        записи в переменную типа int, число округляется до целого в меньшую сторону.
        * */










    }
}
