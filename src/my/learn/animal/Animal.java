package my.learn.animal;

import my.learn.food.Food;

public abstract class Animal {

    public String getAnimalName(){
        return "animal";
    }

    @Override
    public String toString() {
        return getAnimalName();
    }

    public void run(){
        System.out.println("run");
    }

    public void eat(Food food){
        System.out.println("Есть еду");
    }

}
