package com.necipfzlakay;

import java.util.ArrayList;

/**
 *      <h1> Student Test</h1>
 *      <p>
 *          This program creates 10 students and provides their informations
 *          then listing with in a table.
 *          Program's output is easy understandable and usefull.
 *      </p>
 * @author Necip Fazıl Akay
 * @version 1.0.0
 * @since 2020-10-23
 */


public class StudentTest {
    /**
     * this class is doing that creating 10 Student object which is stu1,2,3,4,5,6,7,8,9,10
     * and giving them to the an ArrayList.
     * @param args unused
     */
    public static void main(String[] args) {
        /**
         * This is the main method. It is working alone
         * it just need a student class for creating new student objects
         * it is generating new objects and listing with in a for loop
         * there is no return just printing student's informations.
         */

        ArrayList<Student> studentsArray= new ArrayList<Student>(); // is our ArrayList which is keeping our students

        Student stu1 = new Student("Necip","Fazıl", "Akay", 60 ,125);
        Student stu2 = new Student("Ali"," Ahmet" ,"Asımoğlu ", 61,2);
        Student stu3 = new Student("Ayşe ","Elif" ,"Ayaz ", 62,3);
        Student stu4 = new Student("Cüneyt", "Semih", "Atsız ", 63,4);
        Student stu5 = new Student("Görkem", "Güney", "Gündüz", 64,5);
        Student stu6 = new Student("Semih", "","Şentürk", 65,6);
        Student stu7 = new

                Student("Merve", "Gizem", "Dinç", 66,7);
        Student stu8 = new Student("Burcu", "Sevim", "Keçeli", 67,8);
        Student stu9 = new Student("Şeyda" ,"Deniz", "Demirci ", 68,9);
        Student stu10 = new Student("Metin" ,"Mert", "Mehmetoğlu", 69,10);
                        /**
                         * I created new student object then added to the my studentsArray list
                         * and I collected one place all of my Students
                         */
        studentsArray.add(stu1);studentsArray.add(stu2); studentsArray.add(stu3);studentsArray.add(stu4);
        studentsArray.add(stu5);studentsArray.add(stu6);studentsArray.add(stu7);studentsArray.add(stu8);
        studentsArray.add(stu9);studentsArray.add(stu10);

        //this is my navbar for my Table
        System.out.println( "---First Name --- Second Name--- Last Name  --- Id     ---     Grade ");


        /**
         * this for loop is working for demonstrating my students with in an order
         * also I used string format method for make an understandable table
         * String.format(%-15s)
         * it means there are minimum 15 white space (words can fill these spaces)
         * a variable is carrying these Spaces
         * thanks to minus(-) word, white spaces is coming from the words
         * if I do not use minus(-) white spaces will come before words
         * -----------------------------------------
         * also I had to use getter methods because our students' informations are private
         * so we can not access them from another class.
         * we are using them relatively.
         */

        for (int i = 0; i <10; i++){
            String fname = String.format("%-15s",  studentsArray.get(i).getFirstName());
            System.out.printf("*  "  + fname);
            String sname = String.format("%-15s",  studentsArray.get(i).getSecondName());
            System.out.printf(  sname);
            String lname = String.format("%-15s",  studentsArray.get(i).getLastName());
            System.out.printf( lname);
            String stuid = String.format("%-15s",  studentsArray.get(i).getId());
            System.out.printf(  stuid);
            String stugrade = String.format("%-15s",  studentsArray.get(i).getGrade());
            System.out.printf( stugrade);
            System.out.println();

        }










    }
}
