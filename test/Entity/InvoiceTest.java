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
public class InvoiceTest {
    Invoice i = new Invoice();
    public InvoiceTest() {
    }
    
    
    
    @Before
    public void setUp() {
        i = new Invoice("I001","OID001","Pay","1000","12-12-2018");
    }

    /**
     * Test of toString method, of class Invoice.
     */

    /**
     * Test of getInvoiceNo method, of class Invoice.
     */
    @Test
    public void testGetInvoiceNo() {
        System.out.println("getInvoiceNo");
        String expResult = "I001";
        String result = i.getInvoiceNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInvoiceNo method, of class Invoice.
     */
    @Test
    public void testSetInvoiceNo() {
        System.out.println("setInvoiceNo");
        String invoiceNo = "";
        Invoice instance = new Invoice();
        instance.setInvoiceNo(invoiceNo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderID method, of class Invoice.
     */
    @Test
    public void testGetOrderID() {
        System.out.println("getOrderID");
        String expResult = "OID001";
        String result = i.getOrderID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderID method, of class Invoice.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("setOrderID");
        String orderID = "";
        Invoice instance = new Invoice();
        instance.setOrderID(orderID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentStatus method, of class Invoice.
     */
    @Test
    public void testGetPaymentStatus() {
        System.out.println("getPaymentStatus");
        String expResult = "Pay";
        String result = i.getPaymentStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPaymentStatus method, of class Invoice.
     */
    @Test
    public void testSetPaymentStatus() {
        System.out.println("setPaymentStatus");
        String paymentStatus = "";
        Invoice instance = new Invoice();
        instance.setPaymentStatus(paymentStatus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInvoiceAmount method, of class Invoice.
     */
    @Test
    public void testGetInvoiceAmount() {
        System.out.println("getInvoiceAmount");
        String expResult = "1000";
        String result = i.getInvoiceAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInvoiceAmount method, of class Invoice.
     */
    @Test
    public void testSetInvoiceAmount() {
        System.out.println("setInvoiceAmount");
        String invoiceAmount = "";
        Invoice instance = new Invoice();
        instance.setInvoiceAmount(invoiceAmount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInvoiceDate method, of class Invoice.
     */
    @Test
    public void testGetInvoiceDate() {
        System.out.println("getInvoiceDate");
        String expResult = "12-12-2018";
        String result = i.getInvoiceDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInvoiceDate method, of class Invoice.
     */
    @Test
    public void testSetInvoiceDate() {
        System.out.println("setInvoiceDate");
        String invoiceDate = "";
        Invoice instance = new Invoice();
        instance.setInvoiceDate(invoiceDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class Invoice.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int number = 0;
        Invoice instance = new Invoice();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNextNumber method, of class Invoice.
     */
    @Test
    public void testGetNextNumber() {
        System.out.println("getNextNumber");
        int expResult = 1000;
        int result = Invoice.getNextNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNextNumber method, of class Invoice.
     */
    @Test
    public void testSetNextNumber() {
        System.out.println("setNextNumber");
        int nextNumber = 0;
        Invoice.setNextNumber(nextNumber);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
