package multipleInheritance.standard;

public class Person {
    public String name;

    Person(String name) {
        this.name = name;
    }

    public void getDetails() {
        System.out.println("Name: "+name);
    }
}
