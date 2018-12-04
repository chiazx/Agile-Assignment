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
public class Delivery {
    private Order order;
    private String orderID; // ref
    private String deliveryID;
    private String deliveryManName;
    private String deliveryDate;
    private String roadName;
    private String address;
    private String deliveredTime;

    public String getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(String deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    
    public Delivery(String orderID, String deliveryID, String deliveryManName, String deliveryDate, String roadName, String address, String deliveredTime) {
        this.orderID = orderID;
        this.deliveryID = deliveryID;
        this.deliveryManName = deliveryManName;
        this.deliveryDate = deliveryDate;
        this.roadName = roadName;
        this.address = address;
        this.deliveredTime = deliveredTime;
    }

    
    
    
    

    public Delivery(String orderID, String deliveryID, String deliveryManName, String deliveryDate, String address) {
        this.orderID = orderID;
        this.deliveryID = deliveryID;
        this.deliveryManName = deliveryManName;
        this.deliveryDate = deliveryDate;
        this.address = address;
    }

    

    public Delivery(Order order, String orderID, String deliveryID, String deliveryManName, String deliveryDate, String roadName, String address) {
        this.order = order;
        this.orderID = orderID;
        this.deliveryID = deliveryID;
        this.deliveryManName = deliveryManName;
        this.deliveryDate = deliveryDate;
        this.roadName = roadName;
        this.address = address;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Delivery{" + "orderID=" + orderID + ", deliveryID=" + deliveryID + ", deliveryManName=" + deliveryManName + ", deliveryDate=" + deliveryDate + ", address=" + address + '}';
    }

    

    public Delivery() {
    }

   

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
