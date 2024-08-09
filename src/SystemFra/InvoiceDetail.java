package SystemFra;

// Clase InvoiceDetail (Detalle de Factura)

public class InvoiceDetail {
    private String detailId;
    private Invoice invoice;
    private Product product;
    private int quantity;
    private double subtotal;

    public InvoiceDetail(String detailId, Invoice invoice, Product product, int quantity, double subtotal) {
        this.detailId = detailId;
        this.invoice = invoice;
        this.product = product;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    public String getDetailId() {
        return detailId;
    }
    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public Invoice getInvoice() {
        return invoice;
    }
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
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