package products.customer;

public class Customer {
    public int id;
    String firstAndLastName;
    String phone;
    String email;
    String deliveryAddress;

    public Customer(int id, String firstAndLastName, String phone, String email, String deliveryAddress) {
        this.id = id;
        this.firstAndLastName = firstAndLastName;
        this.phone = phone;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
    }

    public Customer() {    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstAndLastName(String firstAndLastName) {
        this.firstAndLastName = firstAndLastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return  id +
                " :.: " + firstAndLastName +
                " :.: " + phone +
                " :.: " + email +
                " :.: " + deliveryAddress;
    }

}
