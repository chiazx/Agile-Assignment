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
    private String StartDate;
    private String EndDate;
    private String promotionTitle;
    private int discountRate;
    private CatalogProduct CP;

    public Promotion() {
    }
    
    public Promotion(String promotionID, String StartDate, String EndDate, String promotionTitle, int discountRate) {
        this.promotionID = promotionID;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.promotionTitle = promotionTitle;
        this.discountRate = discountRate;
    }

    public Promotion(String promotionID, String StartDate, String EndDate, String promotionTitle, int discountRate, CatalogProduct CP) {
        this.promotionID = promotionID;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.promotionTitle = promotionTitle;
        this.discountRate = discountRate;
        this.CP = CP;
    }
    
    

    public String getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(String promotionID) {
        this.promotionID = promotionID;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
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

    public CatalogProduct getCP() {
        return CP;
    }

    public void setCP(CatalogProduct CP) {
        this.CP = CP;
    }

    @Override
    public String toString(){
        return String.format(" ID: %s\n Start Date: %s\n End Date: %s\n Title: %s\n Discount Rate: %d\n",promotionID ,StartDate,EndDate,promotionTitle,discountRate);
    }
}
