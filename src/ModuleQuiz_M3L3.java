class Student{
    int rollNo;
    int age;
    String name;
    String subject;

    public void payFees() {
        System.out.println("Paying full fees.");
    }
}


class Trainee extends Student {
    int stipend;

    // **************************** @Override is just namesake. It's not required.
    public void payFees() {
        System.out.println("Paying fees with 30% discount.");
    }
}


public class ModuleQuiz_M3L3 {
    public static void main(String []args) {
        Student traineeObject = new Trainee();
        traineeObject.payFees();
    }
}