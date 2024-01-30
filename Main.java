package Seminar1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020, 03, 20), new Illness("Лишай"));
        System.out.println(cat.getName());
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
        Animal animal = new Animal();
        Animal dog = new Dog("Шарик", LocalDate.of(2019, 04, 23), new Illness("Бешенство"));
        System.out.println(dog.getType());
        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("Кеша", LocalDate.of(2021, 05, 30), null, 2));
        System.out.println(list);
        dog.lifeCycle();
        Bat bat = new Bat("Жак", LocalDate.of(2023, 11, 20), null, 6);
        bat.fly();
        bat.swim();
        bat.toGo();
    }

    
}
