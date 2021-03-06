package products.detailProductPack;

public class ProductDetail {

    int SKU;
     String productName;
     double price;
     int stock;
     String category;
     String brand;
     String size;
     String color;
     String description;

    public ProductDetail(int SKU, String productName, double price, int stock, String category, String brand, String size, String color, String description) {
        this.SKU = SKU;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.description = description;
    }

    public ProductDetail() {

    }


    public void setStock(int stock) {
        this.stock = stock;
    }


    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return   SKU +
                " :.: " + productName  +
                " :.: " + price +
                " :.: " + stock +
                " :.: " + category  +
                " :.: " + brand  +
                " :.: " + size  +
                " :.: " + color  +
                " :.: " + description;
    }
}
