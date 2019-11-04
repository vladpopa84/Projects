package lab6.AnimalRescue;

 public abstract class Animal {


    public abstract void sleepSound();

    public abstract void eat();


    public void Talk() {
        System.out.println("Sound");
    }

    public void Move() {
        System.out.println("Moving");
    }
}

interface Animal2 {

     public void soudSleep();

     public void eat();
}