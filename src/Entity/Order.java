/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author boonk
 */
public class Order {
    private Customer customer;
    private String orderID;
    private String orderStatus;
    private String orderType; // delivery or pickup
    private double totalAmount;
    private String custID;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Order(Customer customer, String orderID, String orderStatus, String orderType, double totalAmount, String custID) {
        this.customer = customer;
        this.orderID = orderID;
    
        this.orderStatus = orderStatus;
        this.orderType = orderType;
        this.totalAmount = totalAmount;
        this.custID = custID;
    }

    @Override
    public String toString() {
        return "Order{" + "customer=" + customer + ", orderID=" + orderID + ", orderStatus=" + orderStatus + ", orderType=" + orderType + ", totalAmount=" + totalAmount + ", custID=" + custID + '}';
    }

  

    public Order() {
    }

    public Order(Customer customer, String orderID, String OLID, String orderStatus, String orderType, String custID) {
        this.customer = customer;
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.orderType = orderType;
        this.custID = custID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }


    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }
    
}
