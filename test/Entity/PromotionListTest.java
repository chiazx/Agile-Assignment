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
public class PromotionListTest {
    PromotionList PL = new PromotionList();
    Promotion p= new Promotion();
    CatalogProduct CP = new CatalogProduct();
    
    public PromotionListTest() {
    }
    
    @Before
    public void setUp() {
        p = new Promotion("PR001","12-12-2018","12-31-2018","Summer Sales",12);
        CP = new CatalogProduct("FL001","Rose","Bouquet",12.00,12);
        PL = new PromotionList(CP,p,"PL001");
    }

    /**
     * Test of getCatalogProduct method, of class PromotionList.
     */
    @Test
    public void testGetCatalogProduct() {
        System.out.println("getCatalogProduct");
        CatalogProduct expResult = CP;
        CatalogProduct result = PL.getCatalogProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCatalogProduct method, of class PromotionList.
     */
    @Test
    public void testSetCatalogProduct() {
        System.out.println("setCatalogProduct");
        CatalogProduct catalogProduct = null;
        PromotionList instance = new PromotionList();
        instance.setCatalogProduct(catalogProduct);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPromotion method, of class PromotionList.
     */
    @Test
    public void testGetPromotion() {
        System.out.println("getPromotion");
        Promotion expResult = p;
        Promotion result = PL.getPromotion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPromotion method, of class PromotionList.
     */
    @Test
    public void testSetPromotion() {
        System.out.println("setPromotion");
        Promotion promotion = null;
        PromotionList instance = new PromotionList();
        instance.setPromotion(promotion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPromoListID method, of class PromotionList.
     */
    @Test
    public void testGetPromoListID() {
        System.out.println("getPromoListID");
        String expResult = "PL001";
        String result = PL.getPromoListID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPromoListID method, of class PromotionList.
     */
    @Test
    public void testSetPromoListID() {
        System.out.println("setPromoListID");
        String promoListID = "";
        PromotionList instance = new PromotionList();
        instance.setPromoListID(promoListID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
