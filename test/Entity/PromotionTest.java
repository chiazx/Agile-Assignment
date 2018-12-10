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
public class PromotionTest {
    CatalogProduct CP = new CatalogProduct();
    Promotion p = new Promotion();
    
    public PromotionTest() {
    }
    
    @Before
    public void setUp() {
        CP = new CatalogProduct("FL001","Rose","Bouquet",12.00,12);
        p = new Promotion("PR001","12-12-2018","12-31-2018","Summer Sales",12,CP);
    }

    /**
     * Test of getPromotionID method, of class Promotion.
     */
    @Test
    public void testGetPromotionID() {
        System.out.println("getPromotionID");
        String expResult = "PR001";
        String result = p.getPromotionID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPromotionID method, of class Promotion.
     */
    @Test
    public void testSetPromotionID() {
        System.out.println("setPromotionID");
        String promotionID = "";
        Promotion instance = new Promotion();
        instance.setPromotionID(promotionID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class Promotion.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");

        String expResult = "12-12-2018";
        String result = p.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class Promotion.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        String StartDate = "";
        Promotion instance = new Promotion();
        instance.setStartDate(StartDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class Promotion.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        String expResult = "12-31-2018";
        String result = p.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class Promotion.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        String EndDate = "";
        Promotion instance = new Promotion();
        instance.setEndDate(EndDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPromotionTitle method, of class Promotion.
     */
    @Test
    public void testGetPromotionTitle() {
        System.out.println("getPromotionTitle");
        String expResult = "Summer Sales";
        String result = p.getPromotionTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPromotionTitle method, of class Promotion.
     */
    @Test
    public void testSetPromotionTitle() {
        System.out.println("setPromotionTitle");
        String promotionTitle = "";
        Promotion instance = new Promotion();
        instance.setPromotionTitle(promotionTitle);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscountRate method, of class Promotion.
     */
    @Test
    public void testGetDiscountRate() {
        System.out.println("getDiscountRate");
        int expResult = 12;
        int result = p.getDiscountRate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDiscountRate method, of class Promotion.
     */
    @Test
    public void testSetDiscountRate() {
        System.out.println("setDiscountRate");
        int discountRate = 0;
        Promotion instance = new Promotion();
        instance.setDiscountRate(discountRate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCP method, of class Promotion.
     */
    @Test
    public void testGetCP() {
        System.out.println("getCP");

        CatalogProduct expResult = CP;
        CatalogProduct result = p.getCP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCP method, of class Promotion.
     */
    @Test
    public void testSetCP() {
        System.out.println("setCP");
        CatalogProduct CP = null;
        Promotion instance = new Promotion();
        instance.setCP(CP);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
