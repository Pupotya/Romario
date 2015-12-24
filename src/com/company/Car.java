package com.company;

/**
 * Created by admin on 21.12.2015.
 */
public class Car {
    public void start(){
        System.out.println("Paehali!!!");
    }

    public void stop(){
        System.out.println("ASTANAVITESb");
    }

    int distance = 0;

    public int drive(int howlong) {
        distance = howlong * 60;
        System.out.println("Startyem!!!"
                );
        System.out.println("Ya proehal "
                + distance + " km");
        return distance;
    }
}