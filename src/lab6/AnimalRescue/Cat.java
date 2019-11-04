package lab6.AnimalRescue;

public class Cat extends Animal {

    @Override
    public void sleepSound() {
        System.out.println("Grrrr");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }

    public void Talk() {

        System.out.println("Meuw");
    }

    public void Move() {

        System.out.println("Run Jump Run");
    }


}

class Cat2 implements Animal2 {

    @Override
    public void soudSleep() {
        System.out.println("Grrr");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }
}