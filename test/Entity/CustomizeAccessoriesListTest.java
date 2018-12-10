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
public class CustomizeAccessoriesListTest {
    CustomizeProduct cp = new CustomizeProduct();
    CustomizeAccessoriesList cl = new CustomizeAccessoriesList();
    
    public CustomizeAccessoriesListTest() {
        cp=new CustomizeProduct("CFA0001");
        cl=new CustomizeAccessoriesList("AL0001","Box",20.00,cp);
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getAcList method, of class CustomizeAccessoriesList.
     */
    @Test
    public void testGetAcList() {
        System.out.println("getAcList");
        
        String expResult = "AL0001";
        String result = cl.getAcList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAcList method, of class CustomizeAccessoriesList.
     */
    @Test
    public void testSetAcList() {
        System.out.println("setAcList");
        String acList = "";
        CustomizeAccessoriesList instance = new CustomizeAccessoriesList();
        instance.setAcList(acList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAcName method, of class CustomizeAccessoriesList.
     */
    @Test
    public void testGetAcName() {
        System.out.println("getAcName");
       
        String expResult = "Box";
        String result = cl.getAcName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAcName method, of class CustomizeAccessoriesList.
     */
    @Test
    public void testSetAcName() {
        System.out.println("setAcName");
        String acName = "";
        CustomizeAccessoriesList instance = new CustomizeAccessoriesList();
        instance.setAcName(acName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class CustomizeAccessoriesList.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        
        double expResult = 20.00;
        double result = cl.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class CustomizeAccessoriesList.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        CustomizeAccessoriesList instance = new CustomizeAccessoriesList();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCp method, of class CustomizeAccessoriesList.
     */
    @Test
    public void testGetCp() {
        System.out.println("getCp");
        
        CustomizeProduct expResult = cp;
        CustomizeProduct result = cl.getCp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCp method, of class CustomizeAccessoriesList.
     */
    @Test
    public void testSetCp() {
        System.out.println("setCp");
        CustomizeProduct cp = null;
        CustomizeAccessoriesList instance = new CustomizeAccessoriesList();
        instance.setCp(cp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CustomizeAccessoriesList.
     */
    
}
