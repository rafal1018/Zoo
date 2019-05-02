package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal bear = new Bear("Yogi", 200, 40);
        Animal tiger = new Tiger("Jataka", 150, 25);
        Animal wolf = new Wolf("Howler", 70, 40);
        Animal dog = new Dog("Scooby", 30);

        List<Animal> animals = new ArrayList<>();

        animals.add(bear);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(dog);


        List<Animal> howlers = new ArrayList<>();

        howlers.add(wolf);
        howlers.add(dog);

        for (Animal a : animals) {
            System.out.println(a.getId()
                    + " : My name is "
                    + a.getName()
                    + "."
                    + " I weight "
                    + a.getWeight()
                    + " and my fur length is "
                    + a.length());
        }

        for (Animal a : howlers){
            System.out.println("My name is "
                    + a.getName()
                    + " and I am barking: "
                    + a.bark());
        }

        ((Dog) dog).sitPretty();
    }
}
