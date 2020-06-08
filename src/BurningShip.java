import java.awt.geom.Rectangle2D;

public class BurningShip extends FractalGenerator{

    public static final int MAX_ITERATIONS = 2000;

    public void getInitialRange(Rectangle2D.Double range) {
        range.setRect(-2, -2.5, 4,4);
    }

    public int numIterations(double x, double y) {
        Complex z = new Complex(0, 0);
        Complex c = new Complex(x, y);
        double realTemp;
        for (int IterNum = 0; IterNum < MAX_ITERATIONS; IterNum++) {
            realTemp = z.real*z.real - z.imag*z.imag + x;
            z.imag = Math.abs(2*z.real*z.imag + y); // abs returns the absolute value
            z.real = Math.abs(realTemp);
            if (z.abs() > 4) return IterNum;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Burning Ship";
    }
}
