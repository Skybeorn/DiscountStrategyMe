
package discountstrategyme;

public class QuantityDiscount implements DiscountStrategy {
    
    double baseRate = .5;
    double quantityNeeded = 5;
       
    
    @Override
    public double getDiscountBaserate() {
        return baseRate;
    }

    @Override
    public void setDiscountBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    @Override
    public double getCalculatedDiscountAmount(double quantity, double cost) {
        double discount = 0;
        
        if(quantity >= quantityNeeded){
            discount = quantity * cost * baseRate;
       
        }
        return discount;
    } 

    @Override
    public double getQuantityNeededForDiscount() {
        return quantityNeeded;
    }

    @Override
    public void setQuantityNeededForDiscount(double minQuantity) {
        this.quantityNeeded = minQuantity;
    }
    
    public static void main(String[] args) {
        DiscountStrategy product = new QuantityDiscount();
        double discount = product.getCalculatedDiscountAmount(5, 100);
        
        if(discount == 250){
            System.out.println("Winner");
        }else{
            System.out.println("YOU FAIL");
        }
        
        
        
    }
}
