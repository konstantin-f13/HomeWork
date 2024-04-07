package test.home_work_1;

import home_work_1.OperatorsPriorityMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperatorsPriorityTest {

    /**
     * Выражение '5 + 2 / 8'
     * Результат вычисления равен 5, так как бинарный оператор сложения ниже по приоритету, чем оператор умножения.
     * Результат округлен в меньшую сторону до целого числа при записи в переменную типа int
     */
    @DisplayName("Checks priority of addition and subtraction operators.")
    @Test
    public void testPriorityEx_2_1(){
        double result = OperatorsPriorityMain.expression_2_1(5, 2, 8);
        Assertions.assertEquals(5, result);
    }

    /**
     * Выражение '(5 + 2) / 8'
     * Результат вычисления равен 0, так как parentheses () имеет наивысший приоритет, сначалавыполняется сложение в
     * скобках, а далее выполняется оператор деления. "Отображается 0, так как реальный результат 0.875 при записи в
     * переменную типа int, число округляется до целого в меньшую сторону.
     */
    @DisplayName("Checks priority of addition, subtraction and brackets.")
    @Test
    public void testPriorityEx_2_2(){
        double result = OperatorsPriorityMain.expression_2_2(5, 2, 8);
        Assertions.assertEquals(0, result);
    }

    /**
     * Выражение '(5 + 2++) / 8'
     * Результат вычисления равен 0, так как parentheses () имеет наивысший приоритет, далее отрабатывает пост-инкремент
     * - к переменной a = 5 прибавляется значение переменной b = 2. После этого значение операнда b увеличивается на 1.
     * В заключение, выполняется оператор деления. Результат в консоли отображается как 0, так как реальный результат
     * 0.875 при записи в переменную типа int, число округляется до целого в меньшую сторону.
     */
    @DisplayName("Checks priority of addition, subtraction, Unary Post Increment and brackets.")
    @Test
    public void testPriorityEx_2_3(){

        double result = OperatorsPriorityMain.expression_2_3(5, 2, 8);
        Assertions.assertEquals(0, result);
    }

    /**
     * Выражение '(5 + 2++) / --8'
     * "Результат вычисления равен 1, так как parentheses () имеет наивысший приоритет, т. е. сначала вычисляется то,
     * что в скобках. При этом в скобках сначала отрабатывает пост-инкремент к переменной a = 5 прибавляется значение
     * переменной b = 2, т. е. 5 + 2 = 7. После этого значение операнда b увеличивается на 1. Далее отрабатывает
     * пост-декремент для переменной c - её значение уменьшается на 1 до 7, и уже после этого выполняется деление 7/7,
     * что даёт 1.
     */
    @DisplayName("Checks priority of addition, Unary Post Increment, division,  Unary Post Decrement and brackets.")
    @Test
    public void testPriorityEx_2_4(){
        double result = OperatorsPriorityMain.expression_2_4(5, 2, 8);
        Assertions.assertEquals(1, result);
    }

    /**
     * Выражение '(5 * 2 >> 2++) / --8'
     * Результат вычисления равен нулю, так как дробное число было округлено в меньшую сторону до нуля.
     * Parentheses () имеет наивысший приоритет, т. е. сначала вычисляется то, что в скобках.Следующие приоритеты
     * имеют операции умножения, затем сдвига. Ход вычислений:
     * 1. Пост-инкремент для b, фиксируется значение 2 для следующей операции с этой переменной, а для последующих
     * операций фиксируется b = b + 1 = 3;
     * 2. Умножение a * b даёт 5 * 2 = 10.
     * 3. Далее сдвиг для числа 10 на b = 2, зафиксированного на шаге 1. Число 10 в двоичной системе 1010. Сдвиг на 2
     * бита вправо даёт 0010, что в десятичной системе = 2.
     * 4. Пре-декремент переменной c, c = c - 1 = 7.
     * 5. Выполняется деление 2 на 7 = 0.2857... , что при округлении до целого в меньшую сторону даёт 0.
     */
    @DisplayName("Checks priority of multiplication, Unary Post Increment, Unary Post Decrement, division, Bitwise Right Shift, brackets.")
    @Test
    public void testPriorityEx_2_5(){
        double result = OperatorsPriorityMain.expression_2_5(5, 2, 8);
        Assertions.assertEquals(0, result);
    }

    /**
     * Выражение '(5 + 7 > 20 ? 68 : 22 * 2 >> 2++)/ --8'
     * 1. Пост инкремент b++ = 2 + 1 = 3. При этом для последующей операции сдвига фиксируем число 2.
     * 2. Умножаем g * b = 22 * 2 = 44.
     * 3. Делаем сдвиг на 2 бита вправо (2 с шага 1), 00101100>>2 = 00001011 = 11.
     * 4. Складываем a + d (условие тернарного оператора). a + d = 5 + 7 = 12.
     * 5. Получаем следующее выражение: (12 > 20 ? 68 : 11 )/ --8.
     * 6. Далее выполняем тернарный оператор: 11 / --8
     * 7. Пре-декремент для 8 = 7.
     * 8. 11 / 7 = 1,57.
     */
    @DisplayName("Checks priority of addition, greater than, Ternary Conditional, multiplication, Bitwise Right Shift, Unary Post Increment, Unary Post Decrement, brackets")
    @Test
    public void testPriorityEx_2_6(){
        double result = OperatorsPriorityMain.expression_2_6(5, 2, 8, 7,20,68,22);
        Assertions.assertEquals(1, result);
    }

    /**
     * Выражение '6 - 2 > 3 && 12 * 12 <= 119'
     * Полученный результат: false.
     * 1. Вначале выполняем умножение, которое являеется оператором с наивысшим в данном выражении приоритетом.
     * 12 * 12 = 144.
     * 2. Далее следует вычитание: 6 - 2 = 4.
     * 3. Имеем следующее: 4 > 3 && 144 <= 119;
     * Выполняем операторы сравнения, сначала левое, затем правое (according to the Associativity rule left-to-right)
     * 4. Получаем true && false = false.
     */
    @DisplayName("Checks priority of subtraction, greater than, &&, multiplication, less than")
    @Test
    public void testPriorityEx_2_8(){
        boolean result = OperatorsPriorityMain.expression_2_8(6,2,3,12,119);
        Assertions.assertEquals(false, result);
    }

    /**
     * Полученный результат: false. Требуется единственный логический оператор AND.
     */
    @DisplayName("Checks work of boolean operator &&")
    @Test
    public void testPriorityEx_2_9(){
        boolean result = OperatorsPriorityMain.expression_2_9();
        Assertions.assertEquals(false, result);
    }
}
