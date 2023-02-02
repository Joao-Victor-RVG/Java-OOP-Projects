import java.util.Scanner;

// Example 1:

/*
public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Bom dia");
        if (x < 0) {
            System.out.println("Boa Tarde!");
        }
        System.out.println("Boa Noite");

    }
}
*/

// Example 2:

/*
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas Horas?");
        hora = sc.nextInt();

        if (hora < 12){
            System.out.println("Bom dia");
        }
        else {
        System.out.println("Boa Tarde");
        }

        sc.close();
    }
}
*/

// Example 3 /1:

/*
public class Main {
    public static void main(String[] args) {

        System.out.println("Quantas Horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Boa Tarde!");
        }
        else {
            if (hora < 18) {
                System.out.println("Boa tarde!");
            }
            else {
                System.out.println("Boa Noite!");
            }
        }
    }
}
*/

// Example 3 /2:

public class Main {
    public static void main(String[] args) {

        System.out.println("Quantas Horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Boa Tarde!");
        }
        else if (hora < 18) {
            System.out.println("Boa tarde!");
        }
        else {
                System.out.println("Boa Noite!");
            }
        sc.close();
    }
}