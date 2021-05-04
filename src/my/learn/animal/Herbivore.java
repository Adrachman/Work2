package my.learn.animal;
// Травоядные


import my.learn.food.Food;
import my.learn.food.Grass;
import my.learn.food.Meat;

public abstract class Herbivore extends Animal {
    public void eat(Food food){
        if (food instanceof Grass){
            System.out.println("Данное животное ест траву");
        } else {
            System.out.println("Данное животное не ест мясо");
        }
    }
}
