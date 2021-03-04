package com.necipfzlakay;

/**
 * this is our Rectangle class which is extended with Shape abstract class
 * so It need to override calcArea function than calculates the rectangle's area
 */
public class Rectangle extends Shape{

    private long width;  // horizontal edge's variable
    private long length; // vertical edge's variable

    /**
     * this is our constructor. It sets variables than call calcArea function
     * @param width  horizontal edge's variable
     * @param length  vertical edge's variable
     */
    public Rectangle(long width, long length){
        super();
        this.width=width;
        this.length=length;
        calcArea();
    }

    /**
     * This is Rectangle's calcArea function
     * it is calculating rectangles area
     *
     */
    @Override
    public void calcArea() {
        // rectangle's area formula is shortEdge*longEdge
        setArea(getWidth()*getLength());
    }

    public long getWidth() {
        return width;
    }  // width's getter func

    public long getLength() {
        return length;
    } // length's getter func


    /**
     * overrided toString method. Reports rectangle's informations and its area
     * @return
     */
    @Override
    public String toString() {
        return "\nRectangle Object Detetced.\n" +
                "width=" + width + ", length=" + length +
                "\n"+ "Area= " + getArea();
    }
}
