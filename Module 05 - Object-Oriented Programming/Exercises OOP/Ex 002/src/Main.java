/*
Make a program to read a student's name and the three grades he got in the three quarters of the year
(first quarter is worth 30 and second and third are worth 35 each).
 At the end, show the student's final grade in the year. Also say if the student is approved (PASS) or not (FAILED) and, if not,
 how many points are missing for the student to obtain the minimum to pass (which is 60% of the grade).
 You must create a Student class to solve this problem.

*/


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stud = new Student();


        System.out.println("Name: ");
        stud.name = sc.nextLine();

        System.out.println("Grade 01 ");
        stud.grade1 = sc.nextDouble();

        System.out.println("Grade 02 ");
        stud.grade2 = sc.nextDouble();

        System.out.println("Grade 03 ");
        stud.grade3 = sc.nextDouble();


        System.out.printf("FINAL GRADE: %.2f%n", stud.finalGrade());

        if(stud.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", stud.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}