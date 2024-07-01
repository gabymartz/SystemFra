package SystemFra;

public class Customer extends Person {
    private String address;
    private String phone;

    public Customer(String id, String firstName, String lastName, String address, String phone) {
        super(id, firstName, lastName);
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
