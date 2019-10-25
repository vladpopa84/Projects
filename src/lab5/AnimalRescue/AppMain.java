package lab5.AnimalRescue;

import lab4.AnimalRescue.Duck;

public class AppMain {
    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.Talk();

        dog.Move();

        Animal cat = new Cat();
        cat.Talk();
        cat.Move();
    }


}




