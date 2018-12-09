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
public class CatalogProduct {
    
    private String prodImg;
    private String prodID;
    private String prodName;
    private String prodType;
    private String prodStatus;
    private String prodDescription;
    private double prodPrice;
    private int prodQuantity;

    public CatalogProduct(){
        
    }

    public CatalogProduct(String prodName, String prodType, String prodDescription, double prodPrice, int prodQuantity) {
        this.prodName = prodName;
        this.prodType = prodType;
        this.prodDescription = prodDescription;
        this.prodPrice = prodPrice;
        this.prodQuantity = prodQuantity;
    }

    public CatalogProduct(String prodID, String prodName, String prodType, String prodStatus, String prodDescription, double prodPrice) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodType = prodType;
        this.prodStatus = prodStatus;
        this.prodDescription = prodDescription;
        this.prodPrice = prodPrice;
    }
    
    public CatalogProduct(String prodID, String prodName, String prodType, String prodStatus, String prodDescription, double prodPrice, int prodQuantity) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodType = prodType;
        this.prodStatus = prodStatus;
        this.prodDescription = prodDescription;
        this.prodPrice = prodPrice;
        this.prodQuantity = prodQuantity;
    }

    public String getProdImg() {
        return prodImg;
    }

    public void setProdImg(String prodImg) {
        this.prodImg = prodImg;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdStatus() {
        return prodStatus;
    }

    public void setProdStatus(String prodStatus) {
        this.prodStatus = prodStatus;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdQuantity() {
        return prodQuantity;
    }

    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }

    
    
    @Override
    public String toString() {
        return String.format("Flower name :%s \n Flower type :%s \n Quantity :%d \n Price :RM%.2f \n Description :%s \n",prodName , prodType, prodQuantity, prodPrice, prodDescription);
    }
   

    
}
