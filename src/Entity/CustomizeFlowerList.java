/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Chun Lin Goh
 */
public class CustomizeFlowerList {
    
    String flowerListID;
    String flowerName;
    double price;
    CustomizeProduct cp;

    public CustomizeFlowerList() {
    }

    public CustomizeFlowerList(String flowerListID, String flowerName, double price, CustomizeProduct cp) {
        this.flowerListID = flowerListID;
        this.flowerName = flowerName;
        this.price = price;
        this.cp = cp;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }


    public String getFlowerListID() {
        return flowerListID;
    }

    public void setFlowerListID(String flowerListID) {
        this.flowerListID = flowerListID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CustomizeProduct getCp() {
        return cp;
    }

    public void setCp(CustomizeProduct cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "CustomizeFlowerList{" + "flowerListID=" + flowerListID + ", flowerName=" + flowerName + ", price=" + price + ", cp=" + cp + '}';
    }

   
    
    
}
