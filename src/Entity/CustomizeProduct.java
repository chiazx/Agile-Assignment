/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import java.util.List;
/**
 *
 * @author boonk
 */
public class CustomizeProduct {
    private String custProdID;
    private String style;
    private String size;
    private String priority;
    
    public CustomizeProduct() {
    }

    public CustomizeProduct(String custProdID) {
        this.custProdID = custProdID;
    }

    public CustomizeProduct(String custProdID, String style, String size, String priority) {
        this.custProdID = custProdID;
        this.style = style;
        this.size = size;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "CustomizeProduct{" + "custProdID=" + custProdID + ", style=" + style + ", size=" + size + ", priority=" + priority + '}';
    }

    
   

    public String getCustProdID() {
        return custProdID;
    }

    public void setCustProdID(String custProdID) {
        this.custProdID = custProdID;
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
