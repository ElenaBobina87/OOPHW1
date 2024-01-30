package Seminar1;

import java.time.LocalDate;

public class Bat extends Animal {

    int wingspan;
   

    public Bat(String name, LocalDate birthday, Illness illness, int wingspan) {
        super(name, birthday, illness);
        this.wingspan = wingspan;
    }

    
    @Override
    protected void fly() {
        System.out.println("Летучии мыши не плавают");
    }
}
