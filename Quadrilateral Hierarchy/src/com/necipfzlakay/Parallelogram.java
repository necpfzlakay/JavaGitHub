package com.necipfzlakay;

public class Parallelogram extends Trapezoid{


    public Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

    }

    /**
     * this is parallelogram class
     * it is using getArea function and editing toString method and
     * adds Parallel's area
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
        int height = 0;
        double horizontal =  0;
        height = Math.abs(super.getY3()-super.getY1());

        double a = (super.getX1()-super.getX2());
        double b = (super.getY1()-super.getY2());

        a = Math.pow(a,2);
        b = Math.pow(b,2);
        horizontal = Math.sqrt(a+b);
        System.out.println(height + " " + horizontal);
        return (int) (height*horizontal);
    }
*/

}
