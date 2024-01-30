package Seminar1;

import java.time.LocalDate;

public class Turtule extends Animal {
    int shellSize;
    public Turtule(String name, LocalDate birthday, Illness illness, int shellSize) {
        super(name, birthday, illness);
        this.shellSize = shellSize;
    }
    @Override
    protected void fly() {
        System.out.println("Черепахи не летают");
    }
}
