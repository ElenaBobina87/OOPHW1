

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {

    String color;

    public Fish(String name, LocalDate birthday, Illness illness, String color) {
        super(name, birthday, illness);
        this.color = color;
    }
    public Fish() {
        
    }

    @Override
    public double swim() {
        return 30;
    }
    
    
    
}
