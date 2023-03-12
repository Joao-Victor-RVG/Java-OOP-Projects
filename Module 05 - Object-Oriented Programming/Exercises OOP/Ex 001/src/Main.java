/*
Exercise 001

Write a program to read an employee's data (name, gross salary and tax). Then show the employee's data (name and net salary).
Then increase the employee's salary based on a given percentage (only the gross salary is affected by the percentage) and show the employee's data again.
Use the class designed below.

 */


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Whats your name? ");
        emp.name = sc.nextLine();

        System.out.println("Whats your Gross Salary?");
        emp.grossSalary = sc.nextDouble();

        System.out.println("Whats the tax?");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + emp);

        sc.close();
    }
}