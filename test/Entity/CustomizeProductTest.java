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
public class CustomizeProductTest {
    Order order = new Order();
    CustomizeProduct cp = new CustomizeProduct();
    
    public CustomizeProductTest() {
        order = new Order("OR0001","Confirm");
        cp = new CustomizeProduct("CFA0001","Triangle","Large","Express",order);
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of toString method, of class CustomizeProduct.
     */
    

    /**
     * Test of getOrder method, of class CustomizeProduct.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        
        Order expResult = order;
        Order result = cp.getOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrder method, of class CustomizeProduct.
     */
    @Test
    public void testSetOrder() {
        System.out.println("setOrder");
        Order order = null;
        CustomizeProduct instance = new CustomizeProduct();
        instance.setOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustProdID method, of class CustomizeProduct.
     */
    @Test
    public void testGetCustProdID() {
        System.out.println("getCustProdID");
        
        String expResult = "CFA0001";
        String result =cp.getCustProdID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustProdID method, of class CustomizeProduct.
     */
    @Test
    public void testSetCustProdID() {
        System.out.println("setCustProdID");
        String custProdID = "";
        CustomizeProduct instance = new CustomizeProduct();
        instance.setCustProdID(custProdID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStyle method, of class CustomizeProduct.
     */
    @Test
    public void testGetStyle() {
        System.out.println("getStyle");
        
        String expResult = "Triangle";
        String result = cp.getStyle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStyle method, of class CustomizeProduct.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        String style = "";
        CustomizeProduct instance = new CustomizeProduct();
        instance.setStyle(style);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class CustomizeProduct.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        
        String expResult = "Large";
        String result = cp.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class CustomizeProduct.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        String size = "";
        CustomizeProduct instance = new CustomizeProduct();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPriority method, of class CustomizeProduct.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        
        String expResult = "Express";
        String result = cp.getPriority();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPriority method, of class CustomizeProduct.
     */
    
    
}
