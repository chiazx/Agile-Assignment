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
public class CustomizeAccessoriesList {
    String acList;
    String acName;
    double price;
    CustomizeProduct cp;

    public CustomizeAccessoriesList() {
    }

    public CustomizeAccessoriesList(String acList, String acName, double price, CustomizeProduct cp) {
        this.acList = acList;
        this.acName = acName;
        this.price = price;
        this.cp = cp;
    }

    public String getAcList() {
        return acList;
    }

    public void setAcList(String acList) {
        this.acList = acList;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
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
        return "CustomizeAccessoriesList{" + "acList=" + acList + ", acName=" + acName + ", price=" + price + ", cp=" + cp + '}';
    }
    
    
}
