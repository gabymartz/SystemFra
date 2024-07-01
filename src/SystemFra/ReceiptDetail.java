package SystemFra;

public class ReceiptDetail {
    private String detailId;
    private String receiptId;
    private String branchId;
    private String productId;
    private int quantity;
    private double subtotal;

    public ReceiptDetail(String detailId, String receiptId, String branchId, String productId, int quantity, double subtotal) {
        this.detailId = detailId;
        this.receiptId = receiptId;
        this.branchId = branchId;
        this.productId = productId;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }


    public String getDetailId() {
        return detailId;
    }
    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getReceiptId() {
        return receiptId;
    }
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
