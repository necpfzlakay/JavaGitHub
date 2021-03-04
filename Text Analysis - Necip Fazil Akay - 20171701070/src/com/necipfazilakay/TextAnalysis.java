package com.necipfazilakay;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * this Program counts words and characters.
 * user can write to the text area and program counts
 * it is easy to use and understandable GUI application
 * @author Necip Fazıl Akay
 * @since 2020-12-01
 * @version 1.0.0
 */
public class TextAnalysis {
    private JPanel mainPanel;
    private JTextPane textPanel;
    private JButton clearButton;
    private JButton exitButton;
    private JPanel topPanel;                    // these are our variable which is holding and carrying
    private JPanel bottomPanel;                 // text's and button functions
    private JLabel chacarterCount;
    private JLabel wordCountLabel;
    private JTextField characterCountTextField;
    private JTextField wordCountTextField;
    private int wordcount=0;
    private int charactercount=0;


    /**
     * This is our application's constructor. It is including the button and area functions.
     */
    public TextAnalysis() {

        /**
         * this is clear function. It makes empty the text area and makes 0 count variables
         */
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.setText("");
                chacarterCount.setText("Character Count: " +charactercount);
                wordCountLabel.setText("Word Count: "  + wordcount);
            }
        });
        /**
         * exit button closes the application
         */
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        /**
         *  this method is reading the text area and working some functions
         *  with getDocument library
         */
        textPanel.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            /**
             *  this function counts added words and characters
             */
            public void insertUpdate(DocumentEvent e) {


                String text = textPanel.getText();
                text = text.replaceAll(" ","");
                charactercount = text.length();
                chacarterCount.setText("Character Count: " + String.valueOf(charactercount));
                text = textPanel.getText();
                String[] textList = text.split("\\s+");
                System.out.print(textList);
                wordcount = textList.length;
                wordCountLabel.setText("Word Count: " + String.valueOf(wordcount));
            }

            /**
             * and this function counts removed words and characters
             * @param e
             */
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = textPanel.getText();
                text = text.replaceAll(" ","");
                charactercount = text.length();
                 chacarterCount.setText("Character Count: " + String.valueOf(charactercount));
                text = textPanel.getText();
                String[] textList = text.split("\\s+");
                wordcount = textList.length;
                wordCountLabel.setText("Word Count: " + String.valueOf(wordcount));

            }

            /**
             * this method calls a loop for analyzing continuously the text area field
             * @param e
             */
            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });









    }


    /**
     * this is our main method
     * It works Jframe form and opens a screen
     * @param args
     */


    public static void main(String[] args) {
        JFrame frame = new JFrame("TextAnalysis");
        frame.setContentPane(new TextAnalysis().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }



}

