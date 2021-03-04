package com.necipfzlakay;

/**
 * this is our book class
 * It has 4 different variable which are name,genre,author and price
 * than it is listing these variables with an understandable design
 */
public class Book {

    private String name;    // our book's name variable
    private String genre;   // our book's genre variable
    private String author;  // our book's author variable
    private double price;   // our book's price variable

    /**
     * our constructor which sets book information to the variables
     * @param name  name parameter which is String
     * @param genre genre parameter which is String
     * @param author    author parameter which is String
     * @param price     price parameter which is double
     */
    public Book(String name, String genre, String author, double price) {
        setName(name);
        setGenre(genre);
        setAuthor(author);
        setPrice(price);
    }

    /**
     * this is our second and default constructor. if user do not give any info about book
     * this constructor will work and give default values to the variables
     */
    public Book(){
        setName(null);
        setGenre(null);
        setAuthor(null);
        setPrice(0.0);
    }

    /**
     * this is our toString
     * it is listing the information
     * @return String
     */
    @Override
    public String toString() {
        return "Book Information:\n" +
                "Name=" + getName() +
                "\nGenre=" + getGenre() +
                "\nAuthor=" + getAuthor() +
                "\nPrice=" + getPrice() +"$" ;
    }




    /**
     * Price variable has some conditions. price variable must not be negative
     * so this edited setter method provides this conditions.
     * @param price Double
     */
    public void setPrice(double price) {
        if (price>=0)
            this.price = price;
        else
            System.out.println("Price can not be negative!");

    }

    /**
     * genre variable has some conditions. Genre variable must be History, Literature or Romance
     * so this edited setter method provides this conditions.
     * @param genre String
     */
    public void setGenre(String genre) {
        if (genre.equals("History") || genre.equals("Literature") || genre.equals("Romance") || genre == null)
            this.genre = genre;
        else
            System.out.println("Genre must be history, Literature or Romance!");
    }



    /**
     * These are our setters and getters. these methods are providing the security
     * @return
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }



}
