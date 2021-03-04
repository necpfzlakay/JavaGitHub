package com.necipfzlakay;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * <h1> Book Lister </h1>
 * This program is listing your books.
 * when you add new entry program is adding a list for you
 * it is simple and easy useful
 * @author Necip Fazil Akay
 * @since 2020-11-25
 * @version 1.0.0
 */
public class Book_Test {
    /**
     * this is our main method. It creates scanners for user inputs
     * and forms an ArrayList and then creates objects.
     * with a foreach loop it prints books information
     * @param args unused
     */
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);      //scanner 1 for first object
        Scanner scan2 = new Scanner(System.in);     //scanner 2 for second object
        Scanner scan3 = new Scanner(System.in);     //scanner 3 for third object

        ArrayList<Book> Books = new ArrayList<Book>(); // This is our arraylist which is Books

        /**
         * these are our objects.
         * we are using scanner for books information
         * there are 3 book objects
         */
        System.out.println("Please enter First book's information in order (Name, Genre, Author,double price)");
        Book book1 = new Book(scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextDouble());
        System.out.println("Please enter Second book's information in order (Name, Genre, Author,double price)");
        Book book2 = new Book(scan2.nextLine(),scan2.nextLine(),scan2.nextLine(),scan2.nextDouble());
        System.out.println("Please enter Third book's information in order (Name, Genre, Author,double price)");
        Book book3 = new Book(scan3.nextLine(),scan3.nextLine(),scan3.nextLine(),scan3.nextDouble());

        Books.add(book1);Books.add(book2);Books.add(book3); //this comand line adds books to the ArrayList

/**
 * this is our foreach loop.
 * it is returning the ArrayList's elements and printing
 */
        for (Book book:  Books) {
            System.out.println("\n---------------\n");
            System.out.println(book);

        }








    }
}
