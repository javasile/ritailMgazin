package products;

public class Treadmill {
    private String inventarNumber;

    public Treadmill(String inventarNumber) {
        this.inventarNumber = inventarNumber;
    }

    public String getInventarNumber() {
        return inventarNumber;
    }

    public void setInventarNumber(String inventarNumber) {
        this.inventarNumber = inventarNumber;
    }

    @Override
    public String toString() {
        return "Treadmill{" +
                "inventarNumber='" + inventarNumber + '\'' +
                '}';
    }
}
