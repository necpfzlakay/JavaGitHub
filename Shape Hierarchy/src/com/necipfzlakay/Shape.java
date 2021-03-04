package com.necipfzlakay;

/**
 * this is Shape abstract class
 * it is holding area variable and it has setter getter functions for area variable
 * also it has abstract calcArea function which will overrided calculanting the area function.
 */
public abstract class Shape {
    private double area; //area variable

    public abstract void calcArea(); // this is our abstract method


    public double getArea() {
        return area;
    }  //setter

    public void setArea(double area) {
        this.area = area;
    } //getter

    /**
     * our overrided toString func
     * it is reporting the information about shape's area
     * @return
     */
    @Override
    public String toString() {
        return "This is Shape Object. \nArea=" + getArea();
    }



}
