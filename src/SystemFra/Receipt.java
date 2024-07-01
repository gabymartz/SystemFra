package SystemFra;

import java.util.Date;

public class Receipt {
    private String receiptId;
    private String customerId;
    private String employeeId;
    private String branchId;
    private Date date;
    private double total;

    public Receipt(String receiptId, String customerId, String employeeId, String branchId, Date date, double total) {
        this.receiptId = receiptId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.branchId = branchId;
        this.date = date;
        this.total = total;
    }


    public String getReceiptId() {
        return receiptId;
    }
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
}
