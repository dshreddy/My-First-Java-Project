package multipleInheritance.standard;

public class TeachingAssistant extends Student implements EmployeeInterface {

    TeachingAssistant(String name, String subject) {
            super(name, subject);
    }
    
    @Override
    public double computeSalary() {
        return 25000;
    }

    @Override
    public double computeTax() {
        return 0;
    }
}
