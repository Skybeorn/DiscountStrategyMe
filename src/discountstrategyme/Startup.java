
package discountstrategyme;

public class Startup {
    
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        
        cr.startNewSale("101");
        cr.addNewItem("1", 8);
        cr.addNewItem("2", 10);
        cr.addNewItem("3", 25);
        
        cr.displayInvoice();
        
    }
    
}
