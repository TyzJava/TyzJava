package Basic.Linage;

public class BasicLinage {

    public static double valueOfFunctionZ(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public static double valueOfFunctionWithDouble(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static double valueOfFunctionSinCosTg(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

    public static double swapping(double r) {
        int n = (int) r;
        double m = r - n;
        return (int) (m * 1000) + (double) n / 1000;
    }
}
