package com.company;

/**
 * Created by admin on 21.12.2015.
 */
public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep(){
        System.out.println("Spoki noki!!!");
    }
    public void eat(){
        System.out.println("je ne mange pas six jours");
    }
    public String say(String aWord){
        String petResponse = "ok! " + aWord;
        return petResponse;
    }
}
