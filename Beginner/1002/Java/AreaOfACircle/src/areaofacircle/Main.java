/*
 * Name (ID)
 * Area of a Circle (1002)
 * 
 * Opis
 * The area of the circle is defined as A = π . R2, having π as 3.14159.
 * Calculate the area using the formula given in the problem description.
 * 
 * Wejście
 * Read the variable R, that is the radius of the circle.
 * 
 * Wyjście
 * Print the variable A, rounded to four decimal digits.
 * 
 * Przykład
 * Sample Input	Sample Output
 * 2            A=12.5664
 */
package areaofacircle; //To trzeba wywalić!

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;


/**
 *
 * @author damian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //FileReader fin = new FileReader("d:\\judge\\1002.txt");
        //BufferedReader bin = new BufferedReader(fin);
        InputStreamReader cin = new InputStreamReader(System.in);
        BufferedReader bin = new BufferedReader(cin);
        
        while(bin.ready())
        {
            double r = Double.parseDouble(bin.readLine());
            printArea(r);
        }
    }
    
    public static String printArea(double r)
    {
        double pi = 3.14159;
        double a = pi * r * r;
        String aString = String.format(Locale.US, "A=%.4f", a);
        System.out.println(aString);
        return aString;
    }
}
