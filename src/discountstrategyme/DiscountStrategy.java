
package discountstrategyme;

//INnterface, what do all Discounts have in common? 
public interface DiscountStrategy {
    
    // it's important to note that this is a double because we have the
    //Possibility for a dollar amount discount, as well as a % based discount.
    double getDiscountBaserate();
    
    void setDiscountBaseRate(double baseRate);
    
    //To get the CalculatedDiscountAmount we need 2 things. 
    //The amount purchased and the price per unit.
    // Every Discount has this, so we show those values here.
    double getCalculatedDiscountAmount(double quanitiy, double cost);
    
    //Not every discount uses this, but it doesn't hurt for one to have it. 
    // 
    double getQuantitiyNeededForDiscount ();
    
    void setQuantitiyNeededForDiscount(double minQuanitiy);
    
    
    
    
    
    
    
    
    
}
