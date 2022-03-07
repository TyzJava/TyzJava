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

    /**
     * № 3.
     * Найти сумму квадратов первых ста чисел.
     *
     * @return sum of Squares of the first hundred digits
     * @cpu O(1)
     * @ram O(1)
     */
    public static int sumSquares() {
        int sum = 1;
        for (int i = 2; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    /**
     * № 4.
     * Составить программу нахождения произведения квадратов первых двухсот чисел.
     *
     * @return product of squares of the first two hundred digits
     * @cpu O(1)
     * @ram O(1)
     */
    public static int productSquares() {
        int product = 1;
        for (int i = 2; i <= 200; i++) {
            product += Math.pow(i, 2);
        }
        return product;
    }

    /**
     * № 5.
     * Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше
     * или равен заданному e. Общий член ряда:
     * a(n) = 1 / 2^n + 1 / 3^n
     *
     * @param n number of members
     * @param e number by which the moduli of the members of the series are equal
     * @return sum of members
     * @cpu O(n), n - number of member
     * @ram O(1)
     */
    public static double sumMembers(int n, double e) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double member = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(member) >= e) {
                sum += member;
            }
        }
        return sum;
    }
}
