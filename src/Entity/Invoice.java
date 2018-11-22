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
public class Invoice {
    private Order order;
    private String invoiceNo;
    private String orderID;
    private String paymentStatus;
    private String invoiceAmount;
    private String invoiceDate;

    @Override
    public String toString() {
        return "Invoice{" + "order=" + order + ", invoiceNo=" + invoiceNo + ", orderID=" + orderID + ", paymentStatus=" + paymentStatus + ", invoiceAmount=" + invoiceAmount + ", incoiceDate=" + invoiceDate + '}';
    }

    public Invoice() {
    }

    public Invoice(Order order, String invoiceNo, String orderID, String paymentStatus, String invoiceAmount, String invoiceDate) {
        this.order = order;
        this.invoiceNo = invoiceNo;
        this.orderID = orderID;
        this.paymentStatus = paymentStatus;
        this.invoiceAmount = invoiceAmount;
        this.invoiceDate = invoiceDate;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getIncoiceDate() {
        return invoiceDate;
    }

    public void setIncoiceDate(String incoiceDate) {
        this.invoiceDate = incoiceDate;
    }
    
}
