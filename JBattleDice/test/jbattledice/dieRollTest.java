/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbattledice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrew
 */
public class dieRollTest {
    
    public dieRollTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of rollResult method, of class dieRoll.
     */
    @Test
    public void testRollResult() {
        System.out.println("rollResult");
        int value = 5;
        dieRoll instance = new dieRoll();
        int result = instance.rollResult(value);
        assertTrue((result >0) && (result < 7));
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
