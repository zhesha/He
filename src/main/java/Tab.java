import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static java.lang.Math.cos;

/**
 * Created by sashaz on 17.05.17
 */
public class Tab {
    private static final double FROM = 0;
    private static final double TO = 5;
    private static final double STEP = 0.5;
    private static final String HEADER = "Function f(x)=2cos(x)+cos(2x) have values:";

    public static void main(String[] args) {
        printFunctionTabulation(System.out);
    }

    static void printFunctionTabulation(PrintStream printer) {
        DecimalFormatSymbols decimalSymbols = new DecimalFormatSymbols();
        decimalSymbols.setDecimalSeparator(',');
        DecimalFormat formatterForX = new DecimalFormat("0.0", decimalSymbols);
        DecimalFormat formatterForValue = new DecimalFormat("0.##", decimalSymbols);
        String formattedX;
        String formattedValue;

        printer.println(HEADER);
        for (double i = FROM; i <= TO; i += STEP) {
            formattedX = formatterForX.format(i);
            formattedValue = formatterForValue.format(calculate(i));
            printer.println("for x=" + formattedX + " values is: " + formattedValue );
        }
    }

    static double calculate(double x) {
        return 2 * cos(x) + cos(2 * x);
    }
}
