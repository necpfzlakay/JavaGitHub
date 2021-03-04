package com.necipfzlakay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        Characters character = new Characters();

        System.out.print("Enter your Name: ");
        character.setName(scan.nextLine());
        System.out.print("Enter your Gender(Male, Female): ");
        character.setGender(scan.nextLine());
        System.out.print("Enter your Character Class (Fighter,Paladin, Ranger, Wizard, Thief): ");
        character.setChaClass(scan.nextLine());
        System.out.print("Enter your Race (Human, Elf, Dwarf): ");
        character.setRace(scan.nextLine());

        System.out.println();








    }
}
