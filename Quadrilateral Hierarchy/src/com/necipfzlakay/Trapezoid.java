package com.necipfzlakay;

/**
 * this is Trapezoid class.
 * it is inherited from Quadrilateral class.
 * it is calculating the area with a method than
 * showing their area.
 */
public class Trapezoid extends Quadrilateral{

    /**
     *
     * this constructor taking the inherited Quadrilateral class's properties
     *
     */
    public Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);


    }

    /**
     * This is getArea method
     * it takes the points than calculatin these points's edges and heights
     * than calculates the area.
     *
     * <b> Note: </b>
     * this method uses Java's Math method and uses absolute value and square root methods.
     *
     * @returns an integer value which is area's value
     */
    public int getQuadArea(){

        double a,b,c,d,h, edgeA,edgeB;
        a = super.getX2() - super.getX1();
        b = super.getY2() - super.getY1();    // a and b are first edge's points
        c = super.getX4() - super.getX3();    // d and d are second edge's points
        d = super.getY4() - super.getY3();
        h = super.getY1() - super.getY4();    // this is height length
        a = Math.pow(a,2);
        b = Math.pow(b,2);
        c = Math.pow(c,2);
        d = Math.pow(d,2);
        h = Math.sqrt(Math.pow(h,2));
        edgeA = Math.sqrt(a+b);
        edgeB = Math.sqrt(c+d);
        return (int) (((edgeA+edgeB)/2)*h); // this is Trapezoid's area formula

    }


    /**
     * overrided toString function it is calling getArea method and adding it to the toString method
     * @return
     */
    @Override
    public String toString() {
         return super.toString() + "\nShape's area is: " + getQuadArea();
    }
}
