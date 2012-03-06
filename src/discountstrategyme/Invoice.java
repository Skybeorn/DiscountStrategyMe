package discountstrategyme;

public class Invoice {

    private Customer customer;
    private Customer[] cDb;
    private LineItem[] lineItems = new LineItem[0];

    public Invoice(String customerIdNo) {
        cDb = new Customer[2];
        Customer one = new Customer("Doe", "John", "100");
        Customer two = new Customer("Doe", "Jane", "101");
        cDb[0] = one;
        cDb[1] = two;

        customer = this.findCustomer(customerIdNo);
    }

    public void addItem(String itemId, double quantity) {
        LineItem item = new LineItem(itemId, quantity);
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length - 1] = item;
        lineItems = temp;
    }

    public double getFinalSaleAmount() {
        double total = 0;
        for (LineItem prod : lineItems) {
            total = total + prod.getSubtotal();
        }
        return total;
    }

    public double getFinalDiscountAmount() {
        double total = 0;
        for (LineItem prod : lineItems) {
            total += prod.getSubtotalDiscountAmount();
        }
        return total;
    }

    public String getInvoiceDataAsString() {
        String stuff = customer.getCustomerId() + "\n"
                + customer.getfName() + " "
                + customer.getlName() + "\n\n";

        stuff += "ID    Name                 Qty       Cost      Discount     Total\n";
        stuff += "=================================================================\n";

        for (LineItem item : lineItems) {
            stuff += item.getLineItemAsString() + "\n";
        }

        stuff += "\n ==================================\n";
        stuff += "Total Owned: " + getFinalSaleAmount() + "\n";
        stuff += "Total Saved: " + getFinalDiscountAmount();

        return stuff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private Customer findCustomer(String custId) {
        Customer cust = null;

        for (Customer c : cDb) {
            if (custId.equals(c.getCustomerId())) {
                cust = c;
                break;
            }
        }

        return cust;
    }
    
    public static void main(String[] args) {
        Invoice invoice = new Invoice("101");
        Customer customer = invoice.getCustomer();
        System.out.println(customer.getlName());
        
        invoice.addItem("1", 2);
        for(LineItem item : invoice.lineItems){
            System.out.println(item.getLineItemAsString());
        }
    }
}
