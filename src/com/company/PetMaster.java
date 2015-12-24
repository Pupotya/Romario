package com.company;

/**
 * Created by admin on 21.12.2015.
 */
public class PetMaster {
    public static void main (String [] args){
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Joli Pali!!!!");
        System.out.println(petReaction);
        myPet.sleep();
    }

}
