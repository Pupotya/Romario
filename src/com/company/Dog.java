package com.company;

/**
 * Created by admin on 15.12.2015.
 */
public class Dog {
    private String klichka = "Vasya";
    private int age;
    private int weight;
    public static final int LEGS = 8;

    public int getWeight() {
        return weight;
    }
public Dog (){
    age = 1;
    weight = 3;
    klichka = "Karlik";
}
    public Dog (String klichka){
        this.klichka = klichka;
    }
    public Dog (String klichka,int age,int weight){
        this.age = age;
        this.klichka = klichka;
        this.weight = weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKlichka(String klichka) {
        this.klichka = klichka;
    }
    public String getKlichka() {
        return klichka;
    }


}
