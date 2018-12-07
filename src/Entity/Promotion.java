/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author User
 */
public class Promotion {
    private String promotionID;
    private Date StartDate;
    private Date EndDate;
    private String promotionTitle;
    private int discountRate;
    private String promotionProduct;
        
    public Promotion(String promotionID, Date StartDate, Date EndDate, String promotionTitle, int discountRate, String promotionProduct) {
        this.promotionID = promotionID;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.promotionTitle = promotionTitle;
        this.discountRate = discountRate;
        this.promotionProduct = promotionProduct;
    }

    public String getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(String promotionID) {
        this.promotionID = promotionID;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    public String getPromotionTitle() {
        return promotionTitle;
    }

    public void setPromotionTitle(String promotionTitle) {
        this.promotionTitle = promotionTitle;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getPromotionProduct() {
        return promotionProduct;
    }

    public void setPromotionProduct(String promotionProduct) {
        this.promotionProduct = promotionProduct;
    }


    @Override
    public String toString() {
        return String.format("Promotion ID : %s\n" + promotionID,StartDate,EndDate,discountRate,promotionTitle,promotionProduct);
    }

    
}
