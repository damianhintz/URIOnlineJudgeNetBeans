/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofacircle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damian
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of printArea method, of class Main.
     */
    @Test
    public void testPrintArea() {
        System.out.println("printArea");
        double r = 2.0;
        String expResult = "A=12.5664";
        String result = Main.printArea(r);
        assertEquals(expResult, result);
    }
}
