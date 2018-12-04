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
    private static int nextNumber = 1000;
    private int num;
    private String invoiceNo;
    private String orderID;
    private String paymentStatus;
    private String invoiceAmount;
    private String invoiceDate;

    @Override
    public String toString() {
        return "Invoice{ invoiceNo=" + invoiceNo + ", Company Name=" + orderID + ", paymentStatus=" + paymentStatus + ", invoiceAmount=" + invoiceAmount + ", incoiceDate=" + invoiceDate + '}';
    }

    public Invoice() {
    }

    public Invoice( String invoiceNo, String orderID, String paymentStatus, String invoiceAmount, String invoiceDate) {
       
        this.invoiceNo = invoiceNo;
        this.orderID = orderID;
        this.paymentStatus = paymentStatus;
        this.invoiceAmount = invoiceAmount;
        this.invoiceDate = invoiceDate;
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
    public void setNumber(int number) {
    this.num = number;
  }

  public static int getNextNumber() {
    return nextNumber;
  }

  public static void setNextNumber(int nextNumber) {
     Invoice.nextNumber = nextNumber;
  }
    
}
