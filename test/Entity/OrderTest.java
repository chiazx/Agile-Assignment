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
 * @author boonk
 */
public class OrderTest {
    private Customer customer;
    private ConsumerE consumer;
    private CooperateE cooperate;
    private String orderID;
    private String orderStatus;
    private String orderType; // delivery or pickup
    private double totalAmount;
    private String custID;
    public OrderTest() {
    }
    
    @Before
    public void setUp() {
        customer=new Customer();
        consumer = new ConsumerE();
        cooperate =new CooperateE();
        
    }

    /**
     * Test of getConsumer method, of class Order.
     */
    @Test
    public void testGetConsumer() {
        System.out.println("getConsumer");
        Order instance = new Order();
        ConsumerE expResult = null;
        ConsumerE result = instance.getConsumer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setConsumer method, of class Order.
     */
    @Test
    public void testSetConsumer() {
        System.out.println("setConsumer");
        ConsumerE consumer = null;
        Order instance = new Order();
        instance.setConsumer(consumer);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getCooperate method, of class Order.
     */
    @Test
    public void testGetCooperate() {
        System.out.println("getCooperate");
        Order instance = new Order();
        CooperateE expResult = null;
        CooperateE result = instance.getCooperate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCooperate method, of class Order.
     */
    @Test
    public void testSetCooperate() {
        System.out.println("setCooperate");
        CooperateE cooperate = null;
        Order instance = new Order();
        instance.setCooperate(cooperate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalAmount method, of class Order.
     */
    @Test
    public void testGetTotalAmount() {
        System.out.println("getTotalAmount");
        Order instance = new Order();
        double expResult = 0.0;
        double result = instance.getTotalAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalAmount method, of class Order.
     */
    @Test
    public void testSetTotalAmount() {
        System.out.println("setTotalAmount");
        double totalAmount = 0.0;
        Order instance = new Order();
        instance.setTotalAmount(totalAmount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getCustomer method, of class Order.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Order instance = new Order();
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class Order.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        Order instance = new Order();
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderID method, of class Order.
     */
    @Test
    public void testGetOrderID() {
        System.out.println("getOrderID");
        Order instance = new Order();
        instance.setOrderID("OR0001");
        String expResult = "OR0001";
        String result = instance.getOrderID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderID method, of class Order.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("setOrderID");
        String orderID = "";
        Order instance = new Order();
        instance.setOrderID(orderID);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderStatus method, of class Order.
     */
    @Test
    public void testGetOrderStatus() {
        System.out.println("getOrderStatus");
        Order instance = new Order();
        instance.setOrderStatus("ok");
        String expResult = "ok";
        String result = instance.getOrderStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderStatus method, of class Order.
     */
    @Test
    public void testSetOrderStatus() {
        System.out.println("setOrderStatus");
        String orderStatus = "";
        Order instance = new Order();
        instance.setOrderStatus(orderStatus);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderType method, of class Order.
     */
    @Test
    public void testGetOrderType() {
        System.out.println("getOrderType");
        Order instance = new Order();
        instance.setOrderType("delivery");
        String expResult = "delivery";
        String result = instance.getOrderType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderType method, of class Order.
     */
    @Test
    public void testSetOrderType() {
        System.out.println("setOrderType");
        String orderType = "";
        Order instance = new Order();
        instance.setOrderType(orderType);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getCustID method, of class Order.
     */
    @Test
    public void testGetCustID() {
        System.out.println("getCustID");
        Order instance = new Order();
        instance.setCustID("ok");
        String expResult = "ok";
        String result = instance.getCustID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCustID method, of class Order.
     */
    @Test
    public void testSetCustID() {
        System.out.println("setCustID");
        String custID = "";
        Order instance = new Order();
        instance.setCustID(custID);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
