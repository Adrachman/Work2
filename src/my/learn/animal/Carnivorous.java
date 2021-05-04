package my.learn.animal;
//Хищные


import my.learn.food.Food;
import my.learn.food.Grass;
import my.learn.food.Meat;

public abstract class Carnivorous extends Animal{
    public void eat(Food food){
        if (food instanceof Meat){
            System.out.println("Данное животное ест мясо");
        } else {
            System.out.println("Данное животное не ест траву");
        }
    }
}
