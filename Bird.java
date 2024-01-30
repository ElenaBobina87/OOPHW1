package Seminar1;

import java.time.LocalDate;



public class Bird extends Animal {

    private int wingQuantity;

    public Bird(String name, LocalDate birthday, Illness illness, int wingQuantity) {
        super(name, birthday, illness);
        this.wingQuantity = wingQuantity;
    }
}
