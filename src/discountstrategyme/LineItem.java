package discountstrategyme;

public class LineItem {

    private double quantity;
    private Product product;
    private Product[] pDb;

    public LineItem(String productId, double quantity) {
        pDb = new Product[3];
        Product milk = new Product("1", "Milk", 15.00);
        milk.setDiscountStrategy(new XmasDiscount());
        pDb[0] = milk;

        Product juice = new Product("2", "Juice", 10.00);
        juice.setDiscountStrategy(new QuantityDiscount());
        pDb[1] = juice;

        Product tea = new Product("3", "Tea", 5.00);
        tea.setDiscountStrategy(new NoDiscount());
        pDb[2] = milk;

        this.product = findProduct(productId);
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    private Product findProduct(String productId) {
        Product id = null;

        for (Product p : pDb) {
            if (productId.equals(p.getId())) {
                id = p;
                break;
            }
        }

        return id;
    }

    public double getSubtotal() {
        return (quantity * product.getUnitCost() - product.getCalculatedDiscountAmount(quantity));
    }

    public double getSubtotalDiscountAmount() {
        return product.getCalculatedDiscountAmount(quantity);
    }

    public String getLineItemAsString() {
//        double discountAmt = product.getCalculatedDiscountAmount(quantity);
        return product.getId() + "     " + product.getName()
                + "     " + quantity + "     " + product.getUnitCost()
                + "     " + getSubtotalDiscountAmount() + "    "
                + getSubtotal();
    }

    public static void main(String[] args) {

        LineItem p = new LineItem("2", 5);
        String data = p.getLineItemAsString();
        System.out.println(data);
    }
}
