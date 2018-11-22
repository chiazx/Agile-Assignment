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
public class OrderList {
    private CatalogProduct catalogProduct;
    private String OLID;
    private String prodID;
    private String quantity;

    @Override
    public String toString() {
        return "OrderList{" + "catalogProduct=" + catalogProduct + ", OLID=" + OLID + ", prodID=" + prodID + ", quantity=" + quantity + '}';
    }

    public OrderList() {
    }

    public OrderList(CatalogProduct catalogProduct, String OLID, String prodID, String quantity) {
        this.catalogProduct = catalogProduct;
        this.OLID = OLID;
        this.prodID = prodID;
        this.quantity = quantity;
    }

    public OrderList(String OLID, String prodID, String quantity) {
        this.OLID = OLID;
        this.prodID = prodID;
        this.quantity = quantity;
    }

    public CatalogProduct getCatalogProduct() {
        return catalogProduct;
    }

    public void setCatalogProduct(CatalogProduct catalogProduct) {
        this.catalogProduct = catalogProduct;
    }

    public String getOLID() {
        return OLID;
    }

    public void setOLID(String OLID) {
        this.OLID = OLID;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
}
