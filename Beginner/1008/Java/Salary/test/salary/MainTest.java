/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

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
     * Test of printNumber method, of class Main.
     */
    @Test
    public void testPrintNumber() {
        System.out.println("printNumber");
        int number = 25;
        Main instance = new Main();
        String expResult = "NUMBER = 25";
        String result = instance.printNumber(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of printSalary method, of class Main.
     */
    @Test
    public void testPrintSalary() {
        System.out.println("printSalary");
        int hoursWorked = 100;
        double amountPerHour = 5.50;
        Main instance = new Main();
        String expResult = "SALARY = U$ 550.00";
        String result = instance.printSalary(hoursWorked, amountPerHour);
        assertEquals(expResult, result);
    }
}
