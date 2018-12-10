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
    private CustomizeProduct customizeProduct;
    private Order order;
    private String OLID;
    private String prodID;
   
    private String quantity;
    private String orderID;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public OrderList(CatalogProduct catalogProduct, Order order, String OLID, String quantity) {
        this.catalogProduct = catalogProduct;
        this.order = order;
        this.OLID = OLID;
        this.quantity = quantity;
        
    }
    
    public OrderList(String OLID, String prodID, String quantity, String orderID) {
        this.OLID = OLID;
        this.prodID = prodID;
        this.quantity = quantity;
        this.orderID = orderID;
    }
    
    public CustomizeProduct getCustomizeProduct() {
        return customizeProduct;
    }

    public void setCustomizeProduct(CustomizeProduct customizeProduct) {
        this.customizeProduct = customizeProduct;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderList(CatalogProduct catalogProduct, CustomizeProduct customizeProduct, Order order, String OLID, String prodID, String quantity) {
        this.catalogProduct = catalogProduct;
        this.customizeProduct = customizeProduct;
        this.order = order;
        this.OLID = OLID;
        this.prodID = prodID;
        this.quantity = quantity;
    }
   

    public OrderList(CustomizeProduct customizeProduct, String OLID, String prodID, String quantity) {
        this.customizeProduct = customizeProduct;
        this.OLID = OLID;
        this.prodID = prodID;
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "OrderList{" + "OLID=" + OLID + ", prodID=" + prodID + ", quantity=" + quantity + ", orderID=" + orderID + '}';
    }

    
    
}
