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
public class CustomizeFlowerListTest {
    CustomizeProduct cp = new CustomizeProduct();
    CustomizeFlowerList cf= new CustomizeFlowerList();
    
    public CustomizeFlowerListTest() {
        cp=new CustomizeProduct("CFA0001");
        cf = new CustomizeFlowerList("FL0001","Roses",10.00,cp);
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getFlowerName method, of class CustomizeFlowerList.
     */
    @Test
    public void testGetFlowerName() {
        System.out.println("getFlowerName");
        
        String expResult = "Roses";
        String result = cf.getFlowerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFlowerName method, of class CustomizeFlowerList.
     */
    @Test
    public void testSetFlowerName() {
        System.out.println("setFlowerName");
        String flowerName = "";
        CustomizeFlowerList instance = new CustomizeFlowerList();
        instance.setFlowerName(flowerName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFlowerListID method, of class CustomizeFlowerList.
     */
    @Test
    public void testGetFlowerListID() {
        System.out.println("getFlowerListID");
        
        String expResult = "FL0001";
        String result = cf.getFlowerListID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFlowerListID method, of class CustomizeFlowerList.
     */
    @Test
    public void testSetFlowerListID() {
        System.out.println("setFlowerListID");
        String flowerListID = "";
        CustomizeFlowerList instance = new CustomizeFlowerList();
        instance.setFlowerListID(flowerListID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class CustomizeFlowerList.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        
        double expResult =10.00;
        double result = cf.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class CustomizeFlowerList.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        CustomizeFlowerList instance = new CustomizeFlowerList();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCp method, of class CustomizeFlowerList.
     */
    @Test
    public void testGetCp() {
        System.out.println("getCp");
        
        CustomizeProduct expResult = cp;
        CustomizeProduct result = cf.getCp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCp method, of class CustomizeFlowerList.
     */
    @Test
    public void testSetCp() {
        System.out.println("setCp");
        CustomizeProduct cp = null;
        CustomizeFlowerList instance = new CustomizeFlowerList();
        instance.setCp(cp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CustomizeFlowerList.
     */
    
    
}
