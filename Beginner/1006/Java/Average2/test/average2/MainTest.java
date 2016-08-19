/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package average2;

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
        double[] a = new double[]{5.0, 6.0, 7.0};
        Main instance = new Main();
        String expResult = "MEDIA = 6.3";
        String result = instance.printAverage(a);
        assertEquals(expResult, result);
    }
}
