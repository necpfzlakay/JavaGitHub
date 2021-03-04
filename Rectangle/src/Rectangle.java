/**
 *
 * This is my Rectangle class which is holding edges' informations
 * also providing their informations with toString and
 * calculating their area sizes and giving an information about
 * is it square or not?
 */

public class Rectangle {



    //our edges variables
    private int length;
    private int width;


    /**
     * to string method which is giving all informations about the square object
     * when this class called without any method or variable toString is working and
     * listing all informations about square
     * @return String which is square's informations
     */
    @Override
    public String toString() {
        String isSquare = null;

        if ( getLength() != 0 || getWidth() != 0)
            if (isSquare()==true)
                isSquare = "This object is a square.";      //these if else statements are checking that
            else                                            // first there is edges correctly?
                isSquare = "This object is not a square.";  // than isSquare() function's return is true or false?
        else
            isSquare = "This object is not a square.";


        return  "A new object defined. \n" +
                "length=" + length +
                "\nwidth=" + width + "\n" +
                isSquare;
    }

    /**
     * this is our constructor
     * this constructor gives default informations which is zero edges, to the square.
     * there is no parameter
     */
    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }

    /**
     * this is our secont constructor which is setting given informations to
     * our edges's variables.
     * So this constructor forms a square with setters and getters.
     * @param length it is vertical line size of square
     * @param width it is horizontal line size of square
     */
    public Rectangle(int length, int width){
        setLength(length);setWidth(width);
        this.length = getLength();
        this.width = getWidth();
    }

    /**
     * this method is checking the square, is it square or not?
     * method calculating the edges' sizes and
     * @returns true or false booleans. True means it is a square and false means it is not a square
     */
    public boolean isSquare(){
        int result =  getLength() - getWidth();
        boolean square = (result==0) ? true: false;
        return square;
    }


    /**
     * this is getArea method
     * which is calculating the square's area size and
     * @returns an double.
     */
    public double getArea(){

        return getLength()*getLength();

    }


    /**
     * these are our setters and getters
     * which is protecting methods for our variables.
     */
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
