package zoo;

public class Dolphin extends Animal implements Swim {

    private String colorOfDolphin;
    private int swimmingSpeed;

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    Dolphin() {
        super("Dolphin");
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of "+swimmingSpeed+" nautical miles per hour");
    }

    @Override
    public String toString() {
        return super.toString() + "Dolphin{" +
                "colorOfDolphin='" + colorOfDolphin + '\'' +
                ", swimmingSpeed=" + swimmingSpeed +
                '}';
    }
}

