package SystemFra;

public class InvoiceDetail {
    private String detailId;
    private String invoiceId;
    private String productId;
    private int quantity;
    private double subtotal;

    public InvoiceDetail(String detailId, String invoiceId, String productId, int quantity, double subtotal) {
        this.detailId = detailId;
        this.invoiceId = invoiceId;
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

    public String getInvoiceId() {
        return invoiceId;
    }
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
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
