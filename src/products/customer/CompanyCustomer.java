package products.customer;

public class CompanyCustomer {
    public int id;
    String vies;
    String billAddress;

    public CompanyCustomer(int id, String vies, String billAddress) {
        this.id = id;
        this.vies = vies;
        this.billAddress = billAddress;
    }

    public CompanyCustomer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVies() {
        return vies;
    }

    public void setVies(String vies) {
        this.vies = vies;
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
    }

    @Override
    public String toString() {
        return  id +
                " :.: " + vies +
                " :.: " + billAddress;
    }
}
