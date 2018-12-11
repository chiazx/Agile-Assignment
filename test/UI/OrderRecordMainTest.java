/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import jdk.nashorn.internal.ir.CatchNode;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhuoy
 */
public class OrderRecordMainTest {
    
    public OrderRecordMainTest() {
    }
    
    
    @Before
    public void setUp() {
    }

    /**
     * Test of initialize method, of class OrderRecordMain.
     */
   
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        OrderRecordMain instance = new OrderRecordMain();
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of initialize1 method, of class OrderRecordMain.
     */
//    @Test
//    public void testInitialize1() {
//        System.out.println("initialize1");
//        OrderRecordMain instance = new OrderRecordMain();
//        instance.initialize1();
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of refreshPickupTable method, of class OrderRecordMain.
     */
    @Test
    public void testRefreshPickupTable() {
        System.out.println("refreshPickupTable");
        OrderRecordMain instance = new OrderRecordMain();
        instance.refreshPickupTable();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of refreshDeliveryTable method, of class OrderRecordMain.
     */
    @Test
    public void testRefreshDeliveryTable() {
        System.out.println("refreshDeliveryTable");
        OrderRecordMain instance = new OrderRecordMain();
        instance.refreshDeliveryTable();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class OrderRecordMain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        OrderRecordMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
}
