package Basic.Linage;

public class BasicLinage {

    public static double valueOfFunctionZ(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public static double valueOfFunctionWithDouble(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
