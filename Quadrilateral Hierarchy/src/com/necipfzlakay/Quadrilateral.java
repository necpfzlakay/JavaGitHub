package com.necipfzlakay;

/**
 * This is my Quadrilateral class.
 * It is providing our points and it is head of the hierarchy
 * everything is starting from here
 */

public class Quadrilateral {

    private int x1,y1;
    private int x2,y2;    // these are our point variables
    private int x3,y3;
    private int x4,y4;

    /**
     * this is my constructor
     * when we create an object this is using these variables.
     *
     */
    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }


    /**
     * this is my toString function
     * it is overrided and it is forming our visual presentation
     * other classes are using this class.
     *
     * I used string format again and arranged this method
     * for showing the points and its' values.
     * @return
     */
    @Override
    public String toString() {
        String str = String.format(
                "(x1,y1) = (%s,%s)\n" +
                        "(x2,y2) = (%s,%s)\n" +
                        "(x3,y3) = (%s,%s)\n" +
                        "(x4,y4) = (%s,%s)",x1,y1,x2,y2,x3,y3,x4,y4);
        return  str;

    }


    /**
     * these are setters and getters
     * these are managing our points' values.
     * @return
     */

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }




/*
    @Override
    public String toString() {

         String str = String.format(
                        "(x1,y1) = (%s,%s) ---> %.2f unit\n" +
                        "(x2,y2) = (%s,%s) ---> %.2f unit\n" +
                        "(x3,y3) = (%s,%s) ---> %.2f unit\n" +
                        "(x4,y4) = (%s,%s) ---> %.2f unit"
                        ,x1,y1,edgeXY1a(),x2,y2,edgeXY2b(),
                        x3,y3,edgeXY3c(),x4,y4,edgeXY4d());
        return  str;
    }

     String str = String.format(
                        "(x1,y1) = (%s,%s)\n" +
                        "(x2,y2) = (%s,%s)\n" +
                        "(x3,y3) = (%s,%s)\n" +
                        "(x4,y4) = (%s,%s)",x1,y1,x2,y2,x3,y3,x4,y4);
        return  str;

*/

}
