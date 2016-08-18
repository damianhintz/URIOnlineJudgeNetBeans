/*URI Online Judge | 1045
Triangle Types

Read 3 double numbers (A, B and C) representing the sides of a triangle and arrange them in decreasing order, 
so that the side A is the biggest of the three sides. Next, determine the type of triangle that they can make, 
based on the following cases always writing an appropriate message:
if A ≥ B + C, write the message: NAO FORMA TRIANGULO
if A^2 = B^2 + C^2, write the message: TRIANGULO RETANGULO
if A^2 > B^2 + C^2, write the message: TRIANGULO OBTUSANGULO
if A^2 < B^2 + C^2, write the message: TRIANGULO ACUTANGULO
if the three sides are the same size, write the message: TRIANGULO EQUILATERO
if only two sides are the same and the third one is different, write the message: TRIANGULO ISOSCELES

Input
The input contains three double numbers, A (0 < A) , B (0 < B) and C (0 < C).

Output
Print all the classifications of the triangle presented in the input.

Sample Input	Sample Output

7.0 5.0 7.0
TRIANGULO ACUTANGULO
TRIANGULO ISOSCELES

6.0 6.0 10.0
TRIANGULO OBTUSANGULO
TRIANGULO ISOSCELES

6.0 6.0 6.0
TRIANGULO ACUTANGULO
TRIANGULO EQUILATERO

5.0 7.0 2.0
NAO FORMA TRIANGULO

6.0 8.0 10.0
TRIANGULO RETANGULO

 */
package triangletypes;

import java.util.*;

/**
 *
 * @author damian
 */
public class Main {

    private final Scanner skaner = new Scanner(System.in);
    private final double[] numbers = new double[3];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    private void run() {
        readValues();
        Arrays.sort(numbers);
        if (formaTriangulo(numbers)) {
            if (retangulo(numbers)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (obtusangulo(numbers)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (acutangulo(numbers)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            double a = numbers[2]; //największa
            double b = numbers[1];
            double c = numbers[0];
            //Wykorzystujemy fakt że zostały posortowane
            if (areTheSame(a, b)) {
                if (areTheSame(b, c)) { //a a a
                    System.out.println("TRIANGULO EQUILATERO"); //równoboczny
                } else { //a a b
                    System.out.println("TRIANGULO ISOSCELES"); //równoramienny
                }
            } else if (areTheSame(b, c)) { //a b b
                System.out.println("TRIANGULO ISOSCELES"); //równoramienny
            }
        } else {
            System.out.println("NAO FORMA TRIANGULO"); //to nie jest trójkąt
        }
    }

    private void readValues() {
        skaner.useLocale(Locale.US);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = skaner.nextDouble();
        }
    }

    public boolean formaTriangulo(double[] abc) {
        double a = abc[2];
        double b = abc[1];
        double c = abc[0];
        return a < b + c;
    }

    /**
     * Trójkąt jest prostokątny.
     *
     * @param abc posortowana rosnąco tablica
     * @return
     */
    public boolean retangulo(double[] abc) {
        return retangulo(abc[2], abc[1], abc[0]);
    }

    private boolean retangulo(double a, double b, double c) {
        //if A^2 = B^2 + C^2, write the message: TRIANGULO RETANGULO
        return !notRetangulo(a, b, c);
    }

    private boolean notRetangulo(double a, double b, double c) {
        return obtusangulo(a, b, c) || acutangulo(a, b, c);
    }

    /**
     * Trójkąt rozwarty.
     *
     * @param abc posortowana rosnąco tablica
     * @return
     */
    public boolean obtusangulo(double[] abc) {
        if (!formaTriangulo(abc)) return false;
        return obtusangulo(abc[2], abc[1], abc[0]);
    }

    private boolean obtusangulo(double a, double b, double c) {
        //if A^2 > B^2 + C^2, write the message: TRIANGULO OBTUSANGULO
        return a * a > b * b + c * c;
    }

    /**
     * Trójkąt ostry.
     *
     * @param abc posortowana rosnąco tablica
     * @return
     */
    public boolean acutangulo(double[] abc) {
        if (!formaTriangulo(abc)) return false;
        return acutangulo(abc[2], abc[1], abc[0]);
    }

    private boolean acutangulo(double a, double b, double c) {
        //if A^2 < B^2 + C^2, write the message: TRIANGULO ACUTANGULO
        return a * a < b * b + c * c;
    }

    public boolean equilatero(double[] abc) {
        return equilatero(abc[2], abc[1], abc[0]);
    }

    private boolean equilatero(double a, double b, double c) {
        return areTheSame(a, b) && areTheSame(b, c);
    }

    public boolean isosceles(double[] abc) {
        return isosceles(abc[2], abc[1], abc[0]);
    }
    
    private boolean isosceles(double a, double b, double c) {
        if (areTheSame(a, b)) {
            return !areTheSame(b, c); //a a b
        }
        return areTheSame(b, c); //a b b
    }

    public boolean areTheSame(double a, double b) {
        if (a < b) {
            return false;
        } else if (a > b) {
            return false;
        }
        return true;
    }
}
