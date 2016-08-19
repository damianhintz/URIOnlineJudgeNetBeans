/*
 * Nazwa
 * Salary (1008)
 * Write a program that reads the number of an employee, 
 * the number of hours that he worked in a month and the amount he received per hour. 
 * Print the employee number and the salary that he will receive at end of the month, 
 * rounded to two decimal places.
 * - Don’t forget to print end line after the result otherwise you will get “Presentation Error”.
 * - Don’t forget the space before and after the equal signal and after the U$.
 * Input
 * The input file contains 2 integer numbers and 1 floating-point number, 
 * respectively the number, hours worked and the among received by an hour worked.
 * Output
 * Print the number and the salary of the employee, according to the given example, 
 * with a blank space before and after the equal signal.
 * Sample Input	Sample Output
 * 25           NUMBER = 25
 * 100          SALARY = U$ 550.00
 * 5.50
 */
package salary;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author damian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main program = new Main();
        Scanner skaner = new Scanner(System.in);
        skaner.useLocale(Locale.US);
        int number = skaner.nextInt();
        int hoursWorked = skaner.nextInt();
        double amountPerHour = skaner.nextDouble();
        program.printNumber(number);
        program.printSalary(hoursWorked, amountPerHour);
    }

    public String printNumber(int number) {
        String numberString = String.format("NUMBER = %d", number);
        System.out.println(numberString);
        return numberString;
    }

    public String printSalary(int hoursWorked, double amountPerHour) {
        double salary = hoursWorked * amountPerHour;
        String salaryString = String.format(Locale.US, "SALARY = U$ %.2f", salary);
        System.out.println(salaryString);
        return salaryString;
    }
}
