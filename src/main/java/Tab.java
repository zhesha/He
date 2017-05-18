import java.text.DecimalFormat;

import static java.lang.Math.cos;

/**
 * Created by sashaz on 17.05.17
 */
public class Tab {
    public static void main(String[] args) {
        System.out.println("Function f(x)=2cos(x)+cos(2x) have values:");
        for (double i = 0; i <= 5; i += 0.5) {
            System.out.println("for x=" + new DecimalFormat("0.0").format(i) + " values is: " + new DecimalFormat("0.##").format(calculate(i)));
        }
    }

    static double calculate(double x) {
        return 2 * cos(x) + cos(2 * x);
    }
}
