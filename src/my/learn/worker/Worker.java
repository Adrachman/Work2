package my.learn.worker;

import my.learn.animal.Animal;
import my.learn.animal.Herbivore;
import my.learn.food.Food;
import my.learn.interfaceAnimal.Voice;

public class Worker {
    public void feed(Animal animal, Food food){
        animal.eat(food);
    }
    public void getVoice(Voice animal){
            System.out.println(((Voice) animal).voice());
    }
}
