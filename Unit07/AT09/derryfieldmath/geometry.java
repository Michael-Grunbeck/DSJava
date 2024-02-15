package derryfieldmath;

public class geometry {
    public static double calcvolumeofsphere(double r) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return volume;
    }

    public static double calcSurfaceareaofaSphere(double r) {
        double surface = 4 * Math.PI * Math.pow(r, 2);
        return surface;
    }
}
