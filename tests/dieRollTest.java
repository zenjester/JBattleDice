package jbattledice;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
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
        dieRoll instance;
        instance = new dieRoll();
        int result = instance.rollResult(value);
        Assert.assertTrue("It workd", ((result > 0) && (result < 7)));
        // TODO review the generated test code and remove the default call to fail.
    }

}
