/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import ADT.LList;
import ADT.ListInterface;
import Entity.CatalogProduct;
import Entity.Promotion;
import Entity.PromotionList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author boonk
 */
public class PromotionDetailTest {
    
    ListInterface<PromotionList> promoList = new LList<>();
    ListInterface<Promotion> promotion = new LList<>();
    PromotionList PL = new PromotionList();
    Promotion promo = new Promotion();
    CatalogProduct CPList = new CatalogProduct();
    public PromotionDetailTest() {
        CatalogProduct CP = new CatalogProduct("CP001","Rose","Bouquet",12.00,15);
        Promotion P = new Promotion("PR002","12-12-2018","12-31-2018","Summer Sales",12);     
        promoList.add(new PromotionList(CP,P,"PL002"));
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        CPList.setProdType("Bouquet");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initialize method, of class PromotionDetail.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        PromotionDetail instance = new PromotionDetail();
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of refreshFlowerDDL method, of class PromotionDetail.
     */
    @Test
    public void testRefreshFlowerDDL() {
        System.out.println("refreshFlowerDDL");
        PromotionDetail instance = new PromotionDetail();
        instance.refreshFlowerDDL();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of refreshsFlowerDDL method, of class PromotionDetail.
     */
    @Test
    public void testRefreshsFlowerDDL() {
        System.out.println("refreshsFlowerDDL");
        PromotionDetail instance = new PromotionDetail();
        instance.refreshsFlowerDDL();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of refreshPromotionTable method, of class PromotionDetail.
     */
    @Test
    public void testRefreshPromotionTable() {
        System.out.println("refreshPromotionTable");
        PromotionDetail instance = new PromotionDetail();
        instance.refreshPromotionTable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of refreshProductTable method, of class PromotionDetail.
     */
    @Test
    public void testRefreshProductTable() {
        System.out.println("refreshProductTable");
        PromotionDetail instance = new PromotionDetail();
        instance.refreshProductTable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GenerateNextPromoID method, of class PromotionDetail.
     */
    @Test
    public void testGenerateNextPromoID() {
        System.out.println("GenerateNextPromoID");
        PromotionDetail instance = new PromotionDetail();
        String expResult = "PR002";
        String result = instance.GenerateNextPromoID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GenerateNextPLID method, of class PromotionDetail.
     */
    @Test
    public void testGenerateNextPLID() {
        System.out.println("GenerateNextPLID");
        PromotionDetail instance = new PromotionDetail();
        String expResult = "PL002";
        String result = instance.GenerateNextPLID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PromotionDetail.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        
        
        CatalogProduct CP = new CatalogProduct("CP001","Rose","Bouquet",12.00,15);
        Promotion P = new Promotion("PR002","12-12-2018","12-31-2018","Summer Sales",12);
        PromotionList PL = new PromotionList(CP,P,"PL002");     
        promoList.add(PL);
        promotion.add(P);
        
        assertEquals(promoList.getEntry(1).getPromoListID(), PL.getPromoListID());
        assertEquals(promotion.getEntry(1), P);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
