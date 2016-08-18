/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangletypes;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DHintz
 */
public class MainTest {

    public MainTest() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
    }

    /**
     * Test of formaTriangulo method, of class Main.
     */
    @Test
    public void testFormaTriangulo() {
        System.out.println("formaTriangulo 5.0 7.0 2.0");
        double[] a = new double[]{5.0, 7.0, 2.0};
        Arrays.sort(a);
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.formaTriangulo(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of areTheSame method, of class Main.
     */
    @Test
    public void testAreTheSame() {
        System.out.println("areTheSame 0.0 0.0");
        double a = 0.0;
        double b = 0.0;
        Main instance = new Main();
        boolean expResult = true;
        boolean result = instance.areTheSame(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of retangulo method, of class Main.
     */
    @Test
    public void testRetangulo() {
        System.out.println("retangulo 6.0 8.0 10.0");
        double[] a = new double[]{6.0, 8.0, 10.0};
        Arrays.sort(a);
        Main instance = new Main();
        boolean expResult = true;
        boolean result = instance.retangulo(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtusangulo method, of class Main.
     */
    @Test
    public void testObtusangulo() {
        System.out.println("obtusangulo 6.0 6.0 10.0");
        double[] a = new double[]{6.0, 6.0, 10.0};
        Arrays.sort(a);
        Main instance = new Main();
        boolean expResult = true;
        boolean result = instance.obtusangulo(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of acutangulo method, of class Main.
     */
    @Test
    public void testAcutangulo() {
        System.out.println("acutangulo 6.0 6.0 6.0");
        double[] a = new double[]{6.0, 6.0, 6.0};
        Arrays.sort(a);
        Main instance = new Main();
        boolean expResult = true;
        boolean result = instance.acutangulo(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testAcutanguloAndIsosceles_7_5_7() {
        System.out.println("acutangulo and isosceles 7.0 5.0 7.0");
        double[] a = new double[]{5.0, 7.0, 5.0};
        Arrays.sort(a);
        Main instance = new Main();
        assertTrue(instance.formaTriangulo(a));
        assertTrue(instance.acutangulo(a));
        assertFalse(instance.retangulo(a));
        assertFalse(instance.obtusangulo(a));
        assertTrue(instance.isosceles(a));
        assertFalse(instance.equilatero(a));
    }

    @Test
    public void testObtusanguloAndIsosceles_6_6_10() {
        System.out.println("obtusangulo and isosceles 6.0 6.0 10.0");
        double[] a = new double[]{6.0, 6.0, 10.0};
        Arrays.sort(a);
        Main instance = new Main();
        assertTrue(instance.formaTriangulo(a));
        assertFalse(instance.acutangulo(a));
        assertFalse(instance.retangulo(a));
        assertTrue(instance.obtusangulo(a));
        assertTrue(instance.isosceles(a));
        assertFalse(instance.equilatero(a));
    }

    @Test
    public void testAcutanguloAndEquilatero_6_6_6() {
        System.out.println("acutangulo and equilatero 6.0 6.0 6.0");
        double[] a = new double[]{6.0, 6.0, 6.0};
        Arrays.sort(a);
        Main instance = new Main();
        assertTrue(instance.formaTriangulo(a));
        assertTrue(instance.acutangulo(a));
        assertFalse(instance.retangulo(a));
        assertFalse(instance.obtusangulo(a));
        assertFalse(instance.isosceles(a));
        assertTrue(instance.equilatero(a));
    }

    @Test
    public void testNaoFormaTriangulo_5_7_2() {
        System.out.println("nao forma triangulo 5.0 7.0 2.0");
        double[] a = new double[]{5.0, 7.0, 2.0};
        Arrays.sort(a);
        Main instance = new Main();
        assertFalse(instance.formaTriangulo(a));
        assertFalse(instance.acutangulo(a));
        assertFalse(instance.retangulo(a));
        assertFalse(instance.obtusangulo(a));
        assertFalse(instance.isosceles(a));
        assertFalse(instance.equilatero(a));
    }
    
    @Test
    public void testRetangulo_6_8_10() {
        System.out.println("retangulo 6.0 8.0 10.0");
        double[] a = new double[]{6.0, 8.0, 10.0};
        Arrays.sort(a);
        Main instance = new Main();
        assertTrue(instance.formaTriangulo(a));
        assertFalse(instance.acutangulo(a));
        assertTrue(instance.retangulo(a));
        assertFalse(instance.obtusangulo(a));
        assertFalse(instance.isosceles(a));
        assertFalse(instance.equilatero(a));
    }
}
