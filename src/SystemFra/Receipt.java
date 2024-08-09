package SystemFra;

import java.util.Date;
import java.util.List;

// Clase Receipt (Recibo)

public class Receipt {
    private String receiptId;
    private Customer customer;
    private Employee employee;
    private Branch branch;
    private Date date;
    private double total;
    private List<ReceiptDetail> details; // Relación con ReceiptDetail

    public Receipt(String receiptId, Customer customer, Employee employee, Branch branch, Date date, double total, List<ReceiptDetail> details) {
        this.receiptId = receiptId;
        this.customer = customer;
        this.employee = employee;
        this.branch = branch;
        this.date = date;
        this.total = total;
        this.details = details;
    }

    public String getReceiptId() {
        return receiptId;
    }
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Branch getBranch() {
        return branch;
    }
    public void setBranch(Branch branch) {
        this.branch = branch;
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

    public List<ReceiptDetail> getDetails() {
        return details;
    }
    public void setDetails(List<ReceiptDetail> details) {
        this.details = details;
    }
}