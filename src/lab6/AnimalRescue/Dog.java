package lab6.AnimalRescue;

public class Dog extends Animal {


    @Override
    public void sleepSound() {
        System.out.println("zzzZZZzzz");
    }

    @Override
    public void eat() {
        System.out.println("Bones");
    }

    public void Talk() {
        System.out.println("Ham Ham");
    }

    public void Move() {
        System.out.println("Running");
    }


}

class Dog2 implements Animal2 {

    @Override
    public void soudSleep() {
        System.out.println("zzzZZZzzz");
    }

    @Override
    public void eat() {
        System.out.println("Bones");
    }
}

