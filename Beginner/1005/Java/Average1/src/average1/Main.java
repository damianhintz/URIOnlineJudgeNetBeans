/*
 * Average 1 (1005)
 * Make a simple program that read two floating numbers corresponding to two tests for a student. 
 * After, calculate the average between them, 
 * considering that the first number has 3.5 weight and the second one have 7.5 weight. 
 * Each number can be from zero to ten, always with one digit after the decimal point. 
 * Don’t forget to print end line after the result otherwise you will get “Presentation Error”. 
 * Don’t forget the space before and after the equal sign.
 * Input
 * The input file will contain 2 floating-point numbers with one digit after the decimal point.
 * Output
 * Print MEDIA(average in portuguese) according to the following example, 
 * with 5 digits after the decimal point and a blank space before and after the equal signal.
 * Przykład
 * Sample Input	Sample Output
 * 5.0          MEDIA = 6.43182
 * 7.1
 */
package average1;

import java.util.Scanner;
import java.util.Locale;

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
        double a = skaner.nextDouble();
        double b = skaner.nextDouble();
        program.printAverage(a, b);
    }

    /**
     * Oblicz średnią ważoną a i b według wzoru: SumaN(ai*wi)/SumaN(wi) :=
     * (a1*w1+a2*w2+...+aN*wN)/(w1+w2+...+wN)
     *
     * @param a
     * @param b
     * @return
     */
    public String printAverage(double a, double b) {
        //3.5 weight and the second one have 7.5
        double aWeight = 3.5;
        double bWeight = 7.5;
        double abSum = aWeight + bWeight;
        double average = (a * aWeight + b * bWeight) / abSum;
        String averageString = String.format(Locale.US, "MEDIA = %.5f", average);
        System.out.println(averageString);
        return averageString;
    }
}
