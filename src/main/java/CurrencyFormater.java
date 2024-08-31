import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormater {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(payment);
        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.of("en", "IN"));
        String india = n1.format(payment);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " +india);
        System.out.println("China: " + china);
        System.out.println("France: " +france);
    }
}