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
public class DeliveryTest {
    Order order = new Order();
    Delivery d =new Delivery();
    
    public DeliveryTest() {
        order = new Order("OR0001","Confirm");
        d= new Delivery(order,"D0001","Ahmad","12-12-2018","13:00:00","Genting Klang","Setapak");
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getDeliveredTime method, of class Delivery.
     */
    @Test
    public void testGetDeliveredTime() {
        System.out.println("getDeliveredTime");
        
        String expResult = "13:00:00";
        String result = d.getDeliveredTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveredTime method, of class Delivery.
     */
    @Test
    public void testSetDeliveredTime() {
        System.out.println("setDeliveredTime");
        String deliveredTime = "";
        Delivery instance = new Delivery();
        instance.setDeliveredTime(deliveredTime);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryDate method, of class Delivery.
     */
    @Test
    public void testGetDeliveryDate() {
        System.out.println("getDeliveryDate");
        
        String expResult = "12-12-2018";
        String result = d.getDeliveryDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveryDate method, of class Delivery.
     */
    @Test
    public void testSetDeliveryDate() {
        System.out.println("setDeliveryDate");
        String deliveryDate = "";
        Delivery instance = new Delivery();
        instance.setDeliveryDate(deliveryDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Delivery.
     */
    

    /**
     * Test of getOrder method, of class Delivery.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        
        Order expResult = order;
        Order result = d.getOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrder method, of class Delivery.
     */
    @Test
    public void testSetOrder() {
        System.out.println("setOrder");
        Order order = null;
        Delivery instance = new Delivery();
        instance.setOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderID method, of class Delivery.
     */
    

    /**
     * Test of getDeliveryID method, of class Delivery.
     */
    @Test
    public void testGetDeliveryID() {
        System.out.println("getDeliveryID");
        
        String expResult = "D0001";
        String result = d.getDeliveryID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveryID method, of class Delivery.
     */
    @Test
    public void testSetDeliveryID() {
        System.out.println("setDeliveryID");
        String deliveryID = "";
        Delivery instance = new Delivery();
        instance.setDeliveryID(deliveryID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryManName method, of class Delivery.
     */
    @Test
    public void testGetDeliveryManName() {
        System.out.println("getDeliveryManName");
        
        String expResult = "Ahmad";
        String result = d.getDeliveryManName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveryManName method, of class Delivery.
     */
    @Test
    public void testSetDeliveryManName() {
        System.out.println("setDeliveryManName");
        String deliveryManName = "";
        Delivery instance = new Delivery();
        instance.setDeliveryManName(deliveryManName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRoadName method, of class Delivery.
     */
    @Test
    public void testGetRoadName() {
        System.out.println("getRoadName");
        
        String expResult = "Genting Klang";
        String result = d.getRoadName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRoadName method, of class Delivery.
     */
    @Test
    public void testSetRoadName() {
        System.out.println("setRoadName");
        String roadName = "";
        Delivery instance = new Delivery();
        instance.setRoadName(roadName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Delivery.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        
        String expResult = "Setapak";
        String result = d.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Delivery.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Delivery instance = new Delivery();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
