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
public class CooperateETest {
    
    CooperateE ce= new CooperateE();
    
    public CooperateETest() {
        ce=new CooperateE("CO0001","Vincent Lim Kah Hau","0102018060",2000.00,"KL");
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getCustID method, of class CooperateE.
     */
    @Test
    public void testGetCustID() {
        System.out.println("getCustID");
        
        String expResult = "CO0001";
        String result = ce.getCustID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustID method, of class CooperateE.
     */
    @Test
    public void testSetCustID() {
        System.out.println("setCustID");
        String custID = "";
        CooperateE instance = new CooperateE();
        instance.setCustID(custID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustName method, of class CooperateE.
     */
    @Test
    public void testGetCustName() {
        System.out.println("getCustName");
        
        String expResult = "Vincent Lim Kah Hau";
        String result = ce.getCustName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustName method, of class CooperateE.
     */
    @Test
    public void testSetCustName() {
        System.out.println("setCustName");
        String custName = "";
        CooperateE instance = new CooperateE();
        instance.setCustName(custName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustPhone method, of class CooperateE.
     */
    @Test
    public void testGetCustPhone() {
        System.out.println("getCustPhone");
        
        String expResult = "0102018060";
        String result = ce.getCustPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustPhone method, of class CooperateE.
     */
    @Test
    public void testSetCustPhone() {
        System.out.println("setCustPhone");
        String custPhone = "";
        CooperateE instance = new CooperateE();
        instance.setCustPhone(custPhone);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustLimit method, of class CooperateE.
     */
    @Test
    public void testGetCustLimit() {
        System.out.println("getCustLimit");
        
        double expResult = 2000.00;
        double result = ce.getCustLimit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustLimit method, of class CooperateE.
     */
    @Test
    public void testSetCustLimit() {
        System.out.println("setCustLimit");
        double CustLimit = 0.0;
        CooperateE instance = new CooperateE();
        instance.setCustLimit(CustLimit);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustAddress method, of class CooperateE.
     */
    @Test
    public void testGetCustAddress() {
        System.out.println("getCustAddress");
        
        String expResult = "KL";
        String result = ce.getCustAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustAddress method, of class CooperateE.
     */
    @Test
    public void testSetCustAddress() {
        System.out.println("setCustAddress");
        String custAddress = "";
        CooperateE instance = new CooperateE();
        instance.setCustAddress(custAddress);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class CooperateE.
     */
   
    
}
