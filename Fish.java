package Seminar1;

import java.time.LocalDate;

public class Fish extends Animal {

    String color;

    public Fish(String name, LocalDate birthday, Illness illness, String color) {
        super(name, birthday, illness);
        this.color = color;
    }
    
    @Override
    protected void fly() {
        System.out.println("Только летучии рыбы могут планировать, но даже они не летают");
    }

    @Override
    protected void toGo() {
        System.out.println("Рыба не может бегать");
    }
}
