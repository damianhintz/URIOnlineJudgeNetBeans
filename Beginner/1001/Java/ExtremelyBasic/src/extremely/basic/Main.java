/**
 * Extremely Basic (1001)
 * 
 * Opis
 * Read 2 variables, named A and B and make the sum of these two variables, 
 * assigning its result to the variable X. 
 * Print X as shown below. 
 * Print endline after the result otherwise you will get “Presentation Error”.
 * Input
 * 10
 * 9
 * The input file will contain 2 integer numbers.
 * 
 * Output
 * X = 19
 * Print X according to the following example, with a blank space before and after the equal signal.
 */
package extremely.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author damian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int x;
        
        x = sumaSkaner();
        System.out.format("X = %d", x);
        System.out.println();
        //x = sumaBuforowanyCzytnik();
        //System.out.format("X = %d\n", x);
    }
    
    public static int sumaBuforowanyCzytnik() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String aString = reader.readLine();
        String bString = reader.readLine();
        
        int a = Integer.parseInt(aString);
        int b = Integer.parseInt(bString);
        int x = a + b;
        
        return x;
    }
    
    public static int sumaSkaner()
    {
        Scanner skaner = new Scanner(System.in);
        
        int a = skaner.nextInt();
        int b = skaner.nextInt();
        int x = a + b;
        
        return x;
    }
    
    /*public static int sumaKonsola()
    {
        Console konsola = System.console();
        int a = Integer.parseInt(konsola.readLine());
        int b = Integer.parseInt(konsola.readLine());
        return a + b;
    }*/
}
