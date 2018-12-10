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
public class OrderListTest {
    OrderList OL = new OrderList();
    CatalogProduct CP = new CatalogProduct();
    CustomizeProduct CP2 = new CustomizeProduct();
    Order o = new Order();
    public OrderListTest() {
    }
    
    @Before
    public void setUp() {
        CP = new CatalogProduct("FL001","Rose","Bouquet",12.00,12);
        CP2 = new CustomizeProduct("CFA0001");
        OL = new OrderList(CP,CP2,o,"OL001","FL001","12","OID001");
    }

    /**
     * Test of getOrderID method, of class OrderList.
     */
    @Test
    public void testGetOrderID() {
        System.out.println("getOrderID");
;
        String expResult = "OID001";
        String result = OL.getOrderID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderID method, of class OrderList.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("setOrderID");
        String orderID = "";
        OrderList instance = new OrderList();
        instance.setOrderID(orderID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomizeProduct method, of class OrderList.
     */
    @Test
    public void testGetCustomizeProduct() {
        System.out.println("getCustomizeProduct");

        CustomizeProduct expResult = CP2;
        CustomizeProduct result = OL.getCustomizeProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomizeProduct method, of class OrderList.
     */
    @Test
    public void testSetCustomizeProduct() {
        System.out.println("setCustomizeProduct");
        CustomizeProduct customizeProduct = null;
        OrderList instance = new OrderList();
        instance.setCustomizeProduct(customizeProduct);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrder method, of class OrderList.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        OrderList instance = new OrderList();
        Order expResult = null;
        Order result = instance.getOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrder method, of class OrderList.
     */
    @Test
    public void testSetOrder() {
        System.out.println("setOrder");
        Order order = null;
        OrderList instance = new OrderList();
        instance.setOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogProduct method, of class OrderList.
     */
    @Test
    public void testGetCatalogProduct() {
        System.out.println("getCatalogProduct");
        CatalogProduct expResult = CP;
        CatalogProduct result = OL.getCatalogProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCatalogProduct method, of class OrderList.
     */
    @Test
    public void testSetCatalogProduct() {
        System.out.println("setCatalogProduct");
        CatalogProduct catalogProduct = null;
        OrderList instance = new OrderList();
        instance.setCatalogProduct(catalogProduct);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOLID method, of class OrderList.
     */
    @Test
    public void testGetOLID() {
        System.out.println("getOLID");

        String expResult = "OL001";
        String result = OL.getOLID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOLID method, of class OrderList.
     */
    @Test
    public void testSetOLID() {
        System.out.println("setOLID");
        String OLID = "";
        OrderList instance = new OrderList();
        instance.setOLID(OLID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProdID method, of class OrderList.
     */
    @Test
    public void testGetProdID() {
        System.out.println("getProdID");

        String expResult = "FL001";
        String result = OL.getProdID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProdID method, of class OrderList.
     */
    @Test
    public void testSetProdID() {
        System.out.println("setProdID");
        String prodID = "";
        OrderList instance = new OrderList();
        instance.setProdID(prodID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class OrderList.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");

        String expResult = "12";
        String result = OL.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class OrderList.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        String quantity = "";
        OrderList instance = new OrderList();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class OrderList.
     */

    
}
