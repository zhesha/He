import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sashaz on 18.05.17
 */
class TabTest {

    @Test
    void constructor() {
        new Tab();
    }

    @Test
    void main() {
        Tab.main(new String[]{});
    }

    @Test
    void printFunctionTabulation() {
        PrintStreamMock printer = new PrintStreamMock(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            }
        });

        Tab.printFunctionTabulation(printer);
        assertEquals("" +
                "Function f(x)=2cos(x)+cos(2x) have values:" +
                "for x=0,0 values is: 3" +
                "for x=0,5 values is: 2,3" +
                "for x=1,0 values is: 0,66" +
                "for x=1,5 values is: -0,85" +
                "for x=2,0 values is: -1,49" +
                "for x=2,5 values is: -1,32" +
                "for x=3,0 values is: -1,02" +
                "for x=3,5 values is: -1,12" +
                "for x=4,0 values is: -1,45" +
                "for x=4,5 values is: -1,33" +
                "for x=5,0 values is: -0,27",

                printer.buffer
        );
    }

    @Test
    void calculate() {
        assertEquals(3, Tab.calculate(0));
    }

    private class PrintStreamMock extends PrintStream {
        String buffer = "";

        PrintStreamMock(OutputStream out) {
            super(out);
        }

        public void println(String x) {
            buffer += x;
        }
    }
}