/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
public class ParfaitTest {
    
    public ParfaitTest() {
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
     * Test of estDivisiblePar method, of class Parfait.
     */
    @Test
    public void testEstDivisiblePar() {
        System.out.println("est divisible par");
        Parfait instance = new Parfait();
        
        assertEquals(true, instance.estDivisiblePar(2, 4));
    }

    /**
     * Test of diviseurs method, of class Parfait.
     
    @Test
    public void testDiviseurs() {
        System.out.println("diviseurs");
        long val = 0L;
        Parfait instance = new Parfait();
        long[] expResult = new long[0];
        long[] result = instance.diviseurs(val);
        assertArrayEquals(expResult, result);
    }*/

    /**
     * Test of estParfait method, of class Parfait.
     */
    @Test
    public void testEstParfait() {
        System.out.println("estParfait");
        Parfait instance = new Parfait();
        boolean expResult = true;
        boolean result = instance.estParfait(28);
        assertEquals(expResult, result);
    }

    /**
     * Test of formaterResult method, of class Parfait.
     */
     @Test
    public void testFormaterResult() {
        // GIVEN
        Parfait instance = new Parfait();

        // WHEN
        String result1 = instance.formaterResult(true, 28);
        String result2 = instance.formaterResult(false, 12);

        // THEN
        assertEquals("le nombre 28 est parfait", result1);
        assertEquals("le nombre 12 n'est pas parfait", result2);
    }

}
