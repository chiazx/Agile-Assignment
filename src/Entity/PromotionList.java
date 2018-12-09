/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author User
 */
public class PromotionList {
    private CatalogProduct catalogProduct;
    private Promotion promotion;
    private String promoListID;  

    public PromotionList() {
    }
    
    public PromotionList(CatalogProduct catalogProduct, Promotion promotion, String promoListID) {
        this.catalogProduct = catalogProduct;
        this.promotion = promotion;
        this.promoListID = promoListID;
    }
    
    public CatalogProduct getCatalogProduct() {
        return catalogProduct;
    }

    public void setCatalogProduct(CatalogProduct catalogProduct) {
        this.catalogProduct = catalogProduct;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public String getPromoListID() {
        return promoListID;
    }

    public void setPromoListID(String promoListID) {
        this.promoListID = promoListID;
    }
    
    @Override
    public String toString(){
        return String.format("Product : %s\nPromotion :%s\nPromotion List ID :%s\n", catalogProduct,promotion,promoListID);
    }
}
