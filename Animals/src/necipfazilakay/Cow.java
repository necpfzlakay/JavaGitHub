package necipfazilakay;

/**
 * this is Cow Class which is extended Animal class
 */
public class Cow extends Animal{

    /**
     * this is our constructor
     * it is taking
     * @param age       Cow's age
     * @param height    Cow's height
     * @param weight    Cow's weight
     *                  and using superclass' set functions
     */
    public Cow(int age, int height, int weight) {
        super(age, height, weight);
    }

    /**
     * this is override move method
     * it is defining Cow's move behaviour
     */
    @Override
    void move() {
        System.out.println("Cow is moving slowly...");
    }
    /**
     * this is override move method
     * it is defining Cow's eat behaviour
     */
    @Override
    void eat() {
        System.out.println("Cow is eating hay and green grass...");
    }

    @Override
    public String toString() {
        System.out.println("Cow Animal Created... "+
                "\nAge: " + super.getAge() +
                "\nHeight: " + super.getHeight() +
                "\nWeight: " + super.getWeight());
        move();
        eat();

        return "";
    }
}
