/*
 Difference (1007)
 * Make a simple program that reads four variables named A, B, C and D. 
 * Calculate and print the difference of the product of A and B with the product of C and D (A * B - C * D).
 * Input
 * The input file contains 4 integer numbers.
 * Output
 * Print DIFERENCA (DIFFERENCE in portuguese) according to the following example, 
 * with a blank space before and after the equal signal.
 * Sample Input	Sample Output
 * 5            DIFERENCA = -26
 * 6
 * 7
 * 8
 */
package difference;

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
        int a = skaner.nextInt();
        int b = skaner.nextInt();
        int c = skaner.nextInt();
        int d = skaner.nextInt();
        program.printDifference(a, b, c, d);
    }

    public String printDifference(int a, int b, int c, int d) {
        int dif = a * b - c * d;
        String difString = String.format("DIFERENCA = %d", dif);
        System.out.println(difString);
        return difString;
    }
}
