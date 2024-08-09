package SystemFra;

// Clase Employee (Empleado)

public class Employee extends Person {
    private Branch branch;

    public Employee(String id, String firstName, String lastName, Branch branch) {
        super(id, firstName, lastName);
        this.branch = branch;
    }

    public Branch getBranch() {
        return branch;
    }
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}