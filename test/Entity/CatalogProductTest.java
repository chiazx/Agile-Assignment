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
public class CatalogProductTest {
    
    CatalogProduct cp = new CatalogProduct();
    public CatalogProductTest() {
    }
    
    @Before
    public void setUp() {
        cp= new CatalogProduct("OR0001","Roses","Flower","Confirm","No promotion allowed",120.00,100);
    }

    /**
     * Test of getProdID method, of class CatalogProduct.
     */
    @Test
    public void testGetProdID() {
        System.out.println("getProdID");
        
        String expResult = "OR0001";
        String result = cp.getProdID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProdID method, of class CatalogProduct.
     */
    @Test
    public void testSetProdID() {
        System.out.println("setProdID");
        String prodID = "";
        CatalogProduct instance = new CatalogProduct();
        instance.setProdID(prodID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProdName method, of class CatalogProduct.
     */
    @Test
    public void testGetProdName() {
        System.out.println("getProdName");
        
        String expResult = "Roses";
        String result = cp.getProdName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProdName method, of class CatalogProduct.
     */
    @Test
    public void testSetProdName() {
        System.out.println("setProdName");
        String prodName = "";
        CatalogProduct instance = new CatalogProduct();
        instance.setProdName(prodName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProdType method, of class CatalogProduct.
     */
    @Test
    public void testGetProdType() {
        System.out.println("getProdType");
        
        String expResult = "Flower";
        String result = cp.getProdType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProdType method, of class CatalogProduct.
     */
    @Test
    public void testSetProdType() {
        System.out.println("setProdType");
        String prodType = "";
        CatalogProduct instance = new CatalogProduct();
        instance.setProdType(prodType);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProdStatus method, of class CatalogProduct.
     */
    @Test
    public void testGetProdStatus() {
        System.out.println("getProdStatus");
        
        String expResult = "Confirm";
        String result = cp.getProdStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProdStatus method, of class CatalogProduct.
     */
    @Test
    public void testSetProdStatus() {
        System.out.println("setProdStatus");
        String prodStatus = "";
        CatalogProduct instance = new CatalogProduct();
        instance.setProdStatus(prodStatus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProdDescription method, of class CatalogProduct.
     */
    @Test
    public void testGetProdDescription() {
        System.out.println("getProdDescription");
        
        String expResult = "No promotion allowed";
        String result = cp.getProdDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProdDescription method, of class CatalogProduct.
     */
    @Test
    public void testSetProdDescription() {
        System.out.println("setProdDescription");
        String prodDescription = "";
        CatalogProduct instance = new CatalogProduct();
        instance.setProdDescription(prodDescription);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProdPrice method, of class CatalogProduct.
     */
    @Test
    public void testGetProdPrice() {
        System.out.println("getProdPrice");
        
        double expResult =120.00;
        double result = cp.getProdPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProdPrice method, of class CatalogProduct.
     */
    @Test
    public void testSetProdPrice() {
        System.out.println("setProdPrice");
        double prodPrice = 0.0;
        CatalogProduct instance = new CatalogProduct();
        instance.setProdPrice(prodPrice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProdQuantity method, of class CatalogProduct.
     */
    @Test
    public void testGetProdQuantity() {
        System.out.println("getProdQuantity");
        
        int expResult = 100;
        int result = cp.getProdQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProdQuantity method, of class CatalogProduct.
     */
    @Test
    public void testSetProdQuantity() {
        System.out.println("setProdQuantity");
        int prodQuantity = 0;
        CatalogProduct instance = new CatalogProduct();
        instance.setProdQuantity(prodQuantity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CatalogProduct.
     */
   
    
    
}
