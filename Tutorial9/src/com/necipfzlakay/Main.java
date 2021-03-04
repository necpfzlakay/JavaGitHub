package com.necipfzlakay;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String str = "a";
        // int str = 4;

        int[] myArray = new int[7];
        myArray[0] =4;
        myArray[1] =7;
        myArray[2] =8;
        System.out.println(myArray[1]);

        for (int i = 0; i<7; i++){
            myArray[i]= i*3;
            System.out.println(myArray[i]);
        }
        for (int i = 0; i<=7; i++){
            myArray[i]= i*3;
            System.out.println(myArray[i]);
        }
        for (int i = 0; i<=6; i--){
            myArray[i]= i*3;
            System.out.println(myArray[i]);
        }



        int[] myArray = new int[4];
        myArray = {4,8,12,16};
        int[] myArray2 = int[5];
        int[] myArray2 = int[myArray.length+1];

        for (int i = 0; i < myArray.size; i++){

        }
        for (int i = 0; i < myArray.length; i++){
            myArray2[0] = myArray[0];
        }
        myArray[4] =  20;


        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList[0] = 4;
        myArrayList.add(4);
        myArrayList.add(7);
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.size()-1);
        System.out.println(myArrayList.get(myArrayList.size()-1));















    }
}
