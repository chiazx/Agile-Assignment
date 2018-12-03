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
    private String customerName;
    private String customerID;
    private String invoiceNo;
    private String orderID;
    private String paymentStatus;
    private String invoiceAmount;
    private String invoiceDate;

        public Invoice() {
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceNo=" + invoiceNo + ", orderID=" + orderID + ", paymentStatus=" + paymentStatus + ", invoiceAmount=" + invoiceAmount + ", invoiceDate=" + invoiceDate + '}';
    }

    public Invoice(String invoiceNo, String orderID, String paymentStatus, String invoiceAmount, String invoiceDate) {
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


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
}
