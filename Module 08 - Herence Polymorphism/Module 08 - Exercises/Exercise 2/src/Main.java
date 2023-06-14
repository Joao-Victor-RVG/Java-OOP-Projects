import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Product data #" + i + ":");
            System.out.println("Common, used or imported (c/u/i)?");
            char type = sc.next().charAt(0);    // pedir explicação depois


            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();


            System.out.println("Price: ");
            sc.nextDouble();
            double price = sc.nextDouble();

            if (type == 'c'){
                list.add(new Product(name, price));

            } else if (type == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");

            }
            else {
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price,  customsFee));

            }


        }

        System.out.println();
        System.out.println("TAG PRICE");
        for (Product prod : list) {
            System.out.println(prod.priceTag());

        }


        sc.close();



    }
}
