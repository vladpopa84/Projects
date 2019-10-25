package lab5.AnimalRescue;

import lab5.AnimalRescue.Animal;

public class Cat extends Animal {

    String color= "blue";
    String name= "Tom";
    int age= 2;
    Float weight= 7f;
    char gender= 'm';

    public void Talk() {
        System.out.println("Meuw");
    }

    public void Move() {
        System.out.println("Run Jump Run");
    }


}
