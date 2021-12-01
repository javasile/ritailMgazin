package products;

public class ProductDetail {

    private int SKU;
    private String productName;
    private double price;
    private int stock;
    private String category;
    private String brand;
    private String size;
    private String color;
    private String description;

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


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public String getProductName() {
        return productName;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
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
