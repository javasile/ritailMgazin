package products.supplier;

public class Supplier {
    int id;
    String companyName;
    String cui;
    String contactName;
    String getContactPhone;
    String email;
    String billAdress;

    public Supplier(int id, String companyName, String cui, String contactName, String getContactPhone, String email, String billAdress) {
        this.id = id;
        this.companyName = companyName;
        this.cui = cui;
        this.contactName = contactName;
        this.getContactPhone = getContactPhone;
        this.email = email;
        this.billAdress = billAdress;
    }

    public Supplier() {    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setGetContactPhone(String getContactPhone) {
        this.getContactPhone = getContactPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBillAdress(String billAdress) {
        this.billAdress = billAdress;
    }

    @Override
    public String toString() {
        return  id +
                " :.: "+ companyName +
                " :.: " + cui +
                " :.: " + contactName +
                " :.: "+ getContactPhone +
                " :.: "+ email +
                " :.: " + billAdress ;
    }
}
