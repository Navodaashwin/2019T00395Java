package com.company;

public interface Automobile {
    void gear();
    void wheel();

    default void changegear() {
        System.out.println("1st to 2nd gear");
    }
    static void pushclach(){
            System.out.println("push clach");
        }

}
