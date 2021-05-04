package my.learn.hebrivore;

import my.learn.animal.Herbivore;
import my.learn.interfaceAnimal.Swim;

public class Zebra extends Herbivore implements Swim {
    public void swim(){
        System.out.println("Zebra swimming");
    }
}
