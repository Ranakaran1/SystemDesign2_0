package DesignPattern.ProxyDesignPattern;

public class EmployeeProxy implements Employee {
    Employee employee;
    String role;
    EmployeeProxy(Employee employee,String role ){
        this.employee = employee;
        this.role = role;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public int getSalary() {
        if(role.equalsIgnoreCase("admin")){
            return employee.getSalary();
        }
        throw new RuntimeException("Can't authorize to access salary");
    }

    @Override
    public int getYearOfJoining() {
        return employee.getYearOfJoining();
    }
}
