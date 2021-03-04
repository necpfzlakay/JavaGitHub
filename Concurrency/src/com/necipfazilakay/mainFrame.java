package com.necipfazilakay;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *  <h1> Square Mover </h1>
 *  This application is using java threading and creating new squares
 *  squares are moving to right and left on the screen
 *  user can add new square with s key
 * @author Necip Fazıl Akay
 * @since 03-01-2021
 */
public class mainFrame extends JFrame implements KeyListener, ActionListener {


    private mainDraw draw;
    public static int x = 500;
    public static int y = 500;

    /**
     * this is our threading function
     * it is running continuously
     */
    Timer myTimer = new Timer();
    TimerTask gorev = new TimerTask() {
        @Override
        public void run() {
            draw.move(x);
        }
    };

    /**
     * this method takes our keyboard inputs(spaces and s keys)
     * @param e
     */
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
        if(e.getKeyCode()== KeyEvent.VK_SPACE){
            draw.move(x);
            myTimer.schedule(gorev,0,100);
        }

        if(e.getKeyCode() == KeyEvent.VK_S){
            draw.change();
        }
        draw.move(x);

    }

    public void keyReleased(KeyEvent e) {

    }
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }

    /**
     * this is our constructor
     * it is forming our jpanel form and sending to the main method
     * also it calls threading function for maintaining
     */
    public mainFrame( ){
        this.draw=new mainDraw(0);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        //myTimer.schedule(gorev,0,100);
    }


    /**
     * this is our main method
     * it is establishing a new jpanel and showing on the screen
     * using our constructor's information
     * @param args
     */
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                mainFrame frame = new mainFrame();


                frame.setTitle("Concurrency");
                frame.setResizable(false);
                frame.setSize(x, y);
                frame.setMinimumSize(new Dimension(x, y));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(frame.draw);
                System.out.println(frame.draw);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}