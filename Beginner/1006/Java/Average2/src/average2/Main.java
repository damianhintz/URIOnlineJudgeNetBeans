/*
 * Average 2 (1006)
 * Read three numbers (variables A, B and C), which are the test scores of a student. 
 * Then, calculate the average, knowing that the note A has a weight of 2, the note B 
 * has a weight of 3 and the note C has a weight of 5. 
 * Consider that each note can go from 0 to 10.0, always with one decimal place.
 * Input
 * The input file contains 3 floating-point numbers with one digit after the decimal point.
 * Output
 * Print MEDIA(average in portuguese) according to the following example, 
 * with a blank space before and after the equal signal.
 * Przykład
 * Sample Input	Sample Output
 * 5            MEDIA = 6.3
 * 6
 * 7
 */
package average2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author damian
 */
public class Main {

    private double[] w = new double[]{2.0, 3.0, 5.0};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main program = new Main();
        Scanner skaner = new Scanner(System.in);
        skaner.useLocale(Locale.US);
        double[] a = new double[3];
        for (int i = 0; i < 3; i++) {
            a[i] = skaner.nextDouble();
        }
        program.printAverage(a);
    }

    public String printAverage(double[] a) {
        double wSum = 0.0, awSum = 0.0;
        for (int i = 0; i < a.length; i++) {
            awSum += a[i] * w[i];
            wSum += w[i];
        }
        double avg = (awSum) / wSum;
        String avgString = String.format(Locale.US, "MEDIA = %.1f", avg);
        System.out.println(avgString);
        return avgString;
    }
}
