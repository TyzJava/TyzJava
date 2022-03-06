package Basic;

/**
 * 1. Basic of software code development
 * Ветвления
 */
public class BasicBranching {

    /**
     * № 1.
     * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
     * то будет ли он прямоугольным
     * @param x first corner
     * @param y second corner
     * @return Triangle not exist, Triangle exists - rectangular or Triangle exist - not rectangular
     * @cpu O(1)
     * @ram O(1)
     */
    public static String existenceTriangle(double x, double y) {
        double z = 180 - x - y;
        String result;
        if (x > 0 && y > 0 && z > 0) {
            result = "Triangle exist";
            if (x == 90 || y == 90 || z == 90) {
                return result + " - rectangular";
            } else {
                return result + " - not rectangular";
            }
        } else {
            return "Triangle not exist";
        }
    }

    /**
     * № 2.
     * Найти max{min(a, b), min(c, d)}
     *
     * @param a argument
     * @param b argument
     * @param c argument
     * @param d argument
     * @return maximum value of two minimum values
     * @cpu O(1)
     * @ram O(1)
     */
    public static double maxOfMin(double a, double b, double c, double d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }

    /**
     * № 3.
     * Даны три точки A(x1, y1), B(x2, y2), C(x3, y3). Определить, будут ли они расположены
     * на одной прямой.
     *
     * @param x1 argument
     * @param y1 argument
     * @param x2 argument
     * @param y2 argument
     * @param x3 argument
     * @param y3 argument
     * @return tru if points are lie on the same line and false if points are not lie on the same line.
     */
    public static boolean positionLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (x2 - x1) / (x3 - x1) == (y2 - y1) / (y3 - y1);
    }
}
