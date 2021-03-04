package com.necipfzlakay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter your Character's name: ");
        String userName = scan.nextLine();
        int str, dex, con, Int, wis,cha;
        String character = null;


            System.out.println("Please enter your character (fighter,paladin,ranger,wizard,thief)  ");
            character = scan.nextLine();
        switch(character){
            case "fighter":
                System.out.printf("Enter your Character's: \nSTR: "); str = scan.nextInt();
                System.out.printf("DEX: "); dex = scan.nextInt();
                System.out.printf("CON: "); con = scan.nextInt();
                System.out.printf("INT: "); Int = scan.nextInt();
                System.out.printf("WIS: "); wis = scan.nextInt();
                System.out.printf("CHA: "); cha = scan.nextInt();
                System.out.println("\n ---------------RESULT---------------");
                Fighter fighter = new Fighter(userName, str,dex,con,Int,wis,cha);
                System.out.println("Name: " + fighter.getName());
                System.out.println("Gender: " + fighter.getGender());
                System.out.println("Class: " + fighter.getClas());
                System.out.println("Race: " + fighter.getRace());
                System.out.println("");
                System.out.println("STR: " + fighter.getStr());
                System.out.println("DEX: " + fighter.getDex());
                System.out.println("CON: " + fighter.getCon());
                System.out.println("INT: " + fighter.getInt());
                System.out.println("WIS: " + fighter.getWis());
                System.out.println("CHA: " + fighter.getCha());
                System.out.println("");
                System.out.println("TOTAL: " + fighter.getTotal());
                System.out.println("");
                break;
            case "paladin":
                System.out.printf("Enter your Character's: \nSTR: "); str = scan.nextInt();
                System.out.printf("DEX: "); dex = scan.nextInt();
                System.out.printf("CON: "); con = scan.nextInt();
                System.out.printf("INT: "); Int = scan.nextInt();
                System.out.printf("WIS: "); wis = scan.nextInt();
                System.out.printf("CHA: "); cha = scan.nextInt();
                System.out.println("\n ---------------RESULT---------------");

                Paladin paladin = new Paladin(userName,str,dex,con,Int,wis,cha);
                System.out.println("Name: " + paladin.getName());
                System.out.println("Gender: " + paladin.getGender());
                System.out.println("Class: " + paladin.getClas());
                System.out.println("Race: " + paladin.getRace());
                System.out.println("");
                System.out.println("STR: " + paladin.getStr());
                System.out.println("DEX: " + paladin.getDex());
                System.out.println("CON: " + paladin.getCon());
                System.out.println("INT: " + paladin.getInt());
                System.out.println("WIS: " + paladin.getWis());
                System.out.println("CHA: " + paladin.getCha());
                System.out.println("");
                System.out.println("TOTAL: " + paladin.getTotal());
                System.out.println("");
                break;
            case "ranger":
                System.out.printf("Enter your Character's: \nSTR: "); str = scan.nextInt();
                System.out.printf("DEX: "); dex = scan.nextInt();
                System.out.printf("CON: "); con = scan.nextInt();
                System.out.printf("INT: "); Int = scan.nextInt();
                System.out.printf("WIS: "); wis = scan.nextInt();
                System.out.printf("CHA: "); cha = scan.nextInt();
                System.out.println("\n ---------------RESULT---------------");

                Ranger ranger = new Ranger(userName,str,dex,con,Int,wis,cha);
                System.out.println("Name: " + ranger.getName());
                System.out.println("Gender: " + ranger.getGender());
                System.out.println("Class: " + ranger.getClas());
                System.out.println("Race: " + ranger.getRace());
                System.out.println("");
                System.out.println("STR: " + ranger.getStr());
                System.out.println("DEX: " + ranger.getDex());
                System.out.println("CON: " + ranger.getCon());
                System.out.println("INT: " + ranger.getInt());
                System.out.println("WIS: " + ranger.getWis());
                System.out.println("CHA: " + ranger.getCha());
                System.out.println("");
                System.out.println("TOTAL: " + ranger.getTotal());
                System.out.println("");
                break;
            case "wizard":
                System.out.printf("Enter your Character's: \nSTR: "); str = scan.nextInt();
                System.out.printf("DEX: "); dex = scan.nextInt();
                System.out.printf("CON: "); con = scan.nextInt();
                System.out.printf("INT: "); Int = scan.nextInt();
                System.out.printf("WIS: "); wis = scan.nextInt();
                System.out.printf("CHA: "); cha = scan.nextInt();
                System.out.println("\n ---------------RESULT---------------");

                Wizard wizard = new Wizard(userName,str,dex,con,Int,wis,cha);
                System.out.println("Name: " + wizard.getName());
                System.out.println("Gender: " + wizard.getGender());
                System.out.println("Class: " + wizard.getClas());
                System.out.println("Race: " + wizard.getRace());
                System.out.println("");
                System.out.println("STR: " + wizard.getStr());
                System.out.println("DEX: " + wizard.getDex());
                System.out.println("CON: " + wizard.getCon());
                System.out.println("INT: " + wizard.getInt());
                System.out.println("WIS: " + wizard.getWis());
                System.out.println("CHA: " + wizard.getCha());
                System.out.println("");
                System.out.println("TOTAL: " + wizard.getTotal());
                System.out.println("");
                break;
            case "thief":
                System.out.printf("Enter your Character's: \nSTR: "); str = scan.nextInt();
                System.out.printf("DEX: "); dex = scan.nextInt();
                System.out.printf("CON: "); con = scan.nextInt();
                System.out.printf("INT: "); Int = scan.nextInt();
                System.out.printf("WIS: "); wis = scan.nextInt();
                System.out.printf("CHA: "); cha = scan.nextInt();
                System.out.println("\n ---------------RESULT---------------");

                Thief thief = new Thief(userName,str,dex,con,Int,wis,cha);
                System.out.println("Name: " + thief.getName());
                System.out.println("Gender: " + thief.getGender());
                System.out.println("Class: " + thief.getClas());
                System.out.println("Race: " + thief.getRace());
                System.out.println("");
                System.out.println("STR: " + thief.getStr());
                System.out.println("DEX: " + thief.getDex());
                System.out.println("CON: " + thief.getCon());
                System.out.println("INT: " + thief.getInt());
                System.out.println("WIS: " + thief.getWis());
                System.out.println("CHA: " + thief.getCha());
                System.out.println("");
                System.out.println("TOTAL: " + thief.getTotal());
                System.out.println("");
                break;
            default:
                System.out.println("wrong entry,");
                break;


        }


            System.out.println("---------------------\n" +
                    "\n" +
                    "Available Classes\n" +
                    "************************\n" +
                    "Fighter\n" +
                    "Paladin\n" +
                    "Ranger\n" +
                    "Wizard\n" +
                    "Thief\n" +
                    "************************ \n");





    }
}
