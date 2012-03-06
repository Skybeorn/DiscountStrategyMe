
package discountstrategyme;


public class NoDiscount implements DiscountStrategy{
    
    double baseRate = 0;
    
    
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
        return quantity * cost* baseRate ;
    }

    @Override
    public double getQuantityNeededForDiscount() {
        return 0;
    }

    @Override
    public void setQuantityNeededForDiscount(double minQuantity) {
    }
    
    public static void main(String[] args) {
        DiscountStrategy product = new NoDiscount();
        double discount = product.getCalculatedDiscountAmount(5, 100);
        
        if(discount == 0){
            System.out.println("Winner");
        }else{
            System.out.println("FAIL");
        }
    }
    
}
