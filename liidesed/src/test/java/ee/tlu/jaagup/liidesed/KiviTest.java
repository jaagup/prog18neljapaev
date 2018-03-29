/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.tlu.jaagup.liidesed;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeus
 */
public class KiviTest {
    
    public KiviTest() {
    }

    @Test
    public void testKysiX() {
        System.out.println("kysiX");
        Kivi instance =new Kivi(2, 5);
        int expResult = 2;
        int result = instance.kysiX();
        assertEquals(expResult, result);
        //        fail("The test case is a prototype.");
    }

    @Test
    public void testKysiY() {
        System.out.println("kysiY");
        Kivi instance = new Kivi(2, 5);
        int expResult = 5;
        int result = instance.kysiY();
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    
}
