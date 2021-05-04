package my.learn.carnivorous;

import my.learn.animal.Carnivorous;
import my.learn.interfaceAnimal.Swim;

public class Fish extends Carnivorous implements Swim {
    public String getAnimalName(){
        return "fish";
    }
    public void swim(){
        System.out.println("Рыба плавает");
    }

    public String eat(){
        return "I am fish, a eating Meet";
    }
}
