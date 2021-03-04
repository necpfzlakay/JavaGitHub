package necipfazilakay;

/**
 * this is Lion Class which is extended Animal class
 */
public class Lion extends Animal{

    /**
     * this is our constructor
     * it is taking
     * @param age       Lion's age
     * @param height    Lion's height
     * @param weight    Lion's weight
     *                  and using superclass' set functions
     */
    public Lion(int age, int height, int weight) {
        super(age, height, weight);
    }

    /**
     * this is override move method
     * it is defining Lion's move behaviour
     */
    @Override
    void move() {
        System.out.println("Lion is moving bravely...");
    }
    /**
     * this is override move method
     * it is defining Lion's eat behaviour
     */
    @Override
    void eat() {
        System.out.println("Lion is eating...");

    }



    @Override
    public String toString() {
        System.out.println("Lion Animal Created... "+
                "\nAge: " + super.getAge() +
                "\nHeight: " + super.getHeight() +
                "\nWeight: " + super.getWeight());
        move();
        eat();
        return "";
    }

}
