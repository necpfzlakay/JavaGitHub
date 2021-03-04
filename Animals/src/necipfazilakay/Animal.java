package necipfazilakay;

/**
 *  This is Abstract Animal class
 *  age, height and weight variables are private
 *  move and eat methods are abstract
 */
public abstract class Animal {

    private int age;
    private int height;
    private int weight;
    abstract void move();
    abstract void eat();

    /**
     * it is our abstract class' constructor
     * it needs
     * @param age animal's age
     * @param height animal's height
     * @param weight animal's weight
     */
    public Animal(int age, int height, int weight){
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    /**
     * these are setters and getters
     * @return
     */
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }



}
