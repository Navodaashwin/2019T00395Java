package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("error");
        }
        //boolean
        boolean a = true;
        boolean b = false;
        System.out.println(!a && b);

        // % operation
        int z = 100;
        if (z % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

// input
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        System.out.println(q + w);

//for
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }

//do - while

        int j = 1;
        do
        {
            System.out.println(j);
            j++;
        }while (j<5);

// while - do

        int k = 10;
        while (k <= 20)
        {
            System.out.println(k);
            k++;
        }

// list
        ArrayList<String> names = new ArrayList<String>();
        names.add ("Navoda");
        names.add ("Ashwin");
        names.add ("Malagala");

        int L=0;
        while (L<names.size()){
            System.out.println(names.get(L));
            L++;
        }
        */
        /*vehicle veh1=new vehicle();
        veh1.name="KIA";
        veh1.color="black";
        veh1.speed=172.22;
        System.out.println(veh1.name+veh1.color+veh1.speed);
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(56,54);
        System.out.println(r2.area());
    }
        vehicle v1=new vehicle();
        v1.setName("toyota");
        System.out.println(v1.getName());

    }*/
        /*Car c1 = new Car();
        c1.code = "sss";
        c1.name = "audi";
        c1.start();
    }*/
        Car c1=new Car();
        c1.changegear();

}}