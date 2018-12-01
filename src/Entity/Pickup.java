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
public class Pickup {
    
    private Order order;
    private String orderID;
    private String pickupID;
    private String pickupDate;
    private String pickupTime;
    private String pickupPriority;

  
    

    public Pickup() {
    }

    @Override
    public String toString() {
        return "Pickup{" + "orderID=" + orderID + ", pickupID=" + pickupID + ", pickupPriority=" + pickupPriority + '}';
    }

    public Pickup(String orderID, String pickupID, String pickupPriority) {
        this.orderID = orderID;
        this.pickupID = pickupID;
        this.pickupPriority = pickupPriority;
    }

    public Pickup(Order order, String orderID, String pickupID, String pickupDate, String pickupTime, String pickupPriority) {
        this.order = order;
        this.orderID = orderID;
        this.pickupID = pickupID;
        this.pickupDate = pickupDate;
        this.pickupTime = pickupTime;
        this.pickupPriority = pickupPriority;
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

    public String getPickupID() {
        return pickupID;
    }

    public void setPickupID(String pickupID) {
        this.pickupID = pickupID;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getPickupPriority() {
        return pickupPriority;
    }

    public void setPickupPriority(String pickupPriority) {
        this.pickupPriority = pickupPriority;
    }
   
}
