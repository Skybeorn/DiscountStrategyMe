package discountstrategyme;

public class CashRegister {

    private Invoice invoice;

    public void startNewSale(String customerId) {
        invoice = new Invoice(customerId);
    }
    
    public void addNewItem(String productId, double quantity){
        invoice.addItem(productId, quantity);
    }
    
    public void displayInvoice(){
        System.out.println(invoice.getInvoiceDataAsString());
    }
}
