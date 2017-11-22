/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvls;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guillaume
 */
public class FFdebugCalcTest {
    
    public FFdebugCalcTest() {
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
     * Test of trouverMax method, of class FFdebugCalc.
     */
    @Test
    public void testTrouverMax() {
        System.out.println("trouverMax");
        int[] array = null;
        int expResult = 0;
        int result = FFdebugCalc.trouverMax(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMin method, of class FFdebugCalc.
     */
    @Test
    public void testFindMin() {
        System.out.println("findMin");
        int[] array = null;
        int expResult = 0;
        int result = FFdebugCalc.findMin(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
