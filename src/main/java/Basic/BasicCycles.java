package Basic;

/**
 * 1. Basic of software code development
 * Циклы
 */

public class BasicCycles {

    /**
     * № 1.
     * Напишите программу, где пользватель вводит любое положительное число. А программа суммирует
     * все числа от 1 до введённого пользвателем числа.
     *
     * @param x argument
     * @return factorial
     * @cpu O(x), x - the number up to which the factorial is calculator
     * @ram O(1)
     */
    public static int calcFactorial(int x) {
        int  factorial = 0;
        for (int i = 1; i <= x; i++) {
            factorial += i;
        }
        return factorial;
    }
}
