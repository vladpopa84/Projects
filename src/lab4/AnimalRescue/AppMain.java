package lab4.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Duck Daffy = new Duck();

        System.out.println(Daffy.talk());

        Daffy.setAge(2);
        int age = Daffy.getAge();
        System.out.println(age);

        Daffy.setHealthiness(7);
        int health = Daffy.getHealthiness();
        System.out.println(health);

        Dog Azorel = new Dog();

        Azorel.setName("Labus");

        String name = Azorel.getName();
        System.out.println(name);

        Azorel.setFavoriteFood("Pedigree");
        String food = Azorel.getFavoriteFood();
        System.out.println(food);


        System.out.println(Azorel.bark());

        Azorel.barking();

        Azorel.setColor("brown");
        String color = Azorel.getColor();
        System.out.println(color);

        Azorel.setHungryness(100);
        int hungry = Azorel.getHungryness();
        System.out.println(hungry);

        System.out.println(Azorel.eyeColor);

        Azorel.otherEyeColor = "green";
        System.out.println(Azorel.otherEyeColor);


    }

}




