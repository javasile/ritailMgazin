package products.discount;

public class Discount {
    int sku;
    double discountPrice;

    public Discount(int id, double discountPrice) {
        this.sku = id;
        this.discountPrice = discountPrice;
    }

    public Discount() {    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return sku +
                " :.: " + discountPrice;
    }

}
