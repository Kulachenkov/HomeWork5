package com.company;

public class Main {

    public static void main(String[] args) {

         //taskTwo();
        //taskThree();
        // taskFour();


    }


    public static void taskOne(){
        int [] firstArray = new int[]{1,2,3};
        double [] secondArray = {1.57,7.654,9.986};
        int [] myArray = {1,15,25,18,31};

    }
    public static void taskTwo(){
        int [] firstArray = new int[]{1,2,3};
        double [] secondArray = {1.57,7.654,9.986};
        int [] myArray = {1,15,25,18,31};

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i < firstArray.length-1){
                System.out.print(",");
            }
        }
        System.out.println("");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i < secondArray.length-1) {
                System.out.print(",");
            }
        }
        System.out.println("");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i < myArray.length - 1){
                System.out.print(",");
            }
        }

    }


    public static void taskThree(){
        int [] firstArray = new int[]{1,2,3};
        double [] secondArray = {1.57,7.654,9.986};
        int [] myArray = {1,15,25,18,31};


        for (int i = firstArray.length-1; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i != 0){
                System.out.print(",");
            }
        }
        System.out.println(" ");

        for (int i = secondArray.length-1; i >=0 ; i--) {
            System.out.print(secondArray[i]);
            if (i != 0){
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = myArray.length-1; i >=0; i--) {
            System.out.print(myArray[i]);
            if (i != 0){
                System.out.print(",");
            }
        }


    }

    public static void taskFour(){


        int [] firstArray = {1,2,3};

        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] % 2 !=0) {
                firstArray[i]++;
            }
            System.out.println(firstArray[i]);


        }
    }



}
