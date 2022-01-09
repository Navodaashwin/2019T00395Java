package com.company;

/*public class Rectangle {
    double hi;
    double we;

    public Rectangle() {
        this.hi = 23;
        this.we = 12.2;
    }

    public Rectangle(double hi, double we) {
        this.hi = hi;
        this.we = we;
    }
    public double area(){
        return hi*we;
    }
}
public class Rectangle {
    int hi;
    int we;

    public void area(){
        System.out.println("area");
    }
}*/

public class Car implements Automobile{
    @Override
    public void gear() {
        System.out.println("gear");
    }
    @Override
    public void wheel(){
            System.out.println("4 wheel");
        }
}
