package multipleInheritance.standard;

public class Employee extends Person implements EmployeeInterface {

    int basicPay;

    Employee(String name, int basic) {
        super(name);
        this.basicPay = basic;
    }
    
    @Override
    public double computeSalary() {
        double salary;
        salary = this.basicPay + this.basicPay*0.5;
        return salary;
    }

    @Override
    public double computeTax() {
        return this.basicPay*0.1;
    }
}
