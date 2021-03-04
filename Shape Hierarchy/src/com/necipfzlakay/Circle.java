package com.necipfzlakay;

/**
 * this is our circle class which is extended with Shape abstract class
 * so It need to override calcArea function than calculates the circle's area
 */
public class Circle extends Shape{
    private long centerX;
    private long centerY;       // these are our variables
    private double radius;      //circle's x,y and radius informations


    /**
     * this is our constructor. It sets variables than call calcArea function
     * @param centerX  circle's  X coordinate variable
     * @param centerY circle's  Y coordinate variable
     * @param radius    Circle's radius size variable
     */
    public Circle(long centerX,long centerY,double radius){
        this.centerX = centerX;
        this.centerY =  centerY;
        this.radius =  radius;
        calcArea();
    }

    public long getCenterX() {
        return centerX;
    }  // X coordinate's getter method
    public long getCenterY() {
        return centerY;
    } // y coordinate's getter method


    /**
     * this is our overrided calcArea function
     */
    @Override
    public void calcArea() {
        // πr^2 is Circle's area formula.
        setArea(Math.PI * ((getRadius()/2)*(getRadius()/2)));
    }


    /**
     * overrided toString method. Reports circle's informations and its area
     * @return
     */
    @Override
    public String toString() {
        return "\nCircle Object Detected.\n" +
                "Center X: " + getCenterX()+
                ", Center Y: " + getCenterY()+
                "\nArea= " + getArea();
    }




    public double getRadius() {
        return radius;
    }

}
