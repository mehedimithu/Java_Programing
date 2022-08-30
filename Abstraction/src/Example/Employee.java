package Example;

public class Employee extends Customar {
    private String id;

    public String getEmpId() {
        return id;
    }

    public void setEmpId(String empId) {
        this.id = empId;
    }

    @Override
    public String getCustomerInfo() {
        return String.format("Customer: %s , Employee Id: %s, Address: %s", getName(), getEmpId(), getAddress());
    }

}
