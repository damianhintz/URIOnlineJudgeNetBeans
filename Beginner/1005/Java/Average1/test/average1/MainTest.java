/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package average1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damian
 */
public class MainTest {
    
    public MainTest() {
    }

    /**
     * Test of printAverage method, of class Main.
     */
    @Test
    public void testPrintAverage() {
        System.out.println("printAverage");
        double a = 5.0;
        double b = 7.1;
        Main instance = new Main();
        String expResult = "MEDIA = 6.43182";
        String result = instance.printAverage(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPrintAverageZero() {
        System.out.println("printAverage");
        double a = 0.0;
        double b = 0.0;
        Main instance = new Main();
        String expResult = "MEDIA = 0.00000";
        String result = instance.printAverage(a, b);
        assertEquals(expResult, result);
    }
}
