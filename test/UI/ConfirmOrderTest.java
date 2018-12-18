/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Entity.ConsumerE;
import Entity.CooperateE;
import Entity.Order;
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
public class ConfirmOrderTest {
    CooperateE c = new CooperateE();
    
    public ConfirmOrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c.setCustLimit(1000.00);
    }
    
    @After
    public void tearDown() {
    }

   
 

    /**
     * Test of showPickupPriority method, of class ConfirmOrder.
     */
   

    /**
     * Test of changeAllListToConfirm method, of class ConfirmOrder.
     */
    @Test
    public void testChangeAllListToConfirm() {
        System.out.println("changeAllListToConfirm");
        ConfirmOrder instance = new ConfirmOrder();
       instance.changeAllListToConfirm();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of inputValidate method, of class ConfirmOrder.
     */
    @Test
    public void testInputValidate() {
       
        System.out.println("inputValidate");
        ConfirmOrder instance = new ConfirmOrder();
        //System.out.print(instance==null);
        instance.totalAmount=2000.00;
        boolean expResult1 = false;
        boolean expResult2 = true;
        boolean result ;

        if(instance.totalAmount>c.getCustLimit()){
            result=false;
            assertEquals(expResult1, result);
        }else{
            result=true;
            assertEquals(expResult2, result);
        }
        
        
        
        
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ConfirmOrder.
     */
    @Test
    public void testMain() {
        System.out.println("main");
       
        String[] args = null;
        
        ConfirmOrder.main(args);
        ConfirmOrder co = new ConfirmOrder();
        ConsumerE individual= new ConsumerE();
        //case 1
        co.order1=new Order(individual,"OR0001","confirm","delivery",100.00);
        co.salesOrderList.add(co.order1);
        assertEquals(co.order1.getOrderID(), co.salesOrderList.getEntry(1).getOrderID());
        //case 2
        co.order=new Order(c,"OR0002","confirm","delivery",100.00);
        co.salesOrderList.add(co.order);
        assertEquals(co.order.getOrderID(), co.salesOrderList.getEntry(2).getOrderID());
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }
    
}
