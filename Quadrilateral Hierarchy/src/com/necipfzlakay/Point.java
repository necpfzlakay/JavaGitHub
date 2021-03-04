package com.necipfzlakay;

/**
 * <h1> Quadrilateral Hierarchy </h1>
 * This program is uses your points which is you gave before
 * than it can calculate it's area.
 * it is working for Quadrilaterals which are Trapezoids Parallelograms Rectangles and Squares
 *
 * Also it is showing your points. Morover I can develop it,
 * I can add a visual table for each shape
 *
 * it is easy and understandable.
 *
 * <b> Note: </b>
 * this library has a hierarchy between Quadrilaterals and shape's common properties
 *
 * @author Necip Fazıl Akay
 * @version 1.0.0
 * @since 2020-11-07
 */

public class Point {


    /**
     * this is my main function
     * just select your shape which you want to calculate its area
     * than create an object and give its points in order
     * like x1, y1, x2, y2, x3, y3, x4, y4
     * program will calculate and show its area for you
     *
     *
     * @param args
     */
    public static void main(String[] args) {

/**
 * these are my shapes which are square trapezoid rectangle and parallelogram
 * and I showed with string format for less word.
 */
        Square square = new Square(0,0,2,0,2,2,0,2);
        Trapezoid trapezoid = new Trapezoid(3,4,5,4,6,2,2,2);
        Rectangle rectangle = new Rectangle(1,5,7,5,7,1,1,1);
        Parallelogram parallelogram = new Parallelogram(2,4,5,4,7,2,4,2);

        String str = String.format("Trapezoid; %n%s%n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                    "Parallelogram; %n%s%n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n" +
                                    "Rectangle; %n%s%n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                    "Square; %n%s%n",trapezoid,parallelogram,rectangle,square);

        System.out.printf(str);


    }


}
