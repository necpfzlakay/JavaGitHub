package com.necipfzlakay;

/**
 * This Student class is providing and protecting students informations
 * for ex I can give a limit to the grade variable like:
 *
 * setGrade(){
 * if(grade>=100)
 *      this.grade = grade;
 *
 * else
 *      System.out.println("grade must be between 0-100);
 * }
 *
 *  we can provide our conditions as we can see
 */

public class Student {
    private String firstName,secondName,LastName;
    private int id;
    private int grade;

    /**
     *
     * @param firstName first name
     * @param secondName second name
     * @param lastName last name
     * @param id school number
     * @param grade grade
     *
     * these parameters are our students' informations
     *
     * and public Student is our constructor. we will give
     * student's informations when we will crete new Student object
     * via setter commands
     */

    public Student(String firstName,String secondName, String lastName,int id,int grade){
    setFirstName(firstName);
    setSecondName(secondName);
    setLastName(lastName);
    setId(id);
    setGrade(grade);

    }


    /**
     * These are Setters And Getters
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
