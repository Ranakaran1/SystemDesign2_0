package DesignPattern.ProxyDesignPattern;

public class EmployeeImpl implements Employee{
    @Override
    public String getName() {
        return "Namit";
    }

    @Override
    public int getSalary() {
        return 100000;
    }

    @Override
    public int getYearOfJoining() {
        return 2026;
    }
}
