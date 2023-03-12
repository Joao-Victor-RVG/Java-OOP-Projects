/*
Write a program to read the width and height values of a rectangle. Then show on the screen the value of its area,
perimeter and diagonal. Use a class as shown in the project on the side.
 */


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle();


        System.out.println("Enter rectangle width and height: ");

        System.out.println("Width");
        rec.width = sc.nextDouble();

        System.out.println("Height");
        rec.height = sc.nextDouble();


        System.out.printf("AREA = %.2f%n", rec.area());
        System.out.printf("PERIMETER = %.2f%n", rec.perimeter());
        System.out.printf("DIAGONAl = %.2f%n", rec.diagonal());



        sc.close();
    }
}