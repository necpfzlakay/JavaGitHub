package com.necipfzlakay;

public class Rectangle extends Trapezoid{


    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    /**
     * this is parallelogram class
     * it is using getArea function and editing toString method and
     * adds Rectangle's area
     * @return
     */

    @Override
    public String toString() {
        return super.toString() + super.getQuadArea();

    }


    /**
     * actually at first, I wrote different method for shapes but
     * I realised that Parallels Rectangles and Squares area can calculate
     * with Trapezoid's area formula so I inherited this function
     * and I used its formula. so these comment lines were my first idea than I changed the algorithm.
     */
    /*
    public int getArea(){
        double a,b,c,d, edgeA,edgeB;
        a = super.getX2() - super.getX1();
        b = super.getY2() - super.getY1();
        c = super.getX3() - super.getX2();
        d = super.getY3() - super.getY2();

        a = Math.pow(a,2);
        b = Math.pow(b,2);
        c = Math.pow(c,2);
        d = Math.pow(d,2);

        edgeA = Math.sqrt(a+b);
        edgeB = Math.sqrt(c+d);

        return (int) (edgeA*edgeB);
    }
    */

}
