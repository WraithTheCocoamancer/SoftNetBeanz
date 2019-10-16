/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

/**
 *
 * @author mhill9
 */
public class StockItem {
    
    private String name = "UNKNOWN";
    private Integer quantityInStock = 0;
    private Double sellingPrice = 1000000.00;
    private Double costPrice = 1000000.00;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
        this.name = name;
        }
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if(quantityInStock != null && quantityInStock >= 0){
        this.quantityInStock = quantityInStock;
        }
    }
    
    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if(sellingPrice != null && sellingPrice >= this.costPrice && sellingPrice >= 0) {
        this.sellingPrice = sellingPrice;
        }
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        if(costPrice != null && costPrice >= 0)
        {   
        this.costPrice = costPrice;
        }
    }
    
}
