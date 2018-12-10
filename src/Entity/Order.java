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
    
    private ConsumerE consumer;
    private CooperateE cooperate;
    private String orderID;
    private String orderStatus;
    private String orderType; // delivery or pickup
    private double totalAmount;

    public Order(String orderID, String orderStatus) {
        this.orderID = orderID;
        this.orderStatus = orderStatus;
    }
   

    public Order(ConsumerE consumer, String orderID, String orderStatus, String orderType, double totalAmount) {
        this.consumer = consumer;
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.orderType = orderType;
        this.totalAmount = totalAmount;
    }

    public Order(CooperateE cooperate, String orderID, String orderStatus, String orderType, double totalAmount) {
        this.cooperate = cooperate;
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.orderType = orderType;
        this.totalAmount = totalAmount;
    }

    public Order(String orderID, String orderStatus, double totalAmount) {
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.totalAmount = totalAmount;
    }

    public Order(ConsumerE consumer, CooperateE cooperate, String orderID, String orderStatus, String orderType, double totalAmount) {
        this.consumer = consumer;
        this.cooperate = cooperate;
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.orderType = orderType;
        this.totalAmount = totalAmount;
    }
    

    
    public ConsumerE getConsumer() {
        return consumer;
    }

    public void setConsumer(ConsumerE consumer) {
        this.consumer = consumer;
    }

    public CooperateE getCooperate() {
        return cooperate;
    }

    public void setCooperate(CooperateE cooperate) {
        this.cooperate = cooperate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

   

    public Order(String orderID, String orderStatus, String orderType, double totalAmount) {
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.orderType = orderType;
        this.totalAmount = totalAmount;
        
    }

    @Override
    public String toString() {
        return "Order{" + "consumer=" + consumer + ", cooperate=" + cooperate + ", orderID=" + orderID + ", orderStatus=" + orderStatus + ", orderType=" + orderType + ", totalAmount=" + totalAmount + '}';
    }

   

    

  

    public Order() {
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

    
    
}
