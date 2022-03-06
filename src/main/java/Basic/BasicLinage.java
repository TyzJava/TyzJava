package Basic;

/**
 * 1. Basic of software code development
 * Линейные программы
 */
public class BasicLinage {

    /**
     * № 1.
     * Найдите значение функции: z = ((a - b) * b / 2) + c.
     *
     * @param a argument
     * @param b argument
     * @param c argument
     * @return z
     * @cpu O(1)
     * @ram O(1)
     */
    public static double valueOfFunctionZ(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    /**
     * № 2.
     * Вычислить значение выраженрия по формуле (все переменные принимают действительные значения):
     *
     * @param a argument
     * @param b argument
     * @param c argument
     * @return expression value
     * @cpu O(1)
     * @ram O(1)
     */
    public static double valueOfFunctionWithDouble(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    /**
     * № 3.
     * Вычислить значение выраженрия по формуле (все переменные принимают действительные значения):
     *
     * @param x argument
     * @param y argument
     * @return expression value
     * @cpu O(1)
     * @ram O(1)
     */
    public static double valueOfFunctionSinCosTg(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

    /**
     * № 4.
     * Дано дейтвительное число R вида nnn.ddd (три цифровых ряда в дробной и целой частях).
     * Поменять местами дробную и целую части числа и вывести полученное значение числа.
     *
     * @param r number
     * @return modified number
     * @cpu O(1)
     * @ram O(1)
     */
    public static double swapping(double r) {
        int n = (int) r;
        double m = r - n;
        return (int) (m * 1000) + (double) n / 1000;
    }

    /**
     * № 5.
     * Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
     * Вывести данное значение длительности в часах, минутах и в секндах в следующей форме:
     * HHч MMмин SSс.
     *
     * @param seconds number seconds
     * @return time in a given form
     * @cpu O(1)
     * @ram O(1)
     */
    public static String conversionToHorse(int seconds) {
        int minutes = seconds / 60;
        seconds %= 60;
        int horses = minutes / 60;
        minutes %= 60;
        return horses + "ч " + minutes + "мин " + seconds + "с";
    }

    /**
     * № 6.
     * Для данной области составить линейную программу, которая печатает true, если точка
     * с координатами (x, y) принадлежит к закреплённой области, и false - в противном случае.
     * y = [-3, 0) => x = [-4, 4]
     * y = [0, 4] => x = [-2, 2]
     *
     * @param x abscissa
     * @param y ordinate
     * @return true if the coordinate belongs to the specified region, false if it does not
     * @cpu O(1)
     * @ram O(1)
     */
    public static boolean definesBelonging(double x, double y) {
        if (y < -3 || y > 4) {
            return false;
        } else if (y >= -3 && y < 0 && (x < -4 || x > 4)) {
            return false;
        } else {
            return !(x < -2) && !(x > 2);
        }
    }
}
