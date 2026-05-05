package DesignPattern.ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Employee employee = new EmployeeImpl();
        Employee employeeProxy = new EmployeeProxy(employee, "User");
        System.out.println(employeeProxy.getName());
        System.out.println(employeeProxy.getSalary());
    }
}
