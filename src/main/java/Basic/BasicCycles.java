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

    /**
     * № 2.
     * Вычислить значения функции на отрезке [a, b] с шагом h:
     * y = x, x > 2,
     * y = - x, x <= 2
     *
     * @param a begin of segment
     * @param b end of segment
     * @param h step of values
     * @return values of function on the segment
     * @cpu O(log n), n - difference of end of segment and begin of segment
     * @ram O(log n), n - difference of end of segment and begin of segment
     */
    public static double[] calcValuesOnSegment(double a, double b, double h) {
        int n = (int) ((b - a) / h) + 1;
        double[] values = new double[n];
        int j = 0;
        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                values[j] = i;
            } else {
                values[j] = -i;
            }
            j++;
        }
        return values;
    }
}
