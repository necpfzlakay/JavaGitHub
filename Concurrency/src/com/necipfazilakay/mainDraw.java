package com.necipfazilakay;
import java.awt.Color;
import java.awt.Graphics;
import java.util.TimerTask;
import javax.swing.*;

/**
 * this is our drawing function
 * it is creating new squares and drawing on the screen
 */
public class mainDraw extends JComponent   {

    public int x = 50;
    public int y = 50;
    public int y2 = y+20;
    public int y3 = y2+70;
    public int y4 = y3+70;
    public int y5 = y4+70;              // these are our squares's location and size informations
    public int change = 0, a = 1;
    public int movement = 10;
    public int squareWidth = 50;
    public int squareHeight = 50;

    /**
     * constructor
     * it needs our y axis's information for avoiding the collapsing
     * @param y
     */
    public mainDraw(int y) {
        this.y = y;
    }

    /**
     * this function changes number of squares
     * preventing creating more than 5 squares
     */
    public void change(){
        if(change == -1 || change == 4)
            a *= -1;
        change += a;
        System.out.println(change + " " + a);

    }

    /**
     * this method is painting squares with switch case component
     * it takes change variable's value and creates or removes squares
     * user can create maximum 5 square
     * @param g
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);

        switch (change){
            case 0:
                g.drawRect(x, y, squareWidth, squareHeight);
                g.fillRect(x, y, squareWidth, squareHeight);
                break;
            case 1:
                g.drawRect(x, y, squareWidth, squareHeight);
                g.fillRect(x, y, squareWidth, squareHeight);
                g.drawRect(x, y2, squareWidth, squareHeight);
                g.fillRect(x, y2, squareWidth, squareHeight);
                break;
            case 2:
                g.drawRect(x, y, squareWidth, squareHeight);
                g.fillRect(x, y, squareWidth, squareHeight);
                g.drawRect(x, y2, squareWidth, squareHeight);
                g.fillRect(x, y2, squareWidth, squareHeight);
                g.drawRect(x, y3, squareWidth, squareHeight);
                g.fillRect(x, y3, squareWidth, squareHeight);
                break;
            case 3:
                g.drawRect(x, y, squareWidth, squareHeight);
                g.fillRect(x, y, squareWidth, squareHeight);
                g.drawRect(x, y2, squareWidth, squareHeight);
                g.fillRect(x, y2, squareWidth, squareHeight);
                g.drawRect(x, y3, squareWidth, squareHeight);
                g.fillRect(x, y3, squareWidth, squareHeight);
                g.drawRect(x, y4, squareWidth, squareHeight);
                g.fillRect(x, y4, squareWidth, squareHeight);
                break;
            case 4:
                g.drawRect(x, y, squareWidth, squareHeight);
                g.fillRect(x, y, squareWidth, squareHeight);
                g.drawRect(x, y2, squareWidth, squareHeight);
                g.fillRect(x, y2, squareWidth, squareHeight);
                g.drawRect(x, y3, squareWidth, squareHeight);
                g.fillRect(x, y3, squareWidth, squareHeight);
                g.drawRect(x, y4, squareWidth, squareHeight);
                g.fillRect(x, y4, squareWidth, squareHeight);
                g.drawRect(x, y5, squareWidth, squareHeight);
                g.fillRect(x, y5, squareWidth, squareHeight);
                break;


        }



    }

    /**
     * this method is providing the horizontal direction of squares
     * and provides maintaining of the threading method
     * @param width
     */
    public void move(int width) {

        if(x==width-(squareWidth))
            movement = -10;
        if(x==0)
            movement = +10;
        x = x + movement;
        System.out.println(x);
        repaint();

    }








}