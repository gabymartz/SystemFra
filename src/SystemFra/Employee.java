package SystemFra;

public class Employee extends Person {
    private int branchId;

    public Employee(String id, String firstName, String lastName, int branchId) {
        super(id, firstName, lastName);
        this.branchId = branchId;
    }

    public int getBranchId() {
        return branchId;
    }
    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
}
