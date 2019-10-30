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
public class ServiceStockItem extends StockItem{
    
    
        @Override
    public StockType getItemType(){
        return StockType.SERVICEITEM;
    }
    public ServiceStockItem()
    {
        super();
    }
    public ServiceStockItem(String name)
    {
        super(name); 
    }
    
    public ServiceStockItem(String name, Integer qty)
    {
        super(name, 0);
    }

    @Override
    public Boolean isInStock() {
        return true;
    }
    
    
}
