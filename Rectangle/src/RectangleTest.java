
/**
 * <h1> Rectange </h1>
 *    this projects provides creating a square object
 *    you can define its length and wide sizes than
 *    this app will check it for you, is it square or not?
 *
 * @author Necip Fazıl Akay
 * @version 1.0.0
 * @since 2020-10-30
 */

public class RectangleTest {


    /**
     * this is main method which is creating square objects
     * and listing their informations
     * @param args unused
     * @return nothing
     */
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(); //square object 1 which has default properties
        Rectangle rectangle2 = new Rectangle(10 ,10); //square object 2 which is a square
        Rectangle rectangle3 = new Rectangle(100 ,200); // square object 3 which is not a square
        System.out.printf("Square 1;\n%s" +
                "\n~~~~~~" +                       // this part is using string format
                " \nSquare 2;\n%s" +               // also I can call println function 3 times but
                "\n~~~~~~" +                       // I do not need it I can do it with just one printf function
                "\nSquare 3;\n%s", rectangle1,rectangle2,rectangle3);

    }



}
