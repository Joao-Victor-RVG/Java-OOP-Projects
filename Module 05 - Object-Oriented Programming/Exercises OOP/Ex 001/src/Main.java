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

        Employee employee = new Employee();

        System.out.println("Whats your name? ");
        employee.name = sc.nextLine();

        System.out.println("Whats your Gross Salary?");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Whats the tax?");
        employee.tax = sc.nextDouble();














        sc.close();




    }
}