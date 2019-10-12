package lab2.AnimalRescue;

public class Animal {

    private String name = "Tom";

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    private int age = 2;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private int healthiness = 8;

    public int getHealthiness() {
        return healthiness;
    }

    public void setHealthiness(int healthiness) {
        this.healthiness = healthiness;
    }

    private int hungryness = 7;

    public int getHungryness() {
        return hungryness;
    }

    public void setHungryness(int hungryness) {
        this.hungryness = hungryness;
    }

    private int mood = 8;

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    private String favoriteFood = "Jerry";

    public String getFavoriteFood() {
        return favoriteFood;
    }


    private String favoriteActivity = "chase Jerry";

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}