/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import ADT.LList;
import ADT.ListInterface;
import Entity.CooperateE;
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
public class UpdateMonthlyCreditTest {
        static ListInterface<CooperateE> cooList =new LList();
     
    public UpdateMonthlyCreditTest() {
           
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cooList.add(new CooperateE("CP1000","SBS Company.BHD","011-11194912",1000,"test address 1"));
           
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class UpdateMonthlyCredit.
     */
    @Test
    public void testMain() {
        String ID = "CP1000";
         cooList.replace(1,new CooperateE("CP1000","SBS Company.BHD","011-11194912",8800,"test address 1") );
        System.out.println(cooList.getEntry(1));
        String[] args = null;
        UpdateMonthlyCredit.main(args);
        assertEquals(cooList.getEntry(1).getCustID(),"CP1000");
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
