package SystemFra;

public class Product {
    private String productId;
    private String productName;
    private double unitPrice;

    public Product(String productId, String productName, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
