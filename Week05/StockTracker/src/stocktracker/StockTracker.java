/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.*;


/**
 *
 * @author mhill9
 */
public class StockTracker {
    

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Manual");
        StockItem objTestItem2 = new PhysicalStockItem("Halo 3", 100);
        StockItem objTestItem3 = new ServiceStockItem ("Delivery");
        
        if(objTestItem1.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 1 is a PHYSICAL stock item");
        }else{
            System.out.println("Item 1 is a SERVICE stock Item");
        }
        
        if(objTestItem2.getItemType() == StockType.PHYSICALITEM){
           System.out.println("Item 2 is a PHYSICAL stock item");
        }else{
            System.out.println("Item 2 is a SERVICE stock Item"); 
        }
        
         if(objTestItem3.getItemType() == StockType.PHYSICALITEM){
           System.out.println("Item 3 is a PHYSICAL stock item");
        }else{
            System.out.println("Item 3 is a SERVICE stock Item"); 
        }
        PhysicalStockItem objPhysicalItem =
                new PhysicalStockItem("Snuff: A Diskworld book by Terry Pratchett", 100);
        ServiceStockItem objVirtualItem =
                new ServiceStockItem("Wintersmith: A Diskworld eBook by Terry Pratchett");
        
        String strMessage = objPhysicalItem.getName()
                + ", Is in stock = " + objPhysicalItem.isInStock()
                + ", Qty in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        strMessage = objVirtualItem.getName()
                + ", Is in stock = " + objVirtualItem.isInStock()
                + ", Qty in stock: " + objVirtualItem.getQuantityInStock();
    }
    
}
