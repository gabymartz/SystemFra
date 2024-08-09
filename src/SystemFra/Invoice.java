package SystemFra;

import java.util.Date;
import java.util.List;

public class Invoice {
    private String invoiceId;
    private Customer customer;
    private Employee employee;
    private Branch branch;
    private Date date;
    private double total;
    private List<InvoiceDetail> details;

    public Invoice(String invoiceId, Customer customer, Employee employee, Branch branch, Date date, double total, List<InvoiceDetail> details) {
        this.invoiceId = invoiceId;
        this.customer = customer;
        this.employee = employee;
        this.branch = branch;
        this.date = date;
        this.total = total;
        this.details = details;
    }

    public String getInvoiceId() {
        return invoiceId;
    }
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
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

    public List<InvoiceDetail> getDetails() {
        return details;
    }
    public void setDetails(List<InvoiceDetail> details) {
        this.details = details;
    }
}