/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import ADT.LList;
import ADT.ListInterface;
import Entity.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhuoy
 */
public class CustomizedFloralTest {
    Order order = new Order();
    CustomizeProduct cp = new CustomizeProduct();
    ListInterface<CustomizeProduct> cpList =new LList<>();
    ListInterface<Order> oList =new LList<>();
    public CustomizedFloralTest() {
        order.setOrderID("OR0001");
        
        cp = new CustomizeProduct("CFA0001","Triangle","Large","Express",order);
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of init method, of class CustomizedFloral.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        CustomizedFloral instance = new CustomizedFloral();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of refreshJobTable method, of class CustomizedFloral.
     */
   

    /**
     * Test of addRowToFlowerTable method, of class CustomizedFloral.
     */
    @Test
    public void testAddRowToFlowerTable() {
        System.out.println("addRowToFlowerTable");
        CustomizedFloral instance = new CustomizedFloral();
        instance.addRowToFlowerTable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addRowToAccessoriesTable method, of class CustomizedFloral.
     */
    @Test
    public void testAddRowToAccessoriesTable() {
        System.out.println("addRowToAccessoriesTable");
        CustomizedFloral instance = new CustomizedFloral();
        instance.addRowToAccessoriesTable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CustomizedFloral.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        cpList.add(cp);
        oList.add(order);
        assertEquals("CFA0001",cpList.getEntry(1).getCustProdID());
        assertEquals("OR0001",oList.getEntry(1).getOrderID());
        String[] args = null;
        CustomizedFloral.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
