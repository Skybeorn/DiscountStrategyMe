
package discountstrategyme;

public class Customer {
    
    private String lName;
    private String fName;
    private String customerId;
    
    public Customer(String lName, String fName, String customerId){
        this.lName = lName;
        this.fName = fName;
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    
    
    
}
