import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);



        Scanner sc = new Scanner(System.in);

        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        converter.setDollarPrice(sc.nextDouble());

        System.out.println("How many Dollars will be bought?");
        converter.setBoughtDollar(sc.nextDouble());

        System.out.printf("Amount to be paid in Reais %.2f", converter.calculator());

        sc.close();

    }
}