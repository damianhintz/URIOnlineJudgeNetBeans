/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package difference;

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
     * Test of printDifference method, of class Main.
     */
    @Test
    public void testPrintDifference() {
        System.out.println("printDifference");
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;
        Main instance = new Main();
        String expResult = "DIFERENCA = -26";
        String result = instance.printDifference(a, b, c, d);
        assertEquals(expResult, result);
    }
}
