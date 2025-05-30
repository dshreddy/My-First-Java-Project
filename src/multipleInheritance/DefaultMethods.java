package multipleInheritance;

interface Animal {
    String name = "Animal";

    default void eat() {
        System.out.println("Animal is eating");
    }
}

interface LandAnimal extends Animal {

    @Override
    default void eat() {
        System.out.println("Land Animal is eating");
    }

    default void walk() {
        System.out.println("Walking");
    }
}

interface WaterAnimal extends Animal {

    @Override
    default void eat() {
        System.out.println("Water Animal is eating");
    }

    default void swim() {
        System.out.println("Swimming");
    }
}

class C implements LandAnimal, WaterAnimal {
    public void eat() {
        // Must explicitly resolve ambiguity

        // LandAnimal.super.eat();
        WaterAnimal.super.eat();
        System.out.println("C's own show");
    }
}

public class DefaultMethods{
    public static void main(String[] args) {
        C c = new C();
        c.eat();
    }
}

