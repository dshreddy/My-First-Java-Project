package ComparableInterface;

/*
 * Java’s standard library has several built-in interfaces, including Serialzable, Clonable, and Comparable interfaces.
 * The Comparable interface defines how objects are compared. It is generally implemented to sort an array of objects. It has a compareTo() method, which needs to be implemented by a concrete class.
 */

class Length implements Comparable<Length> {
    int cm, mm;

    Length(int cm, int mm) {
        this.cm=cm;
        this.mm=mm;
    }

    @Override
    public int compareTo(Length obj2) {
        int mmObj1 = this.cm*10+this.mm;
        int mmObj2 = obj2.cm*10+obj2.mm;

        if (mmObj1>mmObj2)
            return 1;
        else
            return 0;

    }
}
public class Main {
    public static void main(String[] args) {
        Length l1 = new Length(4,5);
        Length l2 =new Length(2, 7);
        int retVal = l1.compareTo(l2);
        if (retVal==1)
            System.out.println("the first length is larger than the second");
        else
            System.out.println("the first length is less than or equal to the second");

    }
}
