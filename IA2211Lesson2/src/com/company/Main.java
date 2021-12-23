package com.company;

public class Main {

    static String name="Ashwin";
    public static final int serialNum = 10; //defind constent
    boolean isActive = false;
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("Name " + name);

        String myname ="Navoda" + " " + "Ashwin";
        System.out.println(myname);

        int valA = 10;
        double valB = (double) valA;

        float valC = valA / (float) 2.5;
        System.out.println("valC = " + valC);
        int age = 28;
        if(age<18){
            System.out.println("Not eligible");
        }
        else if(age>88){
            System.out.println("Too lod");
        }
        else{
            System.out.println("Allowed");
        }
    }
}
