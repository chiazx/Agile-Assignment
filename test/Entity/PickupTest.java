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
 * @author User
 */
public class PickupTest {
    Order o = new Order();
    Pickup PU = new Pickup();
    
    public PickupTest() {
    }
    
    @Before
    public void setUp() {
        o = new Order("OR0001","Confirm");
        PU = new Pickup(o,"OID001","PU001","12-12-2018","12.00","yes","pick-up");
    }

    /**
     * Test of getPickupStatus method, of class Pickup.
     */
    @Test
    public void testGetPickupStatus() {
        System.out.println("getPickupStatus");
        String expResult = "pick-up";
        String result = PU.getPickupStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPickupStatus method, of class Pickup.
     */
    @Test
    public void testSetPickupStatus() {
        System.out.println("setPickupStatus");
        String pickupStatus = "";
        Pickup instance = new Pickup();
        instance.setPickupStatus(pickupStatus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrder method, of class Pickup.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");

        Order expResult = o;
        Order result = PU.getOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrder method, of class Pickup.
     */
    @Test
    public void testSetOrder() {
        System.out.println("setOrder");
        Order order = null;
        Pickup instance = new Pickup();
        instance.setOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderID method, of class Pickup.
     */
    @Test
    public void testGetOrderID() {
        System.out.println("getOrderID");
        String expResult = "OID001";
        String result = PU.getOrderID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderID method, of class Pickup.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("setOrderID");
        String orderID = "";
        Pickup instance = new Pickup();
        instance.setOrderID(orderID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPickupID method, of class Pickup.
     */
    @Test
    public void testGetPickupID() {
        System.out.println("getPickupID");
        String expResult = "PU001";
        String result = PU.getPickupID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPickupID method, of class Pickup.
     */
    @Test
    public void testSetPickupID() {
        System.out.println("setPickupID");
        String pickupID = "";
        Pickup instance = new Pickup();
        instance.setPickupID(pickupID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPickupDate method, of class Pickup.
     */
    @Test
    public void testGetPickupDate() {
        System.out.println("getPickupDate");
        String expResult = "12-12-2018";
        String result = PU.getPickupDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPickupDate method, of class Pickup.
     */
    @Test
    public void testSetPickupDate() {
        System.out.println("setPickupDate");
        String pickupDate = "";
        Pickup instance = new Pickup();
        instance.setPickupDate(pickupDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPickupTime method, of class Pickup.
     */
    @Test
    public void testGetPickupTime() {
        System.out.println("getPickupTime");
        String expResult = "12.00";
        String result = PU.getPickupTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPickupTime method, of class Pickup.
     */
    @Test
    public void testSetPickupTime() {
        System.out.println("setPickupTime");
        String pickupTime = "";
        Pickup instance = new Pickup();
        instance.setPickupTime(pickupTime);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPickupPriority method, of class Pickup.
     */
    @Test
    public void testGetPickupPriority() {
        System.out.println("getPickupPriority");
        String expResult = "yes";
        String result = PU.getPickupPriority();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPickupPriority method, of class Pickup.
     */
    @Test
    public void testSetPickupPriority() {
        System.out.println("setPickupPriority");
        String pickupPriority = "";
        Pickup instance = new Pickup();
        instance.setPickupPriority(pickupPriority);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
