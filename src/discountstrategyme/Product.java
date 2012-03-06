package discountstrategyme;

public class Product {

    private String id;
    private String name;
    private double unitCost;
    //Little lost as why i am Creating this
    private DiscountStrategy discountStrategy;

    public Product(String id, String name, double unitCost) {
        this.id = id;
        this.name = name;
        this.unitCost = unitCost;
    }

    public double getCalculatedDiscountAmount(double quantity) {
        return discountStrategy.getCalculatedDiscountAmount(quantity, unitCost);
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.length() == 0) {
            System.out.println("Data Failure, id cannt be null or Empty");
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public static void main(String[] args) {
        Product item = new Product("1234", "Belt", 20);
        DiscountStrategy strategy = new XmasDiscount();
        strategy.setDiscountBaseRate(.5);
        item.setDiscountStrategy(strategy);
        double discount = item.getCalculatedDiscountAmount(5);
        double result = 50;

        if (discount == result) {
            System.out.println("JAVA IS OK");
        } else {
            System.out.println("JAVA IS NOT OK");
        }


    }
}
