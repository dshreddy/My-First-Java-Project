package multipleInheritance.standard;

public class Student extends Person implements StudentInterface {

    String subject;

    Student(String name, String subject) {
            super(name);
            this.subject = subject;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Subject: " + subject);
    }
    
    @Override
    public void computeGrade() {
        System.out.println("Computing grade");
    }

    @Override
    public void payFee() {
        System.out.println("Student is paying the fees");
    }   
}
