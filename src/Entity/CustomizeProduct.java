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
public class CustomizeProduct {
    private String custProdID;
    private String style;
    private String size;
    private String flower1;
    private String flower2;
    private String accessories1;
    private String accessories2;
    private String priority;
    
    public CustomizeProduct() {
    }

    public CustomizeProduct(String custProdID, String style, String size, String flower1, String flower2, String accessories1, String accessories2, String priority) {
        this.custProdID = custProdID;
        this.style = style;
        this.size = size;
        this.flower1 = flower1;
        this.flower2 = flower2;
        this.accessories1 = accessories1;
        this.accessories2 = accessories2;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "CustomizeProduct{" + "custProdID=" + custProdID + ", style=" + style + ", size=" + size + ", flower1=" + flower1 + ", flower2=" + flower2 + ", accessories1=" + accessories1 + ", accessories2=" + accessories2 + ", priority=" + priority + '}';
    }

    public String getAccessories1() {
        return accessories1;
    }

    public void setAccessories1(String accessories1) {
        this.accessories1 = accessories1;
    }

    public String getAccessories2() {
        return accessories2;
    }

    public void setAccessories2(String accessories2) {
        this.accessories2 = accessories2;
    }

    

    public String getCustProdID() {
        return custProdID;
    }

    public void setCustProdID(String custProdID) {
        this.custProdID = custProdID;
    }

    public String getFlower1() {
        return flower1;
    }

    public void setFlower1(String flower1) {
        this.flower1 = flower1;
    }

    public String getFlower2() {
        return flower2;
    }

    public void setFlower2(String flower2) {
        this.flower2 = flower2;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
}
