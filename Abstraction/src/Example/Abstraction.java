package Example;

public class Abstraction {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Mehedi");
        employee.setEmpId("E902212");
        employee.setAddress("Dhaka");
        
        System.out.println(employee.getCustomerInfo());
    }
}
