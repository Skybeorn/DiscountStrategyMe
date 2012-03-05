
package discountstrategyme;


public class XmasDiscount implements DiscountStrategy {
    
    double discountBaseRate = .25;
    
   
    @Override
    public double getDiscountBaserate() {
        return discountBaseRate;
    }

    @Override
    public void setDiscountBaseRate(double baseRate) {
        this.discountBaseRate = baseRate;
    }

    @Override
    public double getCalculatedDiscountAmount(double quanitiy, double cost) {
       return quanitiy * cost * discountBaseRate;
    }

    @Override
    public double getQuantityNeededForDiscount(){
        return 0;
    }

    @Override
    public void setQuantityNeededForDiscount(double minQuantity) {
    }
    
    public static void main(String[] args) {
        
        DiscountStrategy product = new XmasDiscount();
        double discount = product.getCalculatedDiscountAmount(10, 10);
        
        if(discount == 25){
            System.out.println("Winner");
        }else{
            System.out.println("Fail");
        }
    }
}
