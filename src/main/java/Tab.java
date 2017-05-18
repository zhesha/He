import static java.lang.Math.cos;

/**
 * Created by sashaz on 17.05.17
 */
public class Tab {
    public static void main(String[] args) {
        System.out.println("Function f(x)=2cos(x)+cos(2x) have values:");
        for (float i = 0; i <= 5; i += 0.5) {
            System.out.println("for x="+i+" values is: "+(2*cos(i)+cos(2*i)));
        }
    }
}
