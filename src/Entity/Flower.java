/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.swing.Icon;

/**
 *
 * @author User
 */
public class Flower {
    private String fImage;
    private String fName;
    private String fType;
    private int quantity = 0;
    private double price;
    private String fDescription;
    private String fStatus;
        
    public Flower(String fName, String fType, int quantity , double price, String fDescription) {
       // this.fImage = fImage;
        this.fName = fName;
        this.fType = fType;
        this.quantity=quantity;
        this.price = price;
        this.fDescription = fDescription;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getfDescription() {
        return fDescription;
    }

    public void setfDescription(String fDescription) {
        this.fDescription = fDescription;
    }

    public String getfStatus() {
        return fStatus;
    }

    public void setfStatus(String fStatus) {
        this.fStatus = fStatus;
    }    

    public String getfImage() {
        return fImage;
    }

    public void setfImage(String fImage) {
        this.fImage = fImage;
    }    
   
    public String toString(){
        return String.format("Flower name :%s \n Flower type :%s \n Quantity :%d \n Price :RM%.2f \n Description :%s \n",fName , fType, quantity, price, fDescription);
    }
    
}
