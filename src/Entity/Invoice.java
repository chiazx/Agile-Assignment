/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author boonk
 */
public class Invoice {

  

    private String cooID;
    private String cooName;
    private double Amount;
    private Date date;
 

    public Invoice( String cooID, String cooName, double Amount, Date date) {
        
        this.cooID = cooID;
        this.cooName = cooName;
        this.Amount = Amount;
        this.date = date;
       

    }

    
    public String getCooID() {
        return cooID;
    }

    public void setCooID(String cooID) {
        this.cooID = cooID;
    }

    public String getCooName() {
        return cooName;
    }

    public void setCooName(String cooName) {
        this.cooName = cooName;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

  
 

    @Override
    public String toString() {
        return "Invoice{" + "cooID=" + cooID + ", cooName=" + cooName + ", Amount=" + Amount + ", date=" + date + '}';
    }
    
}
