package com.necipfzlakay;
import java.util.ArrayList;

/**
 * <h1> Shape Hierarchy </h1>
 *      This Program calculates the Circle' and Rectangle's area
 *      which you gave the variables of the shape.
 *      it is easy to use and easy understandable
 *      well designed GUI.
 * @author Necip Fazil Akay
 * @version 1.0.0
 * @since 2020-11-15
 */

public class Test {
    /**
     * this is Main method
     * It is creating Shape object which is implemented with circle and rectangle class
     * classes are taking shape's variable from main method with constructor.
     * @param args unused
     */
    public static void main(String[] args) {
	// write your code here

        Shape shapeCirc = new Circle(5,5,5); // polimorphised with Circle class
        Shape shapeRect = new Rectangle(10,5);  // polimorphised with Rectangle class


        ArrayList<Shape> shape = new ArrayList<Shape>();    //this is our ArrayList which is holding our shapes' variables
        shape.add(shapeCirc);
        shape.add(shapeRect);   // adding shapes' variable to the arraylist


        /**
         * this is our foreach loop
         * it is rotating the arraylist
         */
        for (Shape i:shape) {
            System.out.println(i);
        }

    }
}
