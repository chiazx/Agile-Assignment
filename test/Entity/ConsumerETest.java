/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chun Lin Goh
 */
public class ConsumerETest {
    
    ConsumerE ce = new ConsumerE();
    
    public ConsumerETest() {
        ce=new ConsumerE("CE0001","Jack Soh Boon Keat","017-9641099","Setapak");
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getCustID method, of class ConsumerE.
     */
    @Test
    public void testGetCustID() {
        System.out.println("getCustID");
        
        String expResult = "CE0001";
        String result = ce.getCustID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustID method, of class ConsumerE.
     */
    @Test
    public void testSetCustID() {
        System.out.println("setCustID");
        String custID = "";
        ConsumerE instance = new ConsumerE();
        instance.setCustID(custID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustName method, of class ConsumerE.
     */
    @Test
    public void testGetCustName() {
        System.out.println("getCustName");
        
        String expResult = "Jack Soh Boon Keat";
        String result = ce.getCustName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustName method, of class ConsumerE.
     */
    @Test
    public void testSetCustName() {
        System.out.println("setCustName");
        String custName = "";
        ConsumerE instance = new ConsumerE();
        instance.setCustName(custName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustAddress method, of class ConsumerE.
     */
    @Test
    public void testGetCustAddress() {
        System.out.println("getCustAddress");
       
        String expResult = "Setapak";
        String result = ce.getCustAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustAddress method, of class ConsumerE.
     */
    @Test
    public void testSetCustAddress() {
        System.out.println("setCustAddress");
        String custAddress = "";
        ConsumerE instance = new ConsumerE();
        instance.setCustAddress(custAddress);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustPhone method, of class ConsumerE.
     */
    @Test
    public void testGetCustPhone() {
        System.out.println("getCustPhone");
        
        String expResult = "017-9641099";
        String result = ce.getCustPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustPhone method, of class ConsumerE.
     */
    @Test
    public void testSetCustPhone() {
        System.out.println("setCustPhone");
        String custPhone = "";
        ConsumerE instance = new ConsumerE();
        instance.setCustPhone(custPhone);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class ConsumerE.
     */
    
    
    
}
